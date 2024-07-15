//Multiples of its digits 
//input:6531
//output:90

class Mul{
	public static void main(String[]args){
		int N=6531;
		int mul=1;
		while(N!=0){
			int rem=N%10;
			mul=mul*rem;
			N=N/10;
		}
		System.out.println(mul);
	}
}
