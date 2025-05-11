
public class Employee {
    private String name;
    private double basicSalary;
    public Employee() {
    	super();
    }
	public Employee(String name, double basicSalary) {
		super();
		this.name = name;
		this.basicSalary = basicSalary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}
     public double computeAllowance() {
    	 return this.basicSalary;
     }
     public double computeNetSalary() {
    	 return this.basicSalary+this.basicSalary;
     }
}
