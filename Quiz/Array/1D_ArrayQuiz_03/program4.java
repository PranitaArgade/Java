//output:error: variable arr1 might not have been initialized
//reason:Only declaration af array does not actually create the array,it only create a reference of type array.
class Solution4{
	public static void main(String[]args){
		int arr1[];
		System.out.println(arr1.length);
	}
}
