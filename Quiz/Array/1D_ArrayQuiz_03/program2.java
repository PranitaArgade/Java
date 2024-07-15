//compile time error
//reason: For Declaring array,'[]'has to be given to both sides of '='.
class Solution2{
	public static void main(String[]args){
		int arr=new int[5];
		for(int i=0;i<arr.length;i++){
			arr[i]=i*i;
		}
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]+" ");
		}
		System.out.println();
	}
}
