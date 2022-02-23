package doselect.thirdquestion;

import java.util.ArrayList;
import java.util.Collections;

class ArrayListOps{
	public ArrayList<Integer> makeArrayListInt(int n){
		ArrayList<Integer> arrList = new ArrayList<>();
		while(n!= 0) {
			arrList.add(0);
			n-=1;
		}
//		for(int i:n){
//			arrList.add(0);
//		} 
		return arrList;
	}

	public ArrayList<Integer> reverseList(ArrayList<Integer> list){
		Collections.reverse(list);
		return list;
	}

	public ArrayList<Integer> changeList(ArrayList<Integer> list, int m, int n){
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		for(Integer l:list){
			if(l == m){
				arrList.add(n);
			}
			else{
				arrList.add(l);
			}
		}
		return arrList;
	}
}
