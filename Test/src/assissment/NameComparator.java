package assissment;

import java.util.Comparator;

public class NameComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.getName().equals(o2.getName()))
		{
			return 1;
		}
		return 0;
	}

}
