package Array;

public class program3 {

	public static void main(String[] args) {
		//print the even numbers and odd numbers
		
		int[] x= {10,15,20,25,30,35,40,45};
		
		System.out.println("Even Numbers");
		for(int a:x)
		{
			if(a%2==0)
			{
				System.out.println(a);
			}		
			
		}
		
		int i=0;
		System.out.println("odd Numbers");
		while(i<x.length)
		{
			if(x[i]%2==1)
			{
				System.out.println(x[i]);
			}
			i++;
		}
		
		

	}

	}


