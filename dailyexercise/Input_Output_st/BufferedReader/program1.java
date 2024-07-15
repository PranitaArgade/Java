/*  output:Enter char
               P
               p  */

import java.io.*;
class InputDemo{
	public static void main(String[]args)throws IOException{
		InputStreamReader obj =new InputStreamReader(System.in);
		System.out.println("Enter char");
	//	int ch=obj.read();
	       char ch=(char)obj.read();
		System.out.println(ch);
	}
}
