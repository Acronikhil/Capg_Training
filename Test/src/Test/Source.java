package Test;

public class Source {

	public static String enc(String e) {
		String[] strArr = e.split(" ");
//		String[] strArr2  ;

		String s = "";
		int i = 0;
		for (String st : strArr) {
			char[] chArr = st.toCharArray();

			System.out.println(chArr);
			String tempString = "";
			for (char c : chArr) {
				Integer tmp = c + 3;

				if (tmp > 122) {
					Integer diff;
					diff = tmp - 122;
					tmp = 97 + diff - 1;
				} else if ( (c>=65 && c<=90) && tmp > 90) {
					Integer diff;
					diff = tmp - 90;
					tmp = 65 + diff - 1;
				}

				char tp = (char) tmp.byteValue();
				tempString += String.valueOf(tp);
			}
//			strArr2[i] = tempString.concat(" ");
			s += tempString.concat("_");
			i += 1;
//			System.out.println("tempString: "+tempString);
		}

//		String str = strArr2.toString();
		System.out.println(s.substring(0, s.length()-1));
		return s;
	}

	public static void main(String[] args) {

		char c = 81;
		System.out.println(c);

		System.out.println(Source.enc("Hi There Hows you"));

	}
}
