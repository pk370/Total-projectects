package pack2;

import java.util.function.Consumer;

import pack1.Employee;

public class Main2 {
	 static void execute(Consumer<Employee> consumer) {
		 Employee employee=new Employee(102, "ramu", 1000);
		 consumer.accept(employee);
	 }
	
     public static void main(String[] args) {
		
    	 execute(e->{
    		 System.out.println(e.getId());
    		 System.out.println(e.getName());
    		 System.out.println(e.getBasicSalary());
    		 
    	 });
    	 
    	 execute(e->{
    		 System.out.println(e.getAllowance());
    		 System.out.println(e.getBasicSalary());
    	 });
	}
}
