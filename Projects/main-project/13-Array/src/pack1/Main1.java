package pack1;

public class Main1 {
   public static void main(String[] args) {
	int [] ages;
	ages=new int[3];
	
	System.out.println(ages.length);
	
	System.out.println(ages[0]);
	
	System.out.println(ages[1]);
	
	System.out.println(ages[2]);
	
	ages[0]=22;
	ages[1]=34;
	ages[2]=40;
	for(int i=0;i<ages.length;i++) {
		System.out.println(ages[i]);
	}
	
	for(int i: ages) {
		System.out.println(i);
	}
}
}
