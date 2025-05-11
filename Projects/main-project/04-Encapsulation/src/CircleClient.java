
public class CircleClient {
       public static void main(String[] args) {
		
    	   Circle c1=new Circle();
    	   System.out.println(c1.getRadius());
    	   c1.setRadius(4);
    	   System.out.println(c1.getRadius());
    	   
    	   System.out.println(c1.PI);
    	   System.out.println();
    	   
    	   Circle c2=new Circle();
    	   System.out.println(c2.getRadius());
    	   c1.setRadius(5);
    	   System.out.println(c2.getRadius());
    	   System.out.println(c2.PI);
    	   System.out.println();
    	   
    	   Circle c3=new Circle();
    	   System.out.println(c3.getRadius());
    	   c3.setRadius(2);
    	   System.out.println(c3.getRadius());
    	   
    	   System.out.println(c1.PI);
    	   System.out.println();
	}
}
