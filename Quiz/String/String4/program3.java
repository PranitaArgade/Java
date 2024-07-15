//output:Build0er
/*reason:
 -Unlike String, the chnage made in StringBuilder object will not gives the new object but result change in existing object.
 -Reversing an object even times gives the same unchanged object.*/

class Demo3{
	public static void main(String[]args){
		StringBuilder str=new StringBuilder("Builder");
		str.insert(5,new String("0"));
		str.reverse();
		System.out.println(str.reverse());
	}
}
