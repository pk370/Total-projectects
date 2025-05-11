package pack1;

import java.util.Objects;

public class Loan {
    int loanId;
    String customerName;
    double loanAmount;
    int tenure;
	public Loan(int loanId, String customerName, double loanAmount, int tenure) {
		super();
		this.loanId = loanId;
		this.customerName = customerName;
		this.loanAmount = loanAmount;
		this.tenure = tenure;
	}
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
	public int getTenure() {
		return tenure;
	}
	public void setTenure(int tenure) {
		this.tenure = tenure;
	}
	@Override
	public String toString() {
		return "Loan [loanId=" + loanId + ", customerName=" + customerName + ", loanAmount=" + loanAmount + ", tenure="
				+ tenure + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(customerName, loanAmount, loanId, tenure);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Loan other = (Loan) obj;
		return Objects.equals(customerName, other.customerName)
				&& Double.doubleToLongBits(loanAmount) == Double.doubleToLongBits(other.loanAmount)
				&& loanId == other.loanId && tenure == other.tenure;
	}
       d
}
