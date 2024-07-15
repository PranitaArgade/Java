//java Demo3 Java Python
//output:java Python
//Reason: Arguments passed from terminal while running the program are store in string array from index 0
//Everything written after name of the class,which contains main,is stored from index 0 of string array,in String[]args)

class Demo3{
	public static void main(String args[]){
		System.out.println(args[0]);
		System.out.println(args[1]);
	}
}

