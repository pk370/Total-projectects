package pack1;

public class SalesEmployee extends Employee {
	
	public double salesAmount;
	
	public double computeAllowance() {
		return super.computeAllowance()+(salesAmount*0.10);
	}

}
