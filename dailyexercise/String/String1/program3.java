class StringDemo3{
	public static void main(String[]args){
		String str1="Priti";
		String str2="Priti";
		String str3=new String("Priti");
		String str4=new String("Priti");
		String str5=new String("Pranita");
		String str6="Pranita";
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
                System.out.println(System.identityHashCode(str4));
                System.out.println(System.identityHashCode(str5));
		System.out.println(System.identityHashCode(str6));
	}	
}
