package pack1;

public class HomeLoan extends Loan{
	String propertyCity;
	public HomeLoan(int tenure,double loanAmount,String propertyCity) {
         super(tenure,loanAmount);
         this.propertyCity=propertyCity;
	}
	@Override
	public double getInterestRate() {
		return 0.23;
	}

}
