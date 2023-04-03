package Collections;

import java.util.HashSet;

public class Program4 {

	public static void main(String[] args) {
		HashSet<Integer> x = new HashSet<Integer>();
		x.add(2);
		x.add(4);
		x.add(6);
		x.add(8);
		System.out.println(x);

		HashSet<Integer> y = new HashSet<Integer>();
		y.add(2);
		y.add(3);
		y.add(5);
		y.add(7);
		System.out.println(y);

		HashSet<Integer> union = new HashSet<Integer>(x);//union
		union.addAll(y);

		System.out.println(union);

		HashSet<Integer> inter = new HashSet<Integer>(x);//intersection
		inter.retainAll(y);

		System.out.println(inter);

		HashSet<Integer> xdiffy = new HashSet<Integer>(x);//difference of x from y
		xdiffy.removeAll(y);

		System.out.println(xdiffy);

		HashSet<Integer> ydiffx = new HashSet<Integer>(y);//difference of y from x
		ydiffx.removeAll(x);
		System.out.println(ydiffx);

	}

}
