package daythree.controlstatements;

public class CountinueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] listOfNames = {"Nikhil","null","Payas" , "Esha", "Jyotika"};
		
		for(int i=0; i< listOfNames.length; i++) {
			if (listOfNames[i].equals("null"))
			continue;
			System.out.println(listOfNames[i]);
		}
		
	}

}
