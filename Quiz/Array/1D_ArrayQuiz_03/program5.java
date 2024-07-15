//output:NegativeArraySizeException
/*Reason:
 - Array size given is not checked at the compile so compile time error will not occur.
 - When a negative value is used to declare the array it throws a NegativeArraySizeException.*/
class Solution5{
	public static void main(String[]args){
		int arr1[]=new int[-1];
		System.out.println(arr1.length);
	}
}
