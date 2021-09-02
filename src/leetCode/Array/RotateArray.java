package leetCode.Array;

import java.util.Arrays;

public class RotateArray {
	

		public static void main(String[] args)
		{
			int[]a= {1,2,3,4,5,6,7,8};
			
			
			for (int i = 0; i <2; i++) 
			{
				int temp=a[0];
				for (int j = 0; j <a.length-1; j++) 
				{
					a[j]=a[j+1];
					
				}
			a[a.length-1]=temp;
			
			}
			
			System.out.println("left rotation : "+Arrays.toString(a));

		/////////RIGHT ROATE	
			
			int[]b= {1,2,3,4,5,6,7,8};
			
			for (int k = 0; k < 2; k++) 
			{
			
			int temp=b[b.length-1];
			for (int i =b.length-1; i>0; i--)
			{
				b[i]=b[i-1];
			}
			b[0]=temp;
			}
			System.out.println("right rotation : "+Arrays.toString(b));
		}
	

	
	

}
