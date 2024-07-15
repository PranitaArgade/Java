//subString method having single integer parameter returns substring from the string from integer given as parameter upto end of the string.
class Demo1{
	public static void main(String[]args){
		StringBuilder str1=new StringBuilder("StringBuilder");
		StringBuffer str2=new StringBuffer(str1.substring(6));
		System.out.println(str2);
	}
}
