package pack6;

import java.util.Objects;

public class Employee {
   int id;
   String name;
   double basicSalary;
    public Employee(int id, String name, double basicSalary) {
	      super();
	      this.id = id;
	      this.name = name;
	      this.basicSalary = basicSalary;
     }
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", basicSalary=" + basicSalary + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(basicSalary, id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Double.doubleToLongBits(basicSalary) == Double.doubleToLongBits(other.basicSalary) && id == other.id
				&& Objects.equals(name, other.name);
	}
    public double getAllowance() {
        return this.basicSalary*0.35;
	}
    public double getBasicSalary() {
		return basicSalary;
	}
    double computeNetSalary() {
    	double a=this.basicSalary*0.35;
    	double t=this.basicSalary*0.10;
    	double n=this.basicSalary+a-t;
    	return n;
    }
    
    public double computeAllowance() {
    	double a=this.basicSalary*19;
    	return a;
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
	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}
    
   
}
