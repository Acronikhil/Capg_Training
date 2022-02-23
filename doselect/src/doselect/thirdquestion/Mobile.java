package doselect.thirdquestion;

import java.util.ArrayList;
import java.util.HashMap;

public class Mobile{
    // Write your code here..
	HashMap<String, ArrayList<String>> mobiles = new HashMap<>();

	public String addMobile(String company, String model){
		ArrayList<String> modelList = new ArrayList<String>();
		

		if(mobiles.containsKey(company)){
			modelList = mobiles.get(company);
			modelList.add(model);
			mobiles.replace(company, modelList);
		}
		else {
			modelList.add(model);
			mobiles.putIfAbsent(company, modelList);	
		}
		
		return "model successfully added";

	}

	public ArrayList<String> getModels(String company){
		
		if(mobiles.containsKey(company)) {
			return mobiles.get(company);
		}
		
		return null;

	}

	public String buyMobile(String company, String model){
		ArrayList<String> arList = new ArrayList<String>();
		ArrayList<String> newList = new ArrayList<String>();
		boolean first = false;
		
		if(mobiles.containsKey(company)) {
			
			if(!arList.contains(model)) {
				return "item not available";
			}
			arList = mobiles.get(company);
			for(String mobile: arList) {
				if(mobile == model && first) {
					first =true;
					continue;
				}
				newList.add(mobile);
			}
		}
		mobiles.replace(company, newList);
		
		return "mobile sold successfully";

	}

}