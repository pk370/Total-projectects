
public class Client {
	public static void main(String[] args) {
	    Employee e=new Employee();
	    e.setName("Ram");
	    e.setBasicSalary(1000.00);
	    
	    System.out.println(e.computeAllowance());
	    System.out.println(e.computeNetSalary());
	    
	    Manager m=new Manager();
	    m.setName("john");
	    m.setBasicSalary(5000.00);
	    
	    System.out.println(m.computeAllowance());
	    System.out.println(m.computeNetSalary());
	    
	    SalesEmployee salesEmployee=new SalesEmployee();
        salesEmployee.setName("sridevi");
        salesEmployee.setBasicSalary(7000);
        salesEmployee.setCityName("hyderabad");
        
        System.out.println(salesEmployee.computeAllowance());
        System.out.println(salesEmployee.computeNetSalary());
        
        
	}

}
