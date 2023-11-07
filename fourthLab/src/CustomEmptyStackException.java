import java.io.*;
public class CustomEmptyStackException extends Exception{
    public CustomEmptyStackException(){
        super();
    }
    public CustomEmptyStackException(String errorMessage) {
        super(errorMessage);

        try {
            FileOutputStream outputStream = new FileOutputStream("files/Exceptions.txt", true);
            byte[] strToBytes = (errorMessage + "\n").getBytes();
            outputStream.write(strToBytes, 0, strToBytes.length);
            outputStream.close();

        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }

}
