package Application;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadApplication {

    public static void main(String[] args) {
        final File file = new File("C:\\Users\\user1\\Desktop\\dog.png");
        final long contentLength = file.length();
        try {
            final FileInputStream fis = new FileInputStream(file);
            int readBytes;
            final byte[] bytes = new byte[4096];
            while ((readBytes = fis.read(bytes)) != -1) {
                // bytes
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}