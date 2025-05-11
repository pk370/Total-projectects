package pack2;

import java.util.LinkedList;
import java.util.List;

import pack1.Employee;

public class Main6 {
      public static void main(String[] args) {
		//create employees
    	 //perform all operations.
    	  Employee s1=new Employee(1,"ramu",2000);
    	  Employee s2=new Employee(2,"thanish",1000);
    	  Employee s3=new Employee(3,"charan",3000);
    	  
    	  List<Employee> e,employees=new LinkedList<>();
    	  employees.add(s1);
    	  employees.add(s2);
    	  employees.add(s3);
    	  employees.add(new Employee(4,"nani",3000));
    	  System.out.println(employees);
    	  
    	  System.out.println(employees.contains(new Employee(5,"varun",4000)));
    	  
    	  int pos=employees.indexOf(new Employee(6,"gopi",2000));
    	  
    	  for(Employee employee:employees) {
    		  System.out.println(employee.getAllowance());
    	  }
    	  
    	  employees.clear();
    	  System.out.println(employees.isEmpty());
	  }
      
}
