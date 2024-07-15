//output:Runtime error
//reason:Here ArrayIndexOutOfBoundException will occuras -1 index is invalid,but it is valid numeric so copile time error will not occur.
class Demo7{
	public static void main(String[]args){
		System.out.println(args[-1]);
	}
}
