package pack2;

import pack1.Loan;

public class Main11 {
    public static void main(String[] args) {
		Loan loan1=new Loan(1,"raju",1000,400);
		Loan loan2=new Loan(2,"ramesh",2000,300);
		
		System.out.println(loan1.equals(loan2));
		
	}
}
