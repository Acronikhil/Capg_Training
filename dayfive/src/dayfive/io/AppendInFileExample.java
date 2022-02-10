package dayfive.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class AppendInFileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
			try {
				String data = "Its intresting to learn IO";
				
				File file = new File("D:\\Capg Training\\L&D\\My Data\\Capg_TrainingDay3\\dayfive\\resources\\BufferedWriter.txt");
				
				if(!file.exists()) {
					file.createNewFile();
				}
				
					//Writer
				FileWriter fw = new FileWriter(file, true);
				BufferedWriter bw = new BufferedWriter(fw);
				bw.append(data);
				bw.close();
				
					//Reader
				FileReader fr = new FileReader(file);
				BufferedReader br = new BufferedReader(fr);
				System.out.println(br.readLine());
				br.close();
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	

}
