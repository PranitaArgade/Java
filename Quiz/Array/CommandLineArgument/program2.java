//output:$
//reason:Best way to pass special characters at the command line is to use"".When $ is passed in " "it is stored in the array.
class Demo2{
	public static void main(String args[]){
		System.out.println(args[0]);
	}
}
