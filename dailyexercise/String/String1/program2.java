class StringDemo2{
	public static void main(String[]args){
		String str1="Kartik";
		String str2=new String("Priti");
		String str3="Kartik";
		String str4=new String("Ganesh");
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
	}
}
