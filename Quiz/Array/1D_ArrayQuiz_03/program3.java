//output:ArrayIndexOutOfBoundException:index 0 out of bounds for length 0.
//reason:In java we can declare an array with size 0.but when we try to access arr[0] it gives an exception as it has 0 length.

class Solution3{
	public static void main(String[]args){
		int var=0;
		int arr[]=new int[var];
		System.out.println(arr[0]);
	}
}
