//Given an integer value as an input
//print fizz if it is divisible by 3
//print buzz if it is divisible by 5
//print fizz-buzz if it is divisible by both
//if not then print "not divisible by both"

class Fizz{
	public static void main(String[]args){
		int x=15;
		if (x%5==0 && x%3==0){
			 System.out.println("fizz-buzz");
		}
		else if(x%3==0){
			System.out.println("Fizz");
		}
		else if(x%5==0){
			System.out.println("buzz");
		}
		else{
			System.out.println("Not divisible by both");
		}
	}
}

