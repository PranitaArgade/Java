/*
 - Write a program which take's number from user's  if number is even print that number in reverse order or 
 -if number is odd print that number in reverse order by difference two?
 -input1:6
 -output1:6 5 4 3 2 1
 -input2:7
 -output2: 7 5 3 1
 */

class Reverse8{
	public static void main(String[]args){
		//int num=6;
		int num=7;
		if(num%2==0){                        //When number is even
			while(num>=1){
				System.out.print(num+" ");
				num--;
			}
		}else{                                     //when Number is Odd
			while(num>=1){
				System.out.print(num+" ");
                 	        num=num-2;
			}
		}
		System.out.println();
	}
}
