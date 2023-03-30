package Array;

public class program4 {
	//find the prime number

	public static void main(String[] args) {
		System.out.println("Prime numbers are");
		
		for(int n=1;n<=100;n++)
			
		{
		boolean a=true;
		
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				a=false;
				break;
			}		
				
		}
		if(a)
		{
			
			System.out.println(n);
		}
		}
	}
}
		
		

	




