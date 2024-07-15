class StringBufferDemo2{
	public static void main(String[]args){
		StringBuffer sb=new StringBuffer();
		System.out.println(sb.capacity());//16(bydefault 16)
	        System.out.println(System.identityHashCode(sb));
		sb.append("Pranita");          //Pranita
		System.out.println(sb);
		System.out.println(sb.capacity());//16
	        System.out.println(System.identityHashCode(sb));

	}
}
