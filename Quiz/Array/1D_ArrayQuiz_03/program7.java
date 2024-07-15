//output: int cannot be dereferenced
/*reason: arr2 is not of type array.
         it is of type int.
	 Length is not applicable on int variable.
*/
  class Solution7{
	public static void main(String[]args){
		int arr1[],arr2;
		System.out.println(arr2.length);
	}
}
