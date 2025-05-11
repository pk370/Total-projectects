package pack1;

public class Employee {
    int id;
    String name;
    double basic;
	public Employee(int id, String name, double basic) {
		super();
		this.id = id;
		this.name = name;
		this.basic = basic;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", basic=" + basic + "]";
	}
    
}
