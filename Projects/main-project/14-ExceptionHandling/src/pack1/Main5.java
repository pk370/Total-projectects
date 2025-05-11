package pack1;

import pack2.Employee;

public class Main5 {
   public static void main(String[] args) {
	Employee employee=new Employee();
	try {
		employee.setBasicSalary(-100);
	}catch(Exception e) {
		e.printStackTrace();
	}
	System.out.println(employee.getBasicSalary());
}
}
