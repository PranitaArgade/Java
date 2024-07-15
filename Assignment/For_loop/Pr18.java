/*
 -Write a program which take's number from users,if number is even then print it in reverse order or if number is odd then print in reverse order difference by two?
Input:6
output :6 5 4 3 2 1
 Input :7
output: 7  5 3 1
*/

class Pr18{
	public static void main(String[]args){
		int num=7;
		if(num%2==0){
			while(num>=0){
				System.out.println(num-- +"  ");
			}
		}else{
			while(num>=1){
				System.out.println(num + " ");
				num=num-2;
				
			}
		}
	}
}
