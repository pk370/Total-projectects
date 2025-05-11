package pack1;

public class PersonalLoan extends Loan {

       String personName;
       public PersonalLoan(int tenure,double loanAmount,String personName) {
		super(tenure,loanAmount);
	    this.personName=personName;
	}
	@Override
	public double getInterestRate() {
		return 0.17;
	}
}
