import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import javax.swing.ButtonGroup;

public class Downloader {
	public static String fullPath=""; 
	private static String getURLLastName(String url){
		int index = url.lastIndexOf("/");
		return url.substring(index);
	}
	
	static String doDownload(String urlVal, String path) throws IOException{
		String result = "";
		String fileName = getURLLastName(urlVal);
		path = path +fileName;
		fullPath = path;
		FileOutputStream fs = new FileOutputStream(path);
		
		BufferedOutputStream bs = new BufferedOutputStream(fs);
		final int EOF = -1;
		System.out.println("Write Start....");
		long startTime = System.currentTimeMillis();
		URL url = new URL(urlVal); // HTTP Protocol Call
        URLConnection connection = url.openConnection();
        connection.connect();
        System.out.println("Connection Created...");
        InputStream is = connection.getInputStream();
        BufferedInputStream bi = new BufferedInputStream(is);
        
        int singleByte = bi.read();
        while(singleByte!=EOF){
        	bs.write(singleByte);	
        	//System.out.print((char)singleByte);
        		singleByte = bi.read();
        	
        }
        System.out.println("Write Done...");
        long endTime = System.currentTimeMillis();
        System.out.println("Time Taken "+(endTime-startTime)+"ms");
        bi.close();
        bs.close();
        is.close();
        fs.close();
        result = "Download Completed...";
		return result;
	}
	public static void main(String[] args) throws IOException {
		
		
	}

}
