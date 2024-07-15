class StringBufferDemo5{
	public static void main(String[]args){
		String str1="Pranita";
		String str2=new String("Priti");
		StringBuffer str3=new StringBuffer("Kartik");
		String str5=str1.concat(str2); 
		StringBuffer str4=str3.append(str1);
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
	}
}
