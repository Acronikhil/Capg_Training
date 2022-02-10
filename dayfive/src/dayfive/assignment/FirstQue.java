package dayfive.assignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FirstQue {

	public static void main(String[] args) throws FileNotFoundException{
		// TODO Auto-generated method stub
		
		String path = "D:\\Capg Training\\L&D\\My Data\\Capg_TrainingDay3\\dayfive";
		
		int len = path.length() ;
		int exit = 5;
		
		Scanner sc = new Scanner(System.in);
		
		while(exit != 1) {
			
		String directory = "";
		String filename = "";
		String fileExtension = "";
	
		
		System.out.println("Enter the Directory name to find: ");
		
		directory =	sc.nextLine();
			
		System.out.println("Enter the file name to find: ");
		filename =	sc.nextLine();

		System.out.println("Enter the file extension: ");
		fileExtension =	sc.nextLine();
		
		path = path+"\\"+directory+"\\"+filename+"."+fileExtension;
		String replace = new String("\\"+directory+"\\"+filename+"."+fileExtension);
		
		
//		
		
		File file = new File(path);
		try {
		if(file.exists()) {
			System.out.println("File Exists\nAt path: "+ path);
		}
		else {
			
//			System.out.println(path.replace(filename, fileExtension));
			
			System.out.println("File Does not exists\nAt path: "+path);
			 
			
			FileNotFoundException fnfe = new FileNotFoundException("File Not found in current Directory.");
			throw fnfe;
		}
		System.out.println("To Exit press 1 else press any key.");
		exit = sc.nextInt();
		sc.nextLine();
		path = path.replace(replace, "");
		
		
		System.out.println("Path: "+path);
		}catch(FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		}
		
		}
		sc.close();
		
		
		System.out.println("Thank You!");
	}

}
