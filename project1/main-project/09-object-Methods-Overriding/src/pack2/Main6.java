package pack2;

import pack1.Circle;
import pack1.Employee;
import pack1.Square;
import pack1.Student;

public class Main6 {
     public static void main(String[] args) {
		Circle c=new Circle(10);
		Square s=new Square(14);
		Employee e=new Employee(101,"ram",4566);
		Student student=new Student(2020,"tharun",325);
		print(c);
		print(s);
		print(e)
		
	}
     
     static void print(Object o) {
    	 System.out.println(o.toString());
     }
}
