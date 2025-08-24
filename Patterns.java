package patterns;

public class Patterns {
	
	public void pattern1(int n)
	{
		for(int i = 0; i<n;i++)
		{
			for(int j =0 ;j<n;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
	public void pattern2(int n)
	{
		for(int i = 0; i<n;i++)
		{
			for(int j =0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
	public void pattern3(int n)
	{
		for(int i = 1; i<=n;i++)
		{
			for(int j =1 ;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println("");
		}
	}
	
	public void pattern4(int n)
	{
		for(int i = 1; i<=n;i++)
		{
			for(int j =1 ;j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println("");
		}
	}
	
	public void pattern5(int n)
	{
		for(int i = n ; i>0;i--)
		{
			for(int j = n ;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
	public void pattern6(int n)
	{
		for(int i = n ; i!= 0 ;i--)
		{
			for(int j = 1 ;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println("");
		}
	}
	
	public void pattern7(int n)
	{
		for(int i = 0; i<n;i++)
		{
			for(int j =0 ; j<n-i-1;j++)
			{
				System.out.print(" ");
			}
			
			for(int j = 0; j<i*2+1;j++)
			{
				System.out.print("*");
			}
			
			for(int j =0 ; j<n-i-1;j++)
			{
				System.out.print(" ");
			}
			
			System.out.println("");
		}
	}
	
	
	public void pattern8(int n)
	{
		
		
		for(int i = 0; i<n;i++)
		{
			for(int j = 0;j<i;j++)
			{
				System.out.print(" ");
			}
			
			for(int j = 0; j<2*n -(i*2 +1)  ;j++)
			{
				System.out.print("*");
			}
			
			for(int j = 0;j<i;j++)
			{
				System.out.print(" ");
			}
			System.out.println("");
		}
	}
	
	public void pattern9(int n)
	{
		for(int i = 0;i<n;i++)
		{
			for(int j = 0;j<n-i-1;j++)
			{
				System.out.print(" ");
			}
			for(int j = 0; j<i*2 +1;j++)
			{
				System.out.print("*");
			}
			for(int j = 0;j<n-i-1;j++)
			{
				System.out.print(" ");
			}
			System.out.println("");
		}
		
	
		for(int i = 1; i<n;i++)
		{
			for(int j = 0;j<i;j++)
			{
				System.out.print(" ");
			}
			
			for(int j = 0; j<2*n -(i*2 +1)  ;j++)
			{
				System.out.print("*");
			}
			
			for(int j = 0;j<i;j++)
			{
				System.out.print(" ");
			}
			System.out.println("");
		}
	}
	
	public void pattern10(int n)
	{
		int s = 0;
		for(int i = 0; i<n;i++)
		{
			
			if(i % 2 == 0)
			{
				s= 1;
			}
			else
			{
				s = 0;
			}
			for(int j =0;j<=i;j++)
			{
				System.out.print(s);
				
				s = 1 - s;
			}
			System.out.println("");
		}
	}
	
	
	
	public void pattern11(int n)
	{
		for(int i = 0;i<n;i++)
		{
			for(int j = 0;j<n;j++)
			{
				if(i == 0 || j == 0|| i == n-1 || j == n-1)
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}
	
	public static void main(String [] args ) {
		
		int n = 5;
		Patterns p = new Patterns();
//		p.pattern1(n);
//		System.out.println("");
//		p.pattern2(n);
//		System.out.println("");
//		p.pattern3(n);
//		System.out.println("");
//		p.pattern4(n);
//		System.out.println("");
//		p.pattern5(n);
//		System.out.println("");
//		p.pattern6(n);
//		System.out.println("");
//		p.pattern7(n);
//		System.out.println("");
//		p.pattern8(n);
//		System.out.println("");
//		p.pattern9(n);
//		System.out.println("");
//		p.pattern10(n);
//		System.out.println("");
		p.pattern11(n);
		System.out.println("");
	}
}
