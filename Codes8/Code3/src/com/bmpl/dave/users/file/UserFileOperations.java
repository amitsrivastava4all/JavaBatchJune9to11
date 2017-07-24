package com.bmpl.dave.users.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.bmpl.dave.users.dto.UserDTO;

public class UserFileOperations {
	
	public static String objectRead(UserDTO userDTO) throws IOException, ClassNotFoundException{
		String message = "Invalid Userid or Password";
		String path  ="/Users/amit/Documents/FileOutput/myusers.dat";
		FileInputStream fs = new FileInputStream(path);  // Read bytes from file
		ObjectInputStream os = new ObjectInputStream(fs); // Read Bytes and convert into Objects
		try{
		UserDTO userObject = (UserDTO)os.readObject(); //Here Convert Byte into Object
		if(userObject.getUserid().equals(userDTO.getUserid()) && userObject.getPassword().equals(userDTO.getPassword()))
		{
			message = "Welcome "+userDTO.getUserid();
		}
		return message;
		}
		finally{
			if(os!=null){
				os.close();
				
			}
			if(fs!=null){
				fs.close();
			}
		}
			
	}
	
	public static String objectWrite(UserDTO userDTO) throws IOException{
		String result = "Register SuccessFully";
		String path  ="/Users/amit/Documents/FileOutput/myusers.dat";
		FileOutputStream fs = new FileOutputStream(path);  // Write Bytes in a file
		ObjectOutputStream os = new ObjectOutputStream(fs);
		try{
		os.writeObject(userDTO);  // Convert Object into Bytes and give Bytes to fs 
		}
		finally{
			if(os!=null){
				os.close();
			}
			if(fs!=null){
				fs.close();
			}
		}
		return result;
		
	}
	
	
	public static void readFile(String path) throws IOException{
		final int EOF  = -1;
		File file = new File(path);
		if(!file.exists()){
			System.out.println("File not exist so can't read it");
			return ;
		}
		FileInputStream fs = new FileInputStream(file);
		
		try{
			int singleByte =0;
			do{
			 singleByte = fs.read();
			System.out.print((char) singleByte);
		}while(singleByte!=EOF);
			/*int singleByte = fs.read();
		while(singleByte!=EOF){
			System.out.print((char) singleByte);
			singleByte = fs.read();
		}*/
		}
		finally{
			// this is block which always execute...
			// resource clean up code
			if(fs!=null){
			fs.close();
			}
		}
		
		
	}
	
	public  static void writeFile(String data){
		//String path = "d:\\foldername\\filename.txt"
		String path = "/Users/amit/Documents/FileOutput/Xyz.txt";
		File file = new File(path);
		FileOutputStream fs  =null;
		
		if(file.exists()){
			System.out.println("File Already Exist ,Can't Override it");
			return ;
		}
		else{
			try {
				if(file.createNewFile()){
					System.out.println("Going to create a new file");
					if(10>2){
					return ;
					}
					fs= new FileOutputStream(file);
					fs.write(data.getBytes());  //throw new IOException(); 
					//System.exit(0); finally not call
					//return ;
				}
			} catch (IOException e) {
				path = "/Users/amit/Documents/FileOutput/Abc.txt";
				file = new File(path);
				try {
					file.createNewFile();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				System.out.println("File Can't Be Created ,Contact to System Admin");
			}
			finally{
				System.out.println("Finally Call Going to close the file...");
				try {
					if(fs!=null){
					fs.close();
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		//writeFile("Hello this is test to store some data in a file");
		readFile("/Users/amit/Documents/Java9JuneBatch/CameraEffect/src/com/bmpl/dave/users/file/UserFileOperations.java");
	}

}
