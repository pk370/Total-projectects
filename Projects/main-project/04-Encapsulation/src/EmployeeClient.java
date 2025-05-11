
public class EmployeeClient {
    public static void main(String[] args) {
		Employee e=new Employee();
		
		e.setBasicSalary(1000);
		System.out.println(e.getBasic());
		System.out.println(e.computeAllowance());
	}
}
