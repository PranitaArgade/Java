class Demo7{
	public static void main(String[]args){
		StringBuffer str=new StringBuffer(400);
		str.append("java_Devlelopment_kit");
		str.trimToSize();
		str.setLength(10);
		System.out.println(str.capacity());
		System.out.println(str.length());
	}
}
