
//output:Error:Incompatible type:StringBuffer cannot be converted to string.
class Demo3{
	public static void main(String[]args){
		String str=new StringBuffer("jamesGosling");
		System.out.println(str.replac('j','G'));
	}
}
