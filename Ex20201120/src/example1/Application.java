package example1;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Application {
	
	//localhost:8081
	
	private static final int PORT = 8081;

	public static void main(String[] args) {
		try {
			final ServerSocket serverSocket = new ServerSocket(PORT);
			Socket socket;
			while ((socket = serverSocket.accept()) != null) {
				System.out.println("누군가 접속함.");
				final InputStream in = socket.getInputStream();
				final InputStreamReader isr = new InputStreamReader(in);
				final BufferedReader br = new BufferedReader(isr);
				
				//br.readLine() 요청라인, 요청 헤더. 문자열 "" 만날 때 까지 읽기.
				
				String Line;
				while (!"".equals)
			}
		}	catch (IOException e ) {
			e,printStackTrace();
		}
	}

}
