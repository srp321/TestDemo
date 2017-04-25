package test;

public class EquilibriumIndex 
{ 
	public static int equiIndex(int[] arr)
		{
	        int i = 0,arrsum = 0;
	        int leftsum = 0;
	 
	        for(i = 0; i < arr.length; i++)
	                arrsum += arr[i];
	 
	        for(i = 0; i < arr.length; i++)
	        {
	                arrsum -= arr[i];
	                if(leftsum == arrsum)   
	                        return arr[i];
	 
	                leftsum += arr[i];
	        }
	        return -1;
	}
 
    public static void main(String[] args) 
    {
        int arr[] = {5,1,8,1,2,3};
        System.out.println("value at equilibrium position: "+equiIndex(arr));
    }
}

