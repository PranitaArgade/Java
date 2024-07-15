/*output:error: incompatible types: int[] cannot be converted to int
                arr2=new int[5];
  reason:arr2 is of type int and here we trying to assign a reference value of int array type to it,which will raise an error.*/
class Solution9{
	public static void main(String[]args){
		int arr1[],arr2;
		arr1=new int[10];
		arr2=new int[5];
	}
}
