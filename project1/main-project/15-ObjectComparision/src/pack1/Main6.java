package pack1;

public class Main6 {
  public static void main(String[] args) {
	String s1="Welcome";
	String s2="How are you?";
	int r=s1.compareTo(s2);
	
	if(r<0) {
		System.out.println(" s1 is less than s2");
	}
	if(r==0) {
		System.out.println("s1 is equal to s2");
		
	}
	if(r>0) {
		System.out.println("s1 is greater than s2");
	}
}
}
