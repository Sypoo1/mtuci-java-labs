import java.io.*;
public class FileCopy {
    public static void fileCopy(String fromFileName, String toFileName) {
        FileInputStream from = null;
        FileOutputStream to = null;
        try {
            File fromFile = new File(fromFileName);
            File toFile = new File(toFileName);
            from = new FileInputStream(fromFile);
            to = new FileOutputStream(toFile);
            int n;
            while ((n = from.read()) != -1) {
                to.write(n);
            }
            System.out.println("Готово");
        } catch (FileNotFoundException exception) {
            System.out.println("Файл не найден " + exception.getMessage());
        } catch (IOException exception) {
            System.out.println("сработало исключение IOException " + exception.getMessage());
        } finally {
            try {
                if (from != null) {
                    from.close();
                }
                if (to != null) {
                    to.close();
                }
            } catch (IOException exception) {
                System.out.println("сработало исключение IOException " + exception.getMessage());
            }
        }
    }
}
