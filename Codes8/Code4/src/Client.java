import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
public static void main(String[] args) throws UnknownHostException, IOException {
	final String serverIP = "localhost";
	final int PORTNO = 9111;
	Socket socket = new Socket(serverIP,PORTNO);
	InputStream is = socket.getInputStream();
	DataInputStream ds = new DataInputStream(is);
	System.out.println(ds.readUTF());
	/*int singleByte = is.read();
	while(singleByte!=-1){
		System.out.print((char)singleByte);
		singleByte = is.read();
	}*/
	ds.close();
	is.close();
	socket.close();
}
}
