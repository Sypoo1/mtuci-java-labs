import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.Random;


public class WarehouseTransfer {
    private static final int NUM_LOADERS = 3;
    private static final int MAX_WEIGHT = 150;
    private static final int NUM_PRODUCTS = MAX_WEIGHT * NUM_LOADERS;
    private static AtomicInteger index = new AtomicInteger(0); // Use AtomicInteger

    public static void main(String[] args) {
        int[] weights = generateWeights(NUM_PRODUCTS);

        Lock weightsLock = new ReentrantLock();
        CyclicBarrier barrier = new CyclicBarrier(NUM_LOADERS, () -> {
            System.out.println("Все грузчики доставили товары на другой склад");
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread[] loaders = new Thread[NUM_LOADERS];
        for (int i = 0; i < NUM_LOADERS; i++) {
            loaders[i] = new Thread(new Loader(weightsLock, barrier, MAX_WEIGHT, weights));
            loaders[i].start();
        }

        for (Thread loader : loaders) {
            try {
                loader.join();
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
//        System.out.println(Arrays.toString(weights));
        System.out.println("Все грузчики завершили работу");
    }

    static class Loader implements Runnable {
        private final Lock weightsLock;
        private final CyclicBarrier barrier;
        private final int maxWeight;
        private final int[] weights;
        private boolean needToLoad = true;
        public Loader(Lock weightsLock, CyclicBarrier barrier, int maxWeight, int[] weights) {
            this.weightsLock = weightsLock;
            this.barrier = barrier;
            this.maxWeight = maxWeight;
            this.weights = weights;
        }

        @Override
        public void run() {
            int currentWeight = 0;

            while (needToLoad) {
//                System.out.println(Thread.currentThread().getName());
                weightsLock.lock();
                try {

                    int currentIndex = index.getAndIncrement();
                    if (currentIndex < NUM_PRODUCTS && currentWeight + weights[currentIndex] <= maxWeight) {
                        currentWeight += weights[currentIndex];
                        Thread.sleep(350);
                        System.out.println("Грузчик " + Thread.currentThread().getName() + " поднял " + weights[currentIndex] + " кг товара, всего " + currentWeight);
                        // Удаляем вес товара из массива, чтобы другие грузчики не могли взять его
                        weights[currentIndex] = 0;

                    } else {
                        needToLoad = false;
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                } finally {
                    weightsLock.unlock();
                }
            }

            try {
                barrier.await(); // Грузчик ждет остальных перед разгрузкой на другом складе
                System.out.println("Грузчик " + Thread.currentThread().getName() + " разгружает товары на другом складе");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private static int[] generateWeights(int numProducts) {
        int[] weights = new int[numProducts];
        for (int i = 0; i < numProducts; i++) {
            Random rand = new Random();
            int randomNum = rand.nextInt(30) + 1;
            weights[i] = randomNum;
        }
//        System.out.println(Arrays.toString(weights));
        return weights;
    }
}
