package pack1;

import pack2.Circle;

public class Main2 {
   public static void main(String[] args) {
	   Circle circle1=new Circle();
	   Circle circle2=new Circle();
	   
		
		
		int r = circle1.compareTo(circle2);
		
		if(r>0)
			System.out.println("circle1 radius is greater than circle2  radius");
		if(r==0)
			System.out.println("both circles radius are equal");
		if(r<0)
			System.out.println("circle1 radius is lesser than circle2  radius");
}
}
