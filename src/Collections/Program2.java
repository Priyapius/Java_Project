package Collections;

import java.util.ArrayList;

public class Program2 {

	public static void main(String[] args) {
		ArrayList <Integer> x= new ArrayList<Integer>();
		ArrayList <Integer> y= new ArrayList<Integer>();
		for(int i=1;i<=10;i++)
		{
			if(i%2==0)
			{
				x.add(i);
			}
			else
			{
				y.add(i);
			}


		}
		System.out.println(x);
		System.out.println(y);
	}
}


