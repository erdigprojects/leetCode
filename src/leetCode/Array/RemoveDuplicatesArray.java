package leetCode.Array;

import java.util.Arrays;

public class RemoveDuplicatesArray {

	public int removeDuplicates(int[] nums) 
	{
	    if (nums.length == 0)
	    return 0;
	    
	    int i = 0;
	    
	    for (int j = 0; j < nums.length; j++)
	    {
	        if (nums[j] != nums[i]) 
	        {
	            i++;
	            nums[i] = nums[j];
	        }
	    }
	    return i + 1;
	}
	
	
	
	
	public static void main(String[] args) 
	{
		int [] num = {5,5,2,3,3,4,4};
		RemoveDuplicatesArray obj= new RemoveDuplicatesArray();

		
		int j= obj.removeDuplicates(num);
		System.out.println(j);
		
		// rewrite new array
		for (int i = 0; i < j; i++) {
            System.out.print(num[i] + " ");
		}
		
	}

}
