/*
  -Write a program to print the countdown of days to submit the assignment*/

class Pr19{
	public static void main(String[]args){
		int days=6;
       		while(days>=0){
			if(days>=1){
		System.out.println(days+"days remainning");
		}else{
			System.out.println(days +"days assignmnent is overdue");
		}
		days--;
	}
	}
}
