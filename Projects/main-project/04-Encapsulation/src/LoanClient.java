
public class LoanClient {
    public static void main(String[] args) {
		Loan l=new Loan();
		l.setCustomerName("charan");
		l.setLoanId(34);
		l.setLoanAmount(4000);
		l.setTenureInMonth(3);
		
		System.out.println("name ="+l.getCustomerName());
		System.out.println("Loan id="+l.getLoanId());
		System.out.println("Loan Amount "+l.getLoanAmount());
		System.out.println("Months ="+l.getTenureInMonth());
		System.out.println("Interest Amount"+l.getInterestAmount());
	}
}
