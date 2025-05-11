package pack1;

public class Manager extends Employee{
    public int employeeCount;
    @Override
    public double computeAllowance() {
    	double a1=super.computeAllowance();
    	double a2=this.employeeCount*100;
    	return a1+a2;
    }
}
