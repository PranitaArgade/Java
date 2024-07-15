/*
 Take choices from user:
 What's your interest?
1.movies
2.Series
Enter your choice 1 or 2 :
1
Movie you wish to watch today
1.Founder
2.Snowden
3.Jobs
4.Her
5.Social Network
6.Wall-E
7.AI
Enter your choice
1
1:Founder
Enter your choice 1 0r 2:
2
Best Series to watch
1.Silicon valley
2.Devs
3.the IT crowd
4.Mr Robot
Enter your choice
4
4.Mr.Robot
*/
import java.util.*;
class Pr4{
	public static void main(String[]args){
		System.out.println("What's your interest?");
		System.out.println("1.movies");
		System.out.println("2.Series");
		System.out.println("Enter your choice 1 or 2 :");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		 switch(num){
			  case 1:
				  System.out.println("Movie you wish to watch today");
				  System.out.println("1.Founder");
				  System.out.println("2.Snowden");
				  System.out.println("3.Jobs");
				  System.out.println("4.Her");
				  System.out.println("5.Social Network");
				  System.out.println("6.Wall-E");
				  System.out.println("7.AI");
				  System.out.println("Enter your choice");
				  int num2=sc.nextInt();
				  switch(num2){
					  case 1:
						  System.out.println("1:Founder");
						  break;
				          case 2:
						  System.out.println("2:Snowden");
						  break;
				          case 3:
						  System.out.println("3:Jobs");
						  break;
				          case 4:
						  System.out.println("4:Her");
						  break;
					 case 5:
						  System.out.println("5:Social Network");
						  break;
					 case 6:
						  System.out.println("6:Wall-E");
						  break;
				         case 7:
						  System.out.println("7:AI");
						  break;


						 }
				  break;
		  case 2:
				  System.out.println("Best Series to watch");
				  System.out.println("1.Silicon valley");
				  System.out.println("2.Devs");
				  System.out.println("3.the IT crowd");
				  System.out.println("4.Mr Robot");

				  System.out.println("Enter your choice");
				  int num3=sc.nextInt();
				  switch(num3){
					  case 1:
						  System.out.println("1:Silicon valley");
						  break;
				          case 2:
						  System.out.println("2.Devs");
						  break;
					 case 3:
						  System.out.println("3.the IT crowd");
						  break;
					  case 4:
						  System.out.println("4.Mr.Robot");
						  break;
					}
				  break;
				  }
	}
}


