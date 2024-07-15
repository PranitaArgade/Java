//Number Format Exception

import java.io.*;
class NumberDemo{
	void getdata()throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int data=Integer.parseInt(br.readLine());
                 System.out.println(data);
	}
	public static void main(String[]args)throws IOException{
		NumberDemo obj=new NumberDemo();
		obj.getdata();
	}
}
