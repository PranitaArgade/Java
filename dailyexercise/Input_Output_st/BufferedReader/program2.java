

import java.io.*;
class BufferedDemo2{
	public static void main(String[]args)throws IOException{
            InputStreamReader isr =new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.println("Enter Your name:");
		String name=br.readLine();
		System.out.println("Enter Age");
		int age=Integer.parseInt(br.readLine());
		System.out.println("Name="+name);
		System.out.println("Age="+age);


	}
}
