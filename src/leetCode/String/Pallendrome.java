package leetCode.String;

public class Pallendrome {

	public static void main(String[] args)
	{
		String s="wonNow";
		s=s.toLowerCase();
		
		String a="";
		
		for (int i=s.length()-1; i>=0; i--)
		{
			a=a+s.charAt(i);
		}
		
		if (a.equalsIgnoreCase(s))
		{
		System.out.println("string is pallendrome : "+a);	
		}
		else 
		{
			System.out.println("string is not pallendrome");
		}
	}

}
