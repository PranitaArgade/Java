//java Demo6 10 20 30
//output:102030
//reason :arguments stored in String format we simply use + to concat.
class Demo6{
	public static void main(String[]args){
	    String var1=null;
	    var1=args[0]+args[1]+args[2];
	    System.out.println(var1);
	}
}
