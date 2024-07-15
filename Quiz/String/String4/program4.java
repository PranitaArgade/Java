//output:Bytecode is platform
//reason:setLength method sets the content length in the object upto integr index gives as parameter.
class Demo4{
	public static void main(String[]args){
		StringBuilder str=new StringBuilder(200);
		str.append("Bytecode is platform independent");
		str.setLength(20);
		System.out.println(str);
	}
}
