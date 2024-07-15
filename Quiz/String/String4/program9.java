//output:phashi
/*reason:
 -replace(int start,int end,String str)method replaces the string in StringBuilder object within the range start to end and with the String str.
 -in below senario,"p",will replace the string "S" in string "Shashi".*/

class Demo9{
	public static void main(String[]args){
		StringBuilder sb=new StringBuilder("Shashi");
		sb.replace(0,1,"p");
		System.out.println(sb);
	}
}
