/* A  1  B  2
   C  3  D  4
   E  5  F  6
   G  7  H  8
     
   print above patten.  */


class Patten3{
	public static void main(String[]args){
		int N=4;
		int num=1;
		char ch='A';
		for(int i=1; i<=N; i++){
			for(int j=1; j<=N; j++){
				if(j%2==0){
					System.out.print(num++ +" ");
				}else{
					System.out.print(ch++ +" ");
				}
			}
			System.out.println();
		}
	}
}
