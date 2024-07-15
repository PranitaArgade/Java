class StringBufferDemo1{
	public static void main(String[]args){
		StringBuffer str=new StringBuffer("Pranita");
		System.out.println(System.identityHashCode(str));
		System.out.println(str);
		str.append("Argade");
		System.out.println(str);
		System.out.println(System.identityHashCode(str));
	}
}
