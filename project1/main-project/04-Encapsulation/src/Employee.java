
public class Employee {
   private int id;
   private String name;
   private double basicSalary;
   
   public void setBasicSalary(double b) {
	if(b<0) {
		System.out.println("Invalid salary");
	  }
	basicSalary=b;
    }
     public double getBasic() {
    	 return basicSalary;
     }
     double computeAllowance() {
    	 return basicSalary*0.35;
     }
     double compureDeduction() {
    	 return basicSalary*0.10;
    	 
     }
     double getNetSalary() {
    	 double allowance=compureDeduction();
    	 double deduction=compureDeduction();
    	 return basicSalary*allowance-deduction;
     }
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
      
}
