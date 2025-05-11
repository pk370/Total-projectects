package pack1;

public class Main5 {
  public static void main(String[] args) {
	Integer obj1=Integer.valueOf(1000);
	Integer obj2=Integer.valueOf(2000);
	int r=obj1.compareTo(obj2);
	
	if(r<0) {
		System.out.println("obj1 is less than obj2");
	}
	if(r==0) {
		System.out.println("both are equal");
	}
	if(r>0) {
		System.out.println("obj1 is greater than obj2");
	}
  }
}
