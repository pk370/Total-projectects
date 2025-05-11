package pack2;

import pack1.Employee;

public class Main1 {
    public static void main(String[] args) {
		Employee employee=new Employee();
		employee.basicSalary=100;
		System.out.println(employee.getNetSalary());
	}
}
