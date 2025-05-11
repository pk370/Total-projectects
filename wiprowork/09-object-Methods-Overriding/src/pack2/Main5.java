package pack2;

import pack1.Circle;
import pack1.Employee;
import pack1.Square;

public class Main5 {
     public static void main(String[] args) {
		Object obj=new Circle(20);
		System.out.println(obj.toString());
		
		obj=new Square(15);
		System.out.println(obj.toString());
		
		obj=new Employee(101,"ram", 1000);
		System.out.println(obj.toString());
	}
}
