package assissment;

import java.util.Comparator;

public class AddressComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.getAddress().equals(o2.getAddress()))
		{
			return 1;
		}
		return 0;
	}

}
