//output:Runtime exception
/*reason:
  -charAt method replaces its place with the returned character which is "a".
  -so the method call changes to str.setCharAt('a','z').
  -But parameter required to method setCharAt is int,char.
  -so the 'a' replaced with its Ascii value i.e 97,but 97 is out of range in StringBuilder(20)object. */
class Demo5{
	public static void main(String[]args){
		StringBuilder str=new StringBuilder();
		str.append("Java_Virtual_Machine");
		str.setCharAt(str.charAt(14),'z');
		System.out.println(str);
	}

}
