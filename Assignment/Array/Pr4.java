/*WAP to print only vowels from array
 7
Enter character
a
b
c
e
i
o
u
Output
a  e  i  o  u  
*/
import java.io.*;
class Vowels4{
	public static void main(String[]args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int size=Integer.parseInt(br.readLine());
		char ch[]=new char[size];
		System.out.println("Enter character");
		for(int i=0;i<ch.length;i++){
			ch[i]=(char)br.read();
			br.skip(1);
		}
		System.out.println("Output");
		for(int i=0;i<ch.length;i++){
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'||ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U'){
				System.out.print(ch[i]+"  ");
			}
		}

	}
}
		
