package Demo1;

public class SwapwthoutTempString
{
	public static void main(String[] args)
	{
		String n1="leela";//aaa
		String n2="manju";//bb
		
		n1=n1+" "+n2;//n1=n+n2;
		
		n2=n1.split(" ")[0];
		n1=n1.split(" ")[1];
		
		System.out.println(n1);
		System.out.println(n2);
		
		
		
		
		
	}
}
