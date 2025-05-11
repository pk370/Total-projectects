
public class Loan {
       private int loanId;
       private String customerName;
       private double loanAmount;
       private int tenureInMonth;
	public int getLoanId() {
		return loanId;
	}
	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}
	public int getTenureInMonth() {
		return tenureInMonth;
	}
	public void setTenureInMonth(int tenureInMonth) {
		this.tenureInMonth = tenureInMonth;
	}
     public double getInterestAmount() {
    	 return this.loanAmount*this.tenureInMonth;
     }
}
