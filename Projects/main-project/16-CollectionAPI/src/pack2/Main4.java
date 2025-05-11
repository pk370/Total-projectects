package pack2;

import java.util.LinkedList;
import java.util.List;

public class Main4 {
    public static void main(String[] args) {
		List<Integer> prices=new LinkedList<>();
		
		prices.add(23);
		prices.add(44);
		prices.add(34);
		
		System.out.println(prices);
		System.out.println(prices.contains(44));
		
		prices.set(2, 93);
		
		System.out.println(prices);
		
		prices.remove(2);
		System.out.println(prices);
		
		for(Integer price:prices) {
			System.out.println(price);
		}
		
		prices.clear();
		System.out.println();
	}
    
}
