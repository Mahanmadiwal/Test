package Demo1;

public class pascalprogram
{
	public static void main(String[] args)
	{
		for(int i=1;i<=5;i++)
		{
			for(int k=3;k>=i;k--)
			{
				System.out.print(" ");
			
			}
			int n=1;
			for(int j=1;j<=i;j++)
			{
				System.out.print(n+" ");
				n=n*(i-j)/j;
			}
			
			System.out.println();
				
		}
		
		
	}

}
