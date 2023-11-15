import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String s = "Фото";

        try (FileOutputStream outputStream = new FileOutputStream("hello.png")) {
            byte[] bytes =s.getBytes();
            outputStream.write(bytes,0,bytes.length);
            System.out.println("Успешно");
            } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}