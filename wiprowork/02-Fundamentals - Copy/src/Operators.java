
public class Operators {
    public static void main(String[] args) {
		
    	int n=10;
    	int age=10;
    	long salary=10000;
    	
    	System.out.println(age+salary);
    	System.out.println(age-salary);
    	System.out.println(age*salary);
    	System.out.println(age/salary);
    	System.out.println(age%salary);
    	
    	age+=5;
    	age-=5;
    	age*=5;
    	age/=5;
    	age%=5;
    	
    	age++;  //age=age+1 post fix notation
    	++age;  //age=age+1 pre fix notation
    	
    	System.out.println(++n);
    	System.out.println(n);
    	
    	System.out.println(age<salary);
    	System.out.println(age>salary);
    	System.out.println(age<=salary);
    	System.out.println(age>=salary);
    	System.out.println(age==salary);
    	System.out.println(age!=salary);
    	
    	System.out.println(age<18 && salary>1000);
    	System.out.println(age<18 || salary>1000);
    	System.out.println( !(age==10));
	}
}
