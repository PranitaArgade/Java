//Write a java program without break.
//Not optimize code

class Prime2{
	public static void main(String[]args){
		int N=15;
		int count=0;
		int i=1;
		for(i=1; i<=N; i++){
			if(N%i==0){
				count++;
			}
			/*if(count>2){
				break;
			}*/
		}
		System.out.println(i);
		System.out.println(count);
		if(count==2){
			System.out.println("Prime");
	         }else
	           System.out.println("Not prime");
	}
}

