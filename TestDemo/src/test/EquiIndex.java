package test;

public class EquiIndex {

	public static void main(String []args) {
		int arr[] = {1,1,1,2,1,5,3,1,2};
		long time1 = System.currentTimeMillis();
		System.out.println("mid index is: "+findEqui(arr));
		long time2 = System.currentTimeMillis();
		System.out.println("time taken: "+(time2-time1)+" ms");
		
	}
	private static int findEqui(int[] arr) {
		// TODO Auto-generated method stub
		int retVal = 0;
		int arrSum = 0;
		
		for (int i=0; i< arr.length; i++) {
			arrSum += arr[i];
		}
		int val = arrSum/2;
		for (int i=1; i< arr.length; i++) {
			if (arr[i-1] <= val) {
				arr[i] = arr[i] + arr[i-1];
				continue;
			}
			else
				return i-1;
		}
		return retVal;
		
	}

}
