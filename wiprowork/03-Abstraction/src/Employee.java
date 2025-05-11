
public class Employee {
	int id;
	String name;
	double basicSalary;
	double computeAllowance() {
		return basicSalary*0.35;
	}
	double computeDeduction() {
		return basicSalary*0.10;
	}
	double getNetSalary() {
		double allowance=computeAllowance();
		double deducation=computeAllowance();
		return basicSalary+allowance-deducation;
	}

}
