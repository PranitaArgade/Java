//output:Compile time error
//reason:While instantiating arrays in java the size should not be imentioned it generates a syntax error.
class Solution6{
	public static void main(String[]args){
		int arr[5]={1,2,3,4,5};
		for(int var:arr)
			System.out.println(var);
	}
}
