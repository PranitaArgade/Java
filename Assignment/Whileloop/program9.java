/* Write a program to print the countdown of days to submit the Assignment.
 - input: day=7
 - output: 7 days remaining
           6 days remaining
	   5 days remaining
	   .
	   .
	   1 days remaining
	   0 days remaining is Overdue
*/
class Countdown_of_days_9{
	public static void main(String[]args){
		int day=7;
		if(day==0){
			System.out.println(day +" days Assignment is Overdue");
		}else{
			while(day>=1){
				System.out.println(day+" days remaining");
				day--;
			}

		if(day==0){
			System.out.println(day +" days remaining is Overdue");
		}
		}
	}
}	
