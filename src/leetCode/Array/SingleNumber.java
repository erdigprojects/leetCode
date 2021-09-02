package leetCode.Array;

public class SingleNumber {



		public static void main(String[] args) {

//		    int result =0;
//		    int []arr={3,4,5,3,4,5,6};
//		    for(int i:arr)
//		    {
//		        result ^=i;
//		    }
//
//		    System.out.println("Result is "+result);
		
		

		
	//////WAY2
		
		
			    int[] a = {1,1,3,2,3};
			    int[] b =new int[a.length]; 
			    //instead of a.length initialize it to maximum element value in a; to avoid
			    //ArrayIndexOutOfBoundsException
			    for(int i=0;i<a.length;i++)
			    {
			      int x=a[i];
			      b[x]++;
			    }
			     for(int i=0;i<b.length;i++)
			     {
			       if(b[i]==1)
			       {
			       System.out.println(i); // outputs 2
			       break;
			       }
			      }
			   
			
}
}
