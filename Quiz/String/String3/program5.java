//output:Androidtrue
/*Reason:
 - delete method deletes the content in the StringBuffer object within the range.
 - In below code "one" will be deleted so the length becomes 7.now inserting string at the last+1th index result the ans.*/
class Demo5{
	public static void main(String[]args){
		StringBuffer str=new StringBuffer("AndroidOne");
		str.delete(7,10);
		str.insert(str.length(),true);
		System.out.println(str);
	}
}
