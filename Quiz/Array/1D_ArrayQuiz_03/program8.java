//output:error: cannot assign a value to final variable length
//reason:length is a final variable in the Array class.so its value cannot be changed.
class Solution8{
	public static void main(String[]args){
		int arr1[]=new int[5];
		System.out.println(arr1.length);
		arr1.length=40;//error
		System.out.println(arr1.length);
	}
}
