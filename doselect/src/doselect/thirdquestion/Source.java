package doselect.thirdquestion;

public class Source {
	// Implement the two function given in description in here...

	public String handleException(Activity a) throws NullPointerException {

		try {
			if (a.string1 == null || a.string2 == null) {
				throw new NullPointerException();

			} else if (!(a.operator.equals("+") && a.operator.equals("-"))) {
				throw new Exception();

			}
		} catch (NullPointerException npe) {
			npe.printStackTrace();
			return "Null values found";
		} catch (Exception e) {
			e.printStackTrace();
			return a.operator;
		}
		return "No Exception Found";
	}

	public String doOperation(Activity a) {
		String result = "";
		switch (a.operator) {
		case "+": {
			result = a.string1.concat(a.string2);
			System.out.println(result);
			break;
		}
		case "-" :{
			result = a.string1.replace(a.string2, "");
			System.out.println("In -:"+result);
			break;
		}
		}
		
		return result;
	}

	
	public String searchForJob(int age, String highestQualification){
		try{
		if(age >= 200 || age <= 0){
			throw new NotEligibleException("The age entered is not typical for a human being");
		}
		else{
			return	CompanyJobRepository.getJobPrediction(age, highestQualification);
		}
		}catch(NotEligibleException nee){
			return nee.getMessage();
		}

	}
	
	public static void main(String args[]) throws Exception {
		Source s = new Source();
//		Activity a = new Activity("Nikhil","Dubey","+");
//		System.out.println(s.doOperation(a));
		
		System.out.println(s.searchForJob(19, "BTech"));
		
		
		
		
	}
}
