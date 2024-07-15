// Write an java program,take a number,and print whether it is positive or negative
//input:num=5;
//output:5 is a positive no
//input:num=-9
//output:-9 is a negative no
//input:num=0
//output:0 is neither positive nor negative

class Demo3{
	public static void main(String[]args){
		int num=0;
		if(num>0){
			System.out.println(num +" is a positive no");
		}
		else if(num<0){
			System.out.println(num +"is a negative no");
		}
		else{
			System.out.println(num +" is neither positive nor negative");
		}
	}
}
