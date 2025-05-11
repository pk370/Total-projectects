package pack1;

public class Employee {
     public double basicSalary;
     
     public double getNetSalary() {
    	 double allow=this.basicSalary*0.35;
    	 double tax=this.basicSalary*0.10;
    	 double net=this.basicSalary+allow-tax;
    	 return net;
     }
     public double getNetSalary(int extraHours) {
    	 double allow=computeAllowance();
    	 double allow1=this.basicSalary*0.35;
    	 double tax=this.basicSalary*0.10;
    	 double extra=extraHours*100;
    	 double net=this.basicSalary+allow-tax;
    	 return net;
     }
     public double computeAllowance() {
    	 return this.basicSalary*0.35;
     }
}
