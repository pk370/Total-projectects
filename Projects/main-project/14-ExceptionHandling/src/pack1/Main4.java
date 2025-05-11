package pack1;

public class Main4 {
   public static void main(String[] args) {
	 System.out.println("program begins");
	 try {
	 System.out.println(10/0);
	 int arr[]= {1,2,3};
	 System.out.println(arr[35]);
	 System.out.println(Integer.parseInt("abcd"));
	 }catch(ArithmeticException e) {
		 System.out.println("Invalid Arithemtic operation");
	 }catch(NumberFormatException e) {
		 System.out.println("Data in incorrecct format");
	 }catch(ArrayIndexOutOfBoundsException e) {
		 System.out.println("Array Access Invalid");
	 }catch(Exception e) {
		 System.out.println("some error occured");
	 }finally {
		 System.out.println("Finally executes");
	 }
	 System.out.println("program ends");
}
}
