package pack2;

import pack1.CarLoan;
import pack1.HomeLoan;
import pack1.Loan;
import pack1.PersonalLoan;

public class Main1 {
public static void main(String[] args) {
	    Loan loan;
	    loan=new PersonalLoan(12, 1000.00,"njhjds");
		System.out.println(loan.getInterestRate());
		System.out.println(loan.getInterestAmount());
		

		loan=new CarLoan(12,10000.00,"KL-12 3455");
		System.out.println(loan.getInterestRate());
		System.out.println(loan.getInterestAmount());
		
		loan=new HomeLoan(12,10000.00,"Mumbai");
		System.out.println(loan.getInterestRate());
		System.out.println(loan.getInterestAmount());
}
}
