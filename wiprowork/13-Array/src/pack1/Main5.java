package pack1;

public class Main5 {
  public static void main(String[] args) {
	double[] prices=new double[] {22.0,35.0,45.0};
	//write code here to find the sum of all elements..
	double sum=0;
	for(int i=0;i<prices.length;i++) {
		sum+=prices[i];
	}
	System.out.println(sum);
}
}
