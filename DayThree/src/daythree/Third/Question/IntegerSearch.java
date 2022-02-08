package daythree.Third.Question;

public class IntegerSearch extends AbstractSearch {

	@Override
	public boolean search(Object[] obj_list, Object obj) {
		// TODO Auto-generated method stub
		for(Object x: obj_list)
		{
			if(x == obj) {
				return true;
			}
		}
		return false;
	}

}
