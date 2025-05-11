
public class SquareProgram {
   public static void main(String[] args) {
	  
	   Square s1;
	   s1=new Square();
	   s1.size=12;
	   System.out.println(s1.size);
	   System.out.println(s1.computeArea());
	   
	   Square s2;
	   s2=new Square();
	   s2.size=15;
	   System.out.println(s2.size);
	   System.out.println(s2.computeArea());
}
}
