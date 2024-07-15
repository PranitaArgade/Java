//Write a java program to find a maximum between three numbers.
//input1:num1=1,num2=2,num3=3
//output:3 is the maximum between 1,2 and 3
//input2:num1=1,num2=4,mum3=3
//output:4 is the maximum between 1,4 and 3
//input 3:num1=42,num2=32,num3=42
//output:??


class Solution6{
	public static void main(String[]args){
		int num1=1;
		int num2=2;
		int num3=3;
		if(num1>num2 && num1>num3){
			System.out.println(num1 +" is the maximumm number between "+num1+ "," +num2 +" and "+num3);
		}else if(num2>num1 && num2>num3){
			System.out.println(num2 +" is the maximum number between "+num1 +", "+num2+" and"+num3);
		}else if(num3>num1 && num3>num2){
			System.out.println(num3+" is the maximum number between "+num1 +" ,"+num2+" and "+num3);
		}else if(num
