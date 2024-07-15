 
//Take an integer value from user and perform addition,substraction,multiplication,division operation.

import java.io.*;
class MethodDemo5{

         void add(int x,int y){
                int ans=x+y;
		System.out.println("Add=" +ans);
        }
         void sub(int x,int y){
                int ans=x-y;
                System.out.println("Sub="+ans);
        }
         void mult(int x,int y){
                int ans= x*y;
                System.out.println("Mult="+ans);
        }
         void div(int x,int y){
                int ans=x/y;
                System.out.println("Div="+ans);
        }


        public static void main(String[]args)throws IOException{
         
         	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		MethodDemo5 obj=new MethodDemo5();
                System.out.println("Enter values");
                int x= Integer.parseInt(br.readLine());
                int y=Integer.parseInt(br.readLine());
                obj.add(x,y);
                obj.sub(x,y);
                obj.mult(x,y);
                obj.div(x,y);
        }
}
