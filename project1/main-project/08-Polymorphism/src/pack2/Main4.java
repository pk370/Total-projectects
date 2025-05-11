package pack2;

import pack1.Employee;
import pack1.Manager;
import pack1.SalesEmployee;

public class Main4 {
    public static void main(String[] args) {
		Employee employee;
		
		employee=new Employee();
		employee.basicSalary=1000;
		
		System.out.println(employee.computeAllowance());
		
		employee=new Manager();//upcasting
		System.out.println(employee.computeAllowance());
		
		employee=new SalesEmployee();
		System.out.println(employee.computeAllowance());
	}
}
