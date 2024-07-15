/* Take N as input ,print all its factors.
 - factors: X is a factor of N if N%X==0
 - input:6
 - output: 1  2  3  6

*/

class Factors5{
	public static void main(String[]args){
		int N=6;
		for(int i=1; i<=6; i++){
			if(N%i==0){
				System.out.println(i+ " ");
			}
		
		}
		 
	}
	
}
