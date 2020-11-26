package client;

/**
 * Ŭ���̾�Ʈ. �������� �װ� ����..!
 */
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * Ŭ���̾�Ʈ. �������� �װ� ����..!
 */
public class Application {

    // ������ `����` �ּ�
    private static final String IP_ADDRESS = "localhost";
    // ������ ���� ��Ʈ
    private static final int PORT = 12345;

    public static void main(String[] args) {
        try {
            // 1. ����
            final Socket socket = new Socket(IP_ADDRESS, PORT);
            final ListenerThread listener = new ListenerThread(socket);
            listener.start();

            while (true) {
                sendMessage(socket.getOutputStream());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void sendMessage(OutputStream out) throws IOException {
        final Scanner scanner = new Scanner(System.in);
        System.out.print("�Է� > ");
        final String messageToSend = scanner.nextLine();
        out.write(messageToSend.getBytes(StandardCharsets.UTF_8));
        out.flush();
    }
}
