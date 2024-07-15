class StringBufferDemo6{
	public static void main(String[]args){
		String str1="Pranita";
		String str2=new String("Argade");
		StringBuffer str3=new StringBuffer("Priti");
		str1.concat(str1);
		str3.append(str2);
		System.out.println(str1);//Pranita
		System.out.println(str2);//Argade
		System.out.println(str3);//PritiArgade(because str3 store when append method use but concat store but not print)
	}
}
