import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

import java.io.OutputStream;

public class Server {

	public static void main(String[] args) throws IOException {
		final int PORTNO = 9111;
		ServerSocket server =  new ServerSocket(PORTNO);
		System.out.println("Server Start....");
		System.out.println("Waiting for Client....");
		Socket socket = server.accept();
		System.out.println("Client Comes on Server");
		System.out.println("Enter the Message Send to the Client");
		String message = new Scanner(System.in).nextLine();
		OutputStream out  = socket.getOutputStream();
		out.write(message.getBytes());
		out.close();
		socket.close();
		System.out.println("Message Send to Client....");
	}

}
