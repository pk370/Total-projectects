package pack1;
public class CarLoan extends Loan{
   String registration;
    public CarLoan(int tenure,double loanAmount, String registration) {
		super(tenure,loanAmount);
		this.registration=registration;
	}
	@Override
	public double getInterestRate() {
		return 0.31;
	}
	    
}
