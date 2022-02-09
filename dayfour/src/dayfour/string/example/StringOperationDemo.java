package dayfour.string.example;

public class StringOperationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Hello = "Hello ";
		String name = "Nikhil";
		String Hi = "    Hii   Helllo    ";
		String empty = "";
		
		
		System.out.println("Length of Hello -------- "+Hello.length());
		System.out.println("Index of e ------- "+Hello.indexOf('e'));
		System.out.println("Index of l ------- "+Hello.indexOf('l'));
		System.out.println("Substring from Hello ------- "+Hello.substring(1));
		System.out.println("Substring from Hello ------- "+Hello.substring(1,3));
		
//		Remove White spaces
		// Trim removes Trailing and Leading White spaces not the middle one
		System.out.println("Without trim Hi: "+Hi );
		System.out.println("Removing white spaces: "+Hi.trim());
	
		// Using Strip Method
		
		System.out.println("Strip Method: "+ Hi.strip());
		System.out.println("Strip Indent Method: "+ Hi.stripIndent());
		System.out.println("Strip Leading Method: "+ Hi.stripLeading());
		System.out.println("Strip Trailing Method: "+ Hi.stripTrailing());
		
//		Replace All
		
		Hi=Hi.replaceAll("\\s", "");
		System.out.println("Replace White spaces: "+Hi);
		
		
//		Is empty or not
		System.out.println("Check isEmpty: "+ empty.isEmpty());// Introduced in JDK 6 
		System.out.println("Check isBlank: "+ empty.isBlank());
		
//		Concatination
		System.out.println("Printing Hello Nikhil: "+Hello.concat(name));
		
//		Lower and Upper Case
		System.out.println("To Lower case: "+Hello.toLowerCase());
		System.out.println("To Lower case: "+Hello.toUpperCase());
	
//		Paragraph in java
		
		String paragraph = "Hello Everyone, Today is very woderfull sunny day. We are leraing core java.";
		
		for (String sentence:paragraph.split("[.]")) {
			System.out.println(sentence);
		}
	
	}
	

	
	
	
	
//	Before JDK 6 we use to check string is empty by making such custom method
	
	private static void checkStringIsEmpty(String str) {
		if (str.equals("")) {
			System.out.println("String is empty");
		}
	}

}
