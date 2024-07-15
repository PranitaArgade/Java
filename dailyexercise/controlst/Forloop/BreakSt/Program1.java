//Write a java program to check the no is prime no or not.
//Main code
class Prime{
	public static void main(String[]args){
		int N=15;
		int count=0;
		for( int i=1; i<=N; i++){
			if(N%i==0){
				count++;
			}
			if(count>2){
				break;
			}
		}
			if(count==2){
				System.out.println("Prime number");
			}else
				System.out.println("Not prime");
		
	}
}
