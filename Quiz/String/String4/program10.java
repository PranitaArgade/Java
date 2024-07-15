//output:HelloAll!!Good Morning
//append method used to concat the string with the StringBuilder object.
//so appending all the given string gives the above ans.
class Demo10{
	public static void main(String[]args){
		StringBuilder obj=new StringBuilder("Hello");
		obj.append("All");
		obj.append("!! Good Morning");
		System.out.println(obj);
	}
}
