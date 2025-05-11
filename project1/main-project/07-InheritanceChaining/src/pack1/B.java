package pack1;

public class B extends A{
     B(){
    	 super();
    	 System.out.println("B-con");
     }
     B(int i,int j){
    	 super(i);//constructor chaining
    	 System.out.println("B-const"+i);
     }
}
