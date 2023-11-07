import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Integer[] firstArray = {1, 2, 3};
        ArrayAverage.arrayAverage(firstArray, 3);
        Integer[] secondArray = {1, 2, 3} ;
        ArrayAverage.arrayAverage(secondArray, 10);
        String[] thirdArray = {"hi", "hello", "good morning"};
        ArrayAverage.arrayAverage(thirdArray, 3);
        System.out.println("");

        FileCopy.fileCopy("files/fileA.txt", "files/fileB.txt");
        FileCopy.fileCopy("FileNotFound.txt", "files/fileB.txt");
        System.out.println("");

        CustomStack myStack = new CustomStack();
        try {
            System.out.println(myStack.peek());
        } catch (CustomEmptyStackException exception) {
            System.out.println(exception.getMessage());
        }
        try{
            System.out.println(myStack.pop());
        }catch (CustomEmptyStackException exception){
            System.out.println(exception.getMessage());
        }
        try{
            myStack.push(1);
            System.out.println(myStack.pop());
            System.out.println(myStack.pop());
        }catch (CustomEmptyStackException exception){
            System.out.println(exception.getMessage());
        }
    }
}