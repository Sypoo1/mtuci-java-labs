public class ArrayAverage {
    public static <A> void arrayAverage(A[] array, int length){
        int sum = 0;
        try {
            for (int index = 0; index < length; index++){
                sum += (Integer) array[index];
            }
            System.out.println("Array average is " + sum / length);
        } catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("Сработало исключение ArrayIndexOutOfBoundsException с сообщением: " + exception.getMessage());
        } catch (ClassCastException exception){
            System.out.println("Сработало исключение ClassCastException с сообщением: " + exception.getMessage());
        }
    }
}
