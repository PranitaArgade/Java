//output: 0 0 420 0
/* -When an array is declared all the elements are initialized to zero.
   - Only the elements at index 2 is reinitialized to 420.
   - Array elements are then displayed using for each loop.*/

class Solution9{
	public static void main(String[]args){
		int arrInt[];
		arrInt=new int[4];
		arrInt[2]=420;
		for(int itr:arrInt)
			System.out.println(itr);
	}
}
