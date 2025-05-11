package pack4;

import java.util.function.Function;

import pack1.Circle;
import pack1.Employee;
import pack1.Square;

public class Main1 {
     public static void main(String[] args) {
		Function<Circle,Square> function1=(c)->new Square(c.getRadius());
		Square s=function1.apply(new Circle(10));
		System.out.println(s);
		
		Function<Circle,Employee>function2=(c)->new Employee(c.getRadius(),null,0);
		Employee e=function2.apply(new Circle(4));
		System.out.println(e);
		
		Function<String,Circle> function3=(ss)->new Circle(ss.length());
		Circle c=function3.apply("wipro");
		System.out.println(c);
	}
}
