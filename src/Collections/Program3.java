package Collections;

import java.util.Arrays;
import java.util.HashSet;

public class Program3 {

	public static void main(String[] args) {

		HashSet<Integer> y = new HashSet<Integer>();
		y.add(5);
		y.add(10);
		y.add(15);
		y.add(20);

		System.out.println(y);

		y.addAll(Arrays.asList(6,12,18,24));
		System.out.println(y);

		y.remove(12);
		System.out.println(y);

		y.removeAll(Arrays.asList(10,30,50,70));
		System.out.println(y);

		System.out.println(y.contains(30));

		System.out.println(y.size());

		System.out.println(y.containsAll(Arrays.asList(10,70)));

		System.out.println(y.isEmpty());

		y.clear();
		System.out.println(y);

		System.out.println(y.isEmpty());
	}
	
}
