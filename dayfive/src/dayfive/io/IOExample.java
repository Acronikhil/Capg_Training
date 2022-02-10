package dayfive.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOExample {

	public static void main(String[] args) {
			// Input Stream & Output Stream api classes to perform IO in your program
			// Input Stream to read data from source & Output Stream is to write data to destination

		// Write a byte in a file
		
		try {
			
			String str = "Hello Nikhil";
			
			FileOutputStream fout = new FileOutputStream("D:\\Capg Training\\L&D\\My Data\\Capg_TrainingDay3\\dayfive\\resources\\output1.txt");
			fout.write(1513543553);
			byte byteArr[] = str.getBytes();
			fout.write(byteArr);			
			fout.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
