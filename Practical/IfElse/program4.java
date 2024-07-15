//Write a java program that checks a number from 0 to 5 and prints its spelling,if the number is greater than 5 print the number is grater than 5.
//input:var=4;
//output:four
//input2:var=6
//output:number is grater than 5
//input3:var=-6
//output:

class Demo4{
	public static void main(String[]args){
		int var=-6;
		if(var<0){
			System.out.println("number is less than zero");
		}
		else if(var==0){
			System.out.println("Zero");
		}
		else if(var==1){
			System.out.println("one");
		}
		else if(var==2){
			System.out.println("Two");
		}
		else if(var==3){
			System.out.println("Three");
		}
		else if(var==4){
			System.out.println("four");
		}
		else if(var==5){
			System.out.println("five");
		}
		else{
			System.out.println("number is greater than 5");
		}
	}
}
