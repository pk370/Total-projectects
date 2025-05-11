
public class EmployeeClient {
   public static void main(String[] args) {
	 
	   Employee employee1=new Employee();
	   employee1.id=1001;
	   employee1.name="Ram";
	   employee1.basicSalary=10000.00;
	   
	   System.out.println(employee1.basicSalary+"---"+employee1.computeAllowance()+"---"+employee1.getNetSalary());

	   Employee employee2=new Employee();
	   employee1.id=1002;
	   employee1.name="navin";
	   employee1.basicSalary=20000.00;
	   
	   System.out.println(employee1.basicSalary+"---"+employee1.computeAllowance()+"---"+employee1.getNetSalary());
   
   }
}
