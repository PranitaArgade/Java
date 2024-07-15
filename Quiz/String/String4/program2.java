/* Every chande in string gives new object which should be stored in the given object otherwise it will be discarded and the string onject on which the
   the method is called remains unchanged.*/
class Demo2{
	public static void main(String[]args){
		StringBuilder strBuilder =new StringBuilder("String");
		StringBuffer strBuffer=new StringBuffer(strBuilder);
		String str=new String(strBuffer);
		System.out.println(str.replace('t','p'));//Spring
		System.out.println(str);                  //String
	}
}
