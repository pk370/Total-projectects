package pack5;

public class Main3 {
         public static void main(String[] args) {
//			Acceptor<Circle> a1=(Circle c)->{
//				System.out.println(c.getRadius());
//			};
        	 
        	 Acceptor<Circle> a1=c->System.out.println(c.getRadius());
        	 a1.accept(new Circle(26));
        	 
        	 Acceptor<Employee> a3=e->System.out.println(e.computeAllowance());
        	 a3.accept(new Employee(101,"ram",200));
        	 
        	 Acceptor<Employee> a4=e->{
        		 System.out.println(e.computeAllowance());
        		 System.out.println(e.computeNetSalary());
        	 };
        	 
        	 a4.accept(new Employee(102,"navin",799));
        	 
        	 Acceptor<Employee> a5=e->System.out.println(e.getName());
        	 
        	 a5.accept(new Employee(104,"ram",500));
        	 
        	 Acceptor<Employee> a6=e->{
        		 System.out.println(e.getId());
        		 System.out.println(e.getName());
        		 System.out.println(e.getBasicSalary());
        		 
        	 };
        	 a6.accept(new Employee(106,"ram",699));
		}
         
}
