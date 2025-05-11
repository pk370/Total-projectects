package pack5;

public class Main2 {
      public static void main(String[] args) {
//		Acceptor<Integer> a1=(Integer i)->{
//			System.out.println(i*i);
//		};
    	  Acceptor<Integer> a1=i->System.out.println(i*i);
		a1.accept(10);
		
		Acceptor<Integer> a2=i->System.out.println(i*i*i);
		a2.accept(10);
	}
}
