package pack2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main2 {
	public static void main(String[] args) {
		   List<String> cities=new LinkedList<>();
		   
		   cities.add("mumbai");
		   cities.add("delhi");

		   cities.add("kolkata");

		   cities.add("pune");
		   
		   System.out.println(cities);
		   System.out.println(cities.size());
		   System.out.println(cities.isEmpty());
		   System.out.println(cities.contains("delhi"));
	        
		   String s=cities.get(2);
		   System.out.println(s);
		   
		   int pos=cities.indexOf("pune");
		   System.out.println(pos);
		   
		   cities.set(2, "Hyderabad");
		   
		   System.out.println(cities);
		   
		   cities.remove("hyderabad");
		   System.out.println(cities);
		   for(int i=0;i<cities.size();i++) {
			   System.out.println(cities.get(i));
		   }
		   for(String city:cities) {
			   System.out.println(city);
		   }
		   
		   cities.clear();
		   System.out.println(cities);
		   System.out.println(cities.isEmpty());
		   
	  }
}
