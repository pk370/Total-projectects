package pack2;

import java.util.function.Consumer;

import pack1.Circle;
import pack1.Employee;
import pack1.Square;

public class Main1 {
      public static void main(String[] args) {
		Consumer<Square> consumer=s->System.out.println(s.getArea());
	
		Square square=new Square(10);
		
		consumer.accept(square);
		
		Consumer<Square> consumer2=s ->System.out.println(s.getArea());
		
		consumer2.accept(square);
		
		Consumer<Circle> consumer3=c->{
			System.out.println(c.getRadius());
			System.out.println(c.getArea());
		};
		
		Circle obj=new Circle(20);
		
		consumer3.accept(obj);
		
		Consumer<Employee> consumer4=e->{
			System.out.println(e.getAllowance());
			System.out.println(e.getBasicSalary());
		};
		
		consumer4.accept(new Employee(101,"ram",700));
		
		Consumer<String> consumer5=s->{
			System.out.println(s.length());
			System.out.println(s.toUpperCase());
			System.out.println(s.charAt(0));
		};
		
		consumer5.accept("java");
		
	}
}
