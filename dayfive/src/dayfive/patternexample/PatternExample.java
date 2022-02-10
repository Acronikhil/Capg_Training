package dayfive.patternexample;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternExample {

	//	"abc adef fed abc de ghji" ---- abc def 
	//	Pattern "abc def" we want to search in above String or character sequence 
	// In java we have Pattern api or class and it provides us methods to sear
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 	Pattern.compile method Comile the given regular expression into a pattern.
		 * 	.a is a regular expression
		 * 
		 * */
		
		Pattern p = Pattern.compile(".a");	// .a is a regex representing a single character 
		
		Matcher m = p.matcher("pa");
		boolean matches = m.matches();
		System.out.println(matches);
		
//		boolean 
	}

}
