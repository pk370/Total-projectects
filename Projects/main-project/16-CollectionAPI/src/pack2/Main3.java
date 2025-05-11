package pack2;

import java.util.LinkedList;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {
		List<Double> prices=new LinkedList<>();
		
		prices.add(230.0);
		prices.add(450.0);
		prices.add(500.0);
		
		System.out.println(prices);
		System.out.println(prices.contains(500.0));
		
		prices.set(2, 600.00);
		
		System.out.println(prices);
		
		prices.remove(450.0);
		System.out.println(prices);
		
		for(Double price:prices) {
			System.out.println(price);
		}
		
		prices.clear();
		System.out.println();
	}
}
