//output:Not equal
//reason:== operator check identityHashCode
class StringDemo7{
	public static void main(String[]args){
		String str1="Pranits";
		String str2=new String("Pranita");
		if(str1==str2){
			System.out.println("Equal");
		}else{
			System.out.println("Not equal");
		}
	}
}
