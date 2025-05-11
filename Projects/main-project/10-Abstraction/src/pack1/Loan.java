package pack1;

public abstract class Loan {
	int tenure;
	double loanAmount;
	public Loan(int tenure, double loanAmount) {
		super();
		this.tenure=tenure;
		this.loanAmount=loanAmount;
	}
	abstract public double getInterestRate();
	public double getInterestAmount() {
		return 0.34;
	}

}
