package leetCode.String;

import java.util.ArrayList;

public class ReverseWordRead {

	public static void main(String[] args) 
	{
		String s1="hello digvijay good morning";
		
		String []s2=s1.split(" ");
		
		ArrayList<String> str= new ArrayList<String>();
		
		for (int i = s2.length-1; i>=0 ; i--) 
		{
			str.add(s2[i]);
					
		}
		
		System.out.println(str);
	}
}
