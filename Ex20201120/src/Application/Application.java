package Application;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

public class Application {

    // localhost:8081
    private static final int PORT = 8081;

    public static void main(String[] args) {
        try {
            final ServerSocket serverSocket = new ServerSocket(PORT);
            Socket socket;
            while ((socket = serverSocket.accept()) != null) {
                // 1. ��û�� �о ȭ�鿡 ���
                final InputStream in = socket.getInputStream();
                final BufferedReader br = new BufferedReader(new InputStreamReader(in));
                String line;
                while (!(line = br.readLine()).equals("")) {
                    System.out.println(line);
                }

                // 2. ���� ����
                // 2.1. ���� ���� �ۼ�
                final String statusLine = "HTTP/1.1 200 OK \r\n";

                // 2.2. �޼��� ���
                final Map<String, String> headers = new HashMap<>();
                headers.put("Content-Type", "image/png; image/jpeg;");
                final File file = new File("C:\\Users\\My\\Desktop\\aaa.jpg");
                final long contentLength = file.length();
                headers.put("Content-Length", String.valueOf(contentLength));

                // 2.3. �޼��� �ٵ�
                final OutputStream out = socket.getOutputStream();
                // 1. ���� ���� ����
                out.write(statusLine.getBytes(StandardCharsets.UTF_8));
                // 2. ���� ��� ����
                for (Map.Entry<String, String> e : headers.entrySet()) {
                    final String header =
                            String.format("%s: %s \r\n", e.getKey(), e.getValue());
                    out.write(header.getBytes(StandardCharsets.UTF_8));
                }
                // 3. ���� �ٵ�
                out.write("\r\n".getBytes(StandardCharsets.UTF_8));

                try(final InputStream fis = new FileInputStream(file)) {
                    int readBytes;
                    final byte[] buf = new byte[4096];
                    while ((readBytes = fis.read(buf)) != -1) {
                        out.write(buf);
                    }
                }

                out.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
