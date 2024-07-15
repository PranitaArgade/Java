
//output:compile time error
//there's no suitable constructor with parameter int[].String does not have a constructor that has an integer array as parameter.
class Demo7{
	public static void main(String[]args){
		int[]arr={97,98,99,100};
		String str= new String(arr);
		System.out.println(str);
	}
}
