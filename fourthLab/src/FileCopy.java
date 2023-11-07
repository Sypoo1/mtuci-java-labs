import java.io.*;
public class FileCopy {
    public static void fileCopy(String fromFileName, String toFileName){
        try{
            File fromFile = new File(fromFileName);
            File toFile = new File(toFileName);

            FileInputStream from = new FileInputStream(fromFile);
            FileOutputStream to = new FileOutputStream(toFile);

            int n;
            while ((n = from.read()) != -1) {
                to.write(n);
            }

            from.close();
            to.close();

            System.out.println("Готово");

        } catch (FileNotFoundException exception) {
            System.out.println("Файл не найден " + exception.getMessage());
        } catch (IOException exception){
            System.out.println("сработало исключение IOException " + exception.getMessage());
        }

    }
}
