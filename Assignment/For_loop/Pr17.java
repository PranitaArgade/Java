/*
 Write a program to the sum of all even numbers and multiplications of all odd numbers between 1-10.
 Sum of all even numbers:  30
Multiplications of all odd numbers between 1-10:945
 */

class Pr17{
	public static void main(String[]args){
		int sum=0;
		int mul=1;
	for(int i=1;i<=10;i++){
		if(i%2==0){
			sum=sum+i;
			System.out.println(sum+"  ");
		}else{
			mul=mul*i;
			System.out.println(mul+ "  ");
		}
	}
	System.out.println("Sum of all even numbers:  "+sum);
	System.out.println("Multiplications of all odd numbers between 1-10:"+mul);
	}
}

