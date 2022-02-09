package dayfour.assignment;

public class SecondQuestion {

	String str = "Nikhil Dubey";
	char vovels[] = {'A','E','I','O','U'};
//	int count = 0 ;
	
	
//	char arr[] = str.toCharArray();
	
	
	public void findVovels() {
		
		str = str.toUpperCase();
		
		for(int i=0 ; i< vovels.length; i++)
		{
			int count=0;
			for(int j =0 ; j< str.length() ; j++) {
				if(str.charAt(j) == vovels[i] ) {
					count++;
				}
				
			}System.out.println(vovels[i]+" - "+count);
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SecondQuestion sq = new SecondQuestion();
		sq.findVovels();
	}

}
