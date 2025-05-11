package pack2;

import java.util.LinkedList;
import java.util.List;

import pack1.Square;

public class Main5 {
   public static void main(String[] args) {
	  Square s1=new Square(10);
	  Square s2=new Square(20);
	  Square s3=new Square(30);
	  
	  List<Square> squares=new LinkedList<>();
	  squares.add(s1);
	  squares.add(s2);
	  squares.add(s3);
	  squares.add(new Square(25));
	  System.out.println(squares);
	  
	  System.out.println(squares.contains(new Square(15)));
	  
	  int pos=squares.indexOf(new Square(15));
	  
	  for(Square square:squares) {
		  System.out.println(square.getSize()+" Area is "+square.getArea());
	  }
	  
	  squares.clear();
	  System.out.println(squares.isEmpty());

}
}
