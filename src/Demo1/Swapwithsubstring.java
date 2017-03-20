package Demo1;

public class Swapwithsubstring
{
	public static void main(String[] args) {
		
	
	String n1="aa";
	String n2="bbb";
	n1=n1+n2;
	
	n2=n1.substring(0,n1.length()-n2.length());
	n1=n1.substring(n2.length());
	
	System.out.println(n1);
	System.out.println(n2);
	
	}

}
