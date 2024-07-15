//output:error
//Reason: An array can be initialized as shown because the compiler will raise error .
// This way the array can be initialized but both declaration and assignment should be done on the same line.

class Demo6{
	public static void main(String[]args){
		int[]arr;
		arr={1,2,3,4};
	for(int i=0; i<arr.length;i++){
		System.out.println(arr[i]+"  ");
	          }
          }
}
