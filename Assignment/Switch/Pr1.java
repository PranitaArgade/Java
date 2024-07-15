/*
 Write a program in which students should enter marks of 5 different subjects. If all subject
having above passing marks add them and provide to switch case to print grades(first class
second class), if student get fail in any subject program should print “Y ou failed in exam”
*/

import java.io.*;
class Student{
	public static void main(String[]args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int Java;
		Java=Integer.parseInt(br.readLine());
		System.out.println("Enter the java Marks:  "+Java);
		
	        int CNS;
		CNS=Integer.parseInt(br.readLine());
		System.out.println("Enter the cns marks:  "+CNS);

		int WAD;
		WAD=Integer.parseInt(br.readLine());
		System.out.println("Enter the WAD marks:  "+WAD);

		int CC;
		CC=Integer.parseInt(br.readLine());
		System.out.println("Enter the CC marks:  "+CC);

		int DS;
		DS=Integer.parseInt(br.readLine());
		System.out.println("Enter the DS marks:  "+DS);

	       if(Java<35||CNS<35||WAD<35||CC<35||DS<35){
		       System.out.println("You are fail in exam");
	       }else{
		       double avg=(Java+CNS+WAD+CC+DS)/5;
		       System.out.println(avg);
		       char ch;
		       if(avg>75){
			       ch='A';
		       }else if(avg>60){
			       ch='B';
		       }else if(avg>50){
			       ch='C';
		       }else if(avg>35){
			       ch='D';
		       }else{
			       ch='F';
		       }
		  
	       
	       switch(ch){
		       case 'A':
			       System.out.println("First class with Distinction");
			       break;
		        case 'B':
			       System.out.println("First class");
			       break;
			case 'C':
			       System.out.println("Second class");
			       break;
			case 'D':
			       System.out.println("Third class");
			       break;
			case 'E':
			       System.out.println("Pass");
			       break;
			case 'F':
			       System.out.println("Fail in exam");
			       break;
			 default:
			       System.out.println("Invalid marks");
			       break;
	       }
	       }
	}



}
