package example1;

import java.io.*;

public class BufferedReaderExample {

    public static void main(String[] args) {
        try (InputStream in = new FileInputStream("C:\\Users\\user1\\Desktop\\abc.txt")) {
            final InputStreamReader isr = new InputStreamReader(in);
            final BufferedReader br = new BufferedReader(isr);
            System.out.println("v: " + br.readLine());
            System.out.println("v: " + br.readLine());
            System.out.println("v: " + br.readLine());
            System.out.println("v: " + br.readLine());
            System.out.println("v: " + br.readLine());
            System.out.println("v: " + br.readLine());
            System.out.println("v: " + br.readLine());
            System.out.println("v: " + br.readLine());
            System.out.println("v: " + "".equals(br.readLine()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
