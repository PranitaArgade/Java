//java Demo4 Python java c
//output:Pythonjavac
/*reason:Arguments stored in String[]args are in String format.
 - We access them and use '+' .
 - + in string used to concat.
 -So all values in array args are simply concatenated.*/

class Demo4{
	public static void main(String[]args){
		String var1=null;
		var1=args[0]+args[1]+args[2];
		System.out.println(var1);
	}
}
