class StringDemo5{
	public static void main(String[]args){
		String str1="Pranita";
		String str2="Argade";
		System.out.println(str1+str2);
		String str3="PranitaArgade";
		String str4=str1+str2;
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
	}
}
