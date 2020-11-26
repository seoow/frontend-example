package example2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URLConnection;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathExample {

    public static void main(String[] args) {
        final Path webRoot = Paths.get("C:\\Users\\My\\Desktop");
        // /think-twice.png
        final String thinkTwice = "aaa.jpg";   // URI (��û ���ο���)
        final Path ori = webRoot.resolve(thinkTwice);   // ������
        // System.out.println(ori.toUri());
        final File oriFile = new File(ori.toUri());
        try (FileInputStream fis = new FileInputStream(oriFile)) {
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(oriFile.getAbsolutePath());
        final String mimeType = URLConnection.guessContentTypeFromName(oriFile.getAbsolutePath());
        System.out.println(mimeType);
    }
}
