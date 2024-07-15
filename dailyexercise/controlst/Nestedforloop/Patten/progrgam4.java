/* A  1  B  2
   A  1  B  2
   A  1  B  2
   A  1  B  2    
   
   Print the above patten. */

class Patten4{
	public static void main(String[]args){
		for(int i=1; i<=4; i++){
			int num=1;
			char ch='A';
			for(int j=1; j<=4; j++){
				if(j%2==0){
					System.out.print(num +" ");
					num=num+1;
				}else{
					System.out.print(ch++ + " ");
				     }
			  }
			System.out.println();
		}
	}
}
