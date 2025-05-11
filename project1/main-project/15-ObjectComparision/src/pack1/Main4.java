package pack1;

import pack2.Employee;

public class Main4 {
  public static void main(String[] args) {
		Employee e1 = new Employee(101, "ramu", 1000.0);
		Employee e2 = new Employee(102, "arun", 1000.0);
		
		
		int r = e1.compareTo(e2);
		
		if(r>0)
			System.out.println("first employee salary is grater than Second");
		if(r==0)
			System.out.println("first employee salary is equal to Second");
		if(r<0)
			System.out.println("first employee salary is lesser than Second");
		
		//create 2 emp compare there salary  and print there result 

	}
  }
