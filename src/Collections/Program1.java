package Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class Program1 {

	public static void main(String[] args) {
		ArrayList<Integer> x=new ArrayList<Integer>();
		x.add(50);
		x.add(25);
		x.add(10);

		System.out.println(x);

		x.add(1, 45);
		System.out.println(x);
		
		x.remove(1);
		System.out.println(x);
		
		x.set(1, 45);
		System.out.println(x);
		System.out.println(x.contains(50));
		System.out.println(x.contains(5));
		
		
		Integer a[]= {12,15,19,20};
		x.addAll(Arrays.asList(a));
		System.out.println(x);
		
		Integer b[]= {1,2,3,4};
		x.addAll(1, Arrays.asList(b));
		System.out.println(x);
		x.removeAll(Arrays.asList(a));
		System.out.println(x);
		
		System.out.println(x.size());
		System.out.println(x.isEmpty());
		x.clear();
		System.out.println(x);
		System.out.println(x.isEmpty());
	}

}
