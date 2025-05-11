package pack1;

public class Main3 {
	  public static void main(String[] args) {
			System.out.println("program begins..");
			int arr[]= {10,20,30};
			try {
			System.out.println(arr[2]);
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e.getMessage());
			}
			System.out.println("program ends");
		}
}
