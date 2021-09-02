package leetCode.String;

import java.util.ArrayList;

public class ReverseString {

	
	
	public static void main(String[] args) 
	{
		String s1="hello digu good morning";
		String s2="";
		
		
		for (int i = s1.length()-1; i>=0; i--)
		{
			s2=s2+s1.charAt(i);
			
		}
		
		System.out.println(s2);
	
	
		System.out.println("..................WAY 2.....................");
		
	String a1="hello digu good morning";
	String [] a2=a1.split(" ");
	 
	for (int j=0; j<=a2.length-1;j++) 
	{
		char[] ch=a2[j].toCharArray();
		
		for (int i = ch.length-1; i>=0; i--)
		{
			System.out.print(ch[i]);
		}
		System.out.print(" ");
	}
	
	
	System.out.println("\n...............WAY 3....................");
	
	//OR
	
	String p="hello digu good morning";
	String [] q=a1.split(" ");
	
	ArrayList<String > lt=new ArrayList<String>();
	
		for (int i = q.length-1; i>=0; i--)
		{
			lt.add(q[i]);
		}
	System.out.println(lt);
	
}
}
