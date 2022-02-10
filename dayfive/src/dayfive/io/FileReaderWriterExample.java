package dayfive.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
				//Writer Example
			
			FileWriter fw = new FileWriter("D:\\Capg Training\\L&D\\My Data\\Capg_TrainingDay3\\dayfive\\resources\\writerExapmle.txt");
			fw.write("Hello Everypne! We are Studying Java.");
			fw.close();
			
			
				//Reader Example
			
			FileReader fr = new FileReader("D:\\Capg Training\\L&D\\My Data\\Capg_TrainingDay3\\dayfive\\resources\\writerExapmle.txt");
			int i=0;
			while((i = fr.read())!= -1) {
				System.out.print((char)i);
				
			}
			
			fr.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
