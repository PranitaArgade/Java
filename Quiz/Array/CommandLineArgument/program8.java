//java Demo8 10 20
//output:1
//reason:As args[]array is of String array so Strings get Concatenated
//20/20=1
class Demo8{
	public static void main(String[]args){
		System.out.println((args.length>2)?Integer.parseInt(args[0])%10:Integer.parseInt(args[1])/20);
	}
}
