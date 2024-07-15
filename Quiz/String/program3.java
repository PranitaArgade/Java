//output:true
//reason:being same string literal ,same address will be assigned and == operator compare the addresses which is true being equal/same
class Demo3{
	public static void main(String[]args){
		String str1="C2W";
		String str2="C2W";
		System.out.println(str1==str2);
	}
}
