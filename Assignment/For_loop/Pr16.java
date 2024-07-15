/* write a program to print the square of even digit of the given number.
 * input: 942111423
   output : 4  16 4  16 */
class Pr16{
	public static void main(String[]args){
		int N=942111423;
		for(;N!=0;){
		    int rem=N%10;
		    if(rem%2==0){
			    System.out.print(rem*rem + "  ");
		   }
		    N=N/10;
		}
	}
}
