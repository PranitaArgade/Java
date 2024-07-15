/*reason:
 -As the string "Shashi" contain 6 characters i.e index from 0 to 5 insert method inserts string "t" at the end of the given string "Shashi".*/
class Demo8{
	public static void main(String[]args){
		StringBuilder sb=new StringBuilder("Shashi");
		sb.insert(6,'t');
		//sb.insert(6,"t");
		System.out.println(sb);//Shashit
	}
}
