//output:not equal
/*reason:
  -equals method uses hashcode(not identityHashCode)to check the object.
  -in case of string hashcode is same if the content of two string is same.
  -but this is not true in case of StringBuilder.*/

class Demo6{
	public static void main(String[]args){
		StringBuilder sbvar1=new StringBuilder("hey");
		StringBuilder sbvar2=new StringBuilder("hey");
		if(sbvar1.equals(sbvar2))
			System.out.println("Equal");
		else
			System.out.println("Not Equals");
	}
}
