//out:sun1995
//reason:String can be created by passing character array as well.
class Demo{
	public static void main(String[]args){
		char ch[]={'s','u','n','1','9','9','5'};
		String str=new String(ch);
		System.out.println(str);
	}
}
