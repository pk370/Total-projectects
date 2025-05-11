package pack2;

import pack1.Employee;
import pack1.Manager;

public class Main3 {
    public static void main(String[] args) {
		Employee employee=new Employee();
		employee.basicSalary=1000.00;
		System.out.println(employee.computeAllowance());
		
		Manager manager=new Manager();
		manager.basicSalary=1000;
		manager.employeeCount=10;
		System.out.println(manager.computeAllowance());
	}
}
