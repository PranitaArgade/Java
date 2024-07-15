//Take a batsman information.

import java.io.*;
class BufferedDemo3{
	public static void main(String[]args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter player name:");
		String name=br.readLine();
		System.out.println("Enter jerNo:");
		int jerno=Integer.parseInt(br.readLine());
		System.out.println("Run Rate:");
		float rate=Float.parseFloat(br.readLine());
		System.out.println("Name="+name);
		System.out.println("JerNo="+jerno);
		System.out.println("Rate="+rate);

	}
}
