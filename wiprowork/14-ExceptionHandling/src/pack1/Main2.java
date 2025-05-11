package pack1;

public class Main2 {
  public static void main(String[] args) {
	System.out.println("program begins..");
	try {
	   String s="124abcd";
	   int x=Integer.parseInt(s);
	   System.out.println(++x);
	}catch(NumberFormatException e) {
		System.out.println(e.getMessage());
	}
	
	System.out.println("program ends");
}
}
