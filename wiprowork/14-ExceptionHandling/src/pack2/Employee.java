package pack2;

public class Employee {
	double basicSalary;
	public void setBasicSalary(double basicSalary)throws Exception {
		if(basicSalary<0) {
			Exception e=new Exception("invalid basic salary");
			throw e;
		}
	}
	public double getBasicSalary() {
		return basicSalary;
	}
}
