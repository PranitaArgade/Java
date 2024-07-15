//write a java program take a number,and print whether it is less than 10 or grater than 10.
//input1:var=5;
//output:5 is less than 10
//input2:16
//output:16 is greater than 10
//input3:10
//output:Both are equal

class Demo2{
	public static void main(String[]args){
		int var=10;
		if(var>10){
			System.out.println(var+" is greater than 10");
		}
		else if(var<10){
			System.out.println(var+" is less than 10");
		}
		else{
			System.out.println("Both are equal");
		}
	}
}

