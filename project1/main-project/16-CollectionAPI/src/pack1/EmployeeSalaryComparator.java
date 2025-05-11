package pack1;

import java.util.Comparator;

public class EmployeeSalaryComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
  		if(o1.getBasicSalary()<o2.getBasicSalary()) {
  			return -1;
  		}
  		if(o1.getBasicSalary()>o2.getBasicSalary()) {
  			return 1;
  		}
  		return 0;
	}
     
}
