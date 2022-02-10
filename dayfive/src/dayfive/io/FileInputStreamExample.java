package dayfive.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Input Stream & Output Stream api classes to perform IO in your program
					// Input Stream to read data from source & Output Stream is to write data to destination

				// Write a byte in a file
				
				try {
					
					FileInputStream fis = new FileInputStream("D:\\Capg Training\\L&D\\My Data\\Capg_TrainingDay3\\dayfive\\resources\\output2.txt");
//					byte bArr[] = fis.readAllBytes();
					
					int i=0;
					while((i= fis.read())!= -1) {
						System.out.print((char) i);
					}
					
//					System.out.println("OUT");
//					
//					for(byte x : bArr) {
//						System.out.print((char) x);
//					}
					fis.close();
					
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}catch (IOException e) {
					e.printStackTrace();
				}
	}

}
