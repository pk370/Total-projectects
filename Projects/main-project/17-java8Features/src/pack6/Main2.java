package pack6;

public class Main2 {
	
	 static void doProcess(Acceptor<Employee> a) {
		 Employee employee=new Employee(10,"ram",1000);
	 }
     public static void main(String[] args) {
		
    	 doProcess( e->System.out.println(e.computeAllowance()));
    	 
    	 doProcess(e->System.out.println(e.computeNetSalary()));
    	 
    	 doProcess(e->{
    		 System.out.println(e.getId());
    		 System.out.println(e.getName());
    		 System.out.println(e.getBasicSalary());
    		 System.out.println(e.computeAllowance());
    		 System.out.println(e.computeNetSalary());
    	 });
    	 
	}
}
