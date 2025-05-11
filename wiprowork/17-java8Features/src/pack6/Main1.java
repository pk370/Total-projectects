package pack6;

public class Main1 {
	
	  static void execute(Acceptor<Circle>a) {
		  Circle obj=new Circle(10);
		  a.accept(obj);
	  }
      public static void main(String[] args) {
		
    	  Acceptor<Circle> a1=(c)->System.out.println(c.getRadius());
    	  execute(a1);
    	  
    	  Acceptor<Circle> a2=c->System.out.println(c.getRadius());
    	  
    	  execute(a2);
    	  
    	  execute( c->System.out.println(c.getRadius()));
    	  
    	  execute(c->System.out.println(c.getRadius()));
    	  
    	  
	}
}
