//output:Equal
//reason:both string have same identity hashcode since marked to same object on SCP
class Demo8{
	public static void main(String[]args){
		String svar1="This is a String";
		String svar2="This is a String";
		if(System.identityHashCode(svar1)==System.identityHashCode(svar2)){
			System.out.println("Equal");
		}else{
			System.out.println("Not Equal");
		}
	}
}
