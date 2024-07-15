class StringBufferDemo4{
	public static void main(String[]args){
		StringBuffer str=new StringBuffer(100);
		str.append("Priti");
		str.append("Rahul");
		System.out.println(str);
		System.out.println(str.capacity());
		str.append("Aher");
		System.out.println(str);
		System.out.println(str.capacity());
	}
}
