package pack2;

public class Employee implements Comparable<Employee> {
  int id;
  String name;
  double basicSalary;
  public  Employee(int id, String name, double basicSalary) {
	super();
	this.id = id;
	this.name = name;
	this.basicSalary = basicSalary;
   }
@Override
   public int compareTo(Employee o) {
      if(this.basicSalary<o.basicSalary)
    	return -1;
      if(this.basicSalary>o.basicSalary)
    	return 1;
    return 0;
   }
}
