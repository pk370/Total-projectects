package pack5;

public class Main1 {
     public static void main(String[] args) {
		Acceptor<String> a1=(String s)->{
			System.out.println(s.length());
		};
		
		a1.accept("wipro");
		
		Acceptor<String> a2=(String s)->{
			System.out.println(s.toUpperCase());
		};
		
		a2.accept("wipro");
		
		Acceptor<String> a3=(String s)->{
			System.out.println(s.toLowerCase());
		};
		
		a3.accept("wipro");
		
	}
}
