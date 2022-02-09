package dayfour.assignment;

public class ThirdQue {

	
	public String swap(String str, int i,int j) {
		char ch;
		char[] charArray = str.toCharArray();
		ch = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = ch;
		
		return String.valueOf(charArray);
		
		
		
	}
	
	public void permute(String str, int beg , int end) {
		if(beg == end-1) {
			System.out.println(str);
		}
		else {
			for(int i= beg ; i < end ; i++) {
				str = swap(str, beg , i); // swap
				permute(str, beg +1, end); // recursive call
				str = swap(str, beg, i); // backtracking
			}
		}
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "xyz";
		int len = str.length();
		
		
		ThirdQue tq = new ThirdQue();
		tq.permute(str, 0, len);
		
	}

}
