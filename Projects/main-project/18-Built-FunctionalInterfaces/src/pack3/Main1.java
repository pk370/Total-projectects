package pack3;

import java.util.function.Supplier;

import pack1.Circle;
import pack1.Employee;
import pack1.Square;

public class Main1 {
	  public static void main(String[] args) {
		
	
       Supplier<Circle> supplier=()->{
    	   return new Circle(10);
       };
       
       Circle c=supplier.get();
       System.out.println(c);
       
       Supplier<Square> supplier2=()->new Square(10);
       Square s=supplier2.get();
       System.out.println(s);
       
       Supplier<Employee> supplier3=()->new Employee(1,"ram",7000);
       Employee e=supplier3.get();
       System.out.println(e);
	  }
}
