//멀티 채팅 서버 //

package server;
						
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Application {

    // 포트번호: 0 ~ 65535
    private static final int PORT = 12345;

    public static void main(String[] args) {
        try {
            final ServerSocket serverSocket = new ServerSocket(PORT);
            Socket clientSocket;
            while ((clientSocket = serverSocket.accept()) != null) {
                ClientManager.registerClient(clientSocket);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
