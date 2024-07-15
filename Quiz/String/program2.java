//output:false
//reason:String literal goes to SCP and String created by new creates new object on heap,
//== operator checks address not the value at address
class Demo2{
	public static void main(String[]args){
		String str1=new String("Java");
		String str2="java";
		System.out.println(str1==str2);
	}
}
