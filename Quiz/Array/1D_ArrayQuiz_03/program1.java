/*
 -output
  1
  ArrayIndexOutBoundException
Reason:The index is checked at runtime ,so no compile time error.
       It prints the elements at index 0 then throws exception.
       Index -1 out of bounds for length 5.*/
class Solution1{
	public static void main(String[]args){
		int arr[]={1,3,6,2,8};
		System.out.println(arr[0]);
		System.out.println(arr[-1]);
	}
}
