package pack1;

public class Main1 {
   public static void main(String[] args) {
	System.out.println("program begins");
	int a=100;
	int b=0;
	try {
		int c=a/b;
		System.out.println(c);
	}catch(ArithmeticException e) {
		System.out.println(e.getMessage());
	}
	System.out.println("program ends");
}
}
