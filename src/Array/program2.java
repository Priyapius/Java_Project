package Array;

public class program2 {

	public static void main(String[] args) {
		
		int[] x= {101,23,58,22,72,0,15};
		
		System.out.println("odd");
		
		for(int y:x)
		{
			if(y%2==1)
			{
				System.out.println(y)
;
			}		
			
		}
		System.out.println("Even");
		int i=0;
		
		while(i<x.length)
		{
			if(x[i]%2==0)
			{
				System.out.println(x[i]);
			}
			i++;
		}
		
		

	}


	}

