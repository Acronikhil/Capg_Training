package dayfive.assignment;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pattern p = Pattern.compile("[A-za-z0-9]");
		Matcher match = p.matcher("asdAAXZ123");

		System.out.println(Pattern.matches("[A-za-z0-9]{1,}", "123AScds"));

		System.out.println(
				Pattern.matches("^[a-zA-Z0-9.]*[a-z0-9]{4,}@[a-z]{3,}.[a-z]{2,}$", "20.nikhildubey@gmail.com"));

	}

}
