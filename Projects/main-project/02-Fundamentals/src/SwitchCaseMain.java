
public class SwitchCaseMain {
  public static void main(String[] args) {
	char grade='c';
	switch(grade){
	   case 'A':System.out.println("you are eligible for 90% scholorship");
	            break;
	   case 'B':System.out.println("you are eligible for 75% scholorship");
                break;
	   case 'C':System.out.println("you are eligible for 60% scholorship");
                break;
	   case 'D':System.out.println("you are eligible for 50% scholorship");
                break;
       default:System.out.println("you are not eligible");
	}
}
}
