/* Write a program to reverse the given number.
 - input:942111423
 - Output: 324111249
 */
class ReverseNo_10{
	public static void main(String[]args){
		int No=942111423;
		int rev=0;
		int temp=No;
		int rem=0;
		while(temp!=0){
			rem=temp%10;           //to find the remainder
			rev=rev*10+rem;        // store reverse number
			temp=temp/10;          // reduce the original number
		}
		System.out.println(No+ "  After Reverse:=" +rev);
	}
}


