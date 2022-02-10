package dayfive.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileExample {

	public static void main(String[] args) {

		String filePath = "D:\\Capg Training\\L&D\\My Data\\Capg_TrainingDay3\\dayfive\\resources\\RandomAccessFileExample.txt";
		String data = "Hello every one! We will be having break.";
		int position = 5;
		int size= 10;
		
			// WriteToFile
		
		writeToAFile(filePath, data, 0);
		
		
			//ReadToFile
		
		readFromAFile(filePath, position, size);

	}
	
	private static void readFromAFile(String filePath, int position, int size) {
		
		try {
			File file = new File(filePath);
			RandomAccessFile raf = new RandomAccessFile(file,"r");
			raf.seek(position); // seek the cursor position
			byte[] bytes = new byte[size];
			raf.read(bytes);
			System.out.println(new String(bytes));
			raf.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static void writeToAFile(String filePath, String data, int position) {
		
		try {
			File file = new File(filePath);
			RandomAccessFile raf = new RandomAccessFile(file,"rw");
			raf.seek(position);
			raf.write(data.getBytes());
//			raf.writeUTF(data);
			raf.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
