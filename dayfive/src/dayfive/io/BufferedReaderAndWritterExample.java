package dayfive.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReaderAndWritterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
				// Writting File
			
			FileWriter fw = new FileWriter("D:\\Capg Training\\L&D\\My Data\\Capg_TrainingDay3\\dayfive\\resources\\BufferedWriter.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("It is tooo much in java");
			
			bw.close();
	
			
				// Reading File
			
			FileReader fr = new FileReader("D:\\Capg Training\\L&D\\My Data\\Capg_TrainingDay3\\dayfive\\resources\\BufferedWriter.txt");
			BufferedReader br = new BufferedReader(fr);
			System.out.println(br.readLine());
			br.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
