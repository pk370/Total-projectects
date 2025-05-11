package pack5;

import java.util.function.Predicate;
import pack1.Employee;
import pack1.Circle;

public class Main1 {
        public static void main(String[] args) {
			Predicate<String> predicate1=(s)->s.length()>10;
			System.out.println(predicate1.test("wipro"));
			System.out.println(predicate1.test("wipro technologies"));
			
			Predicate<Circle>predicate2=(c)->c.getArea()>100;
			System.out.println(predicate2.test(new Circle(34)));
			
			Predicate<Employee> prdeicate3=(e)->e.getBasicSalary()>1000;
			System.out.println(prdeicate3.test(new Employee(1,"raju",900)));
			
			
		}
}
