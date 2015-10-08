package cis232.classlab;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class SecretDecoder {

	public static void main(String[] args) throws IOException{
		System.out.println("What is the key?");
		int key = new Scanner(System.in).nextInt();
		
		DataInputStream dis = new DataInputStream(new FileInputStream("secret.msg"));
		String encMessage = dis.readUTF();
		dis.close();
		
		for(int i = 0; i < encMessage.length(); i++){
			System.out.print((char)(encMessage.charAt(i) - key));
		}
	}

}
