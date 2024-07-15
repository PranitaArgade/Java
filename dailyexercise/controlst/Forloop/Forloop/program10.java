
/*
 -Armstrong number for any number.
 - Final code
 */

class Armstrong10{
	public static void main(String[]args){
		int N=153;
		int temp1=N;
		int temp2=N;
		int sum=0;
		int count=0;
		while(temp1!=0){               //calculate count
			count++;
			temp1=temp1/10;
		}
		while(N!=0){                    //calculate sum
			int rem=N%10;
			int mult=1;
			for(int i=1; i<=count; i++){
				mult=mult*rem;
			}
			sum=sum+mult;
			N=N/10;
		}                                       
		if(temp2==sum){                  // Check is it Armstron or not
			System.out.println("Armstrong Number");
		}else{
			System.out.println("Not Armstrong");
		}
		
		}
}
