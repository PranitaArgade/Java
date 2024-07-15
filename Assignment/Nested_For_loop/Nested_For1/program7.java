/*
  -Write a program to print the following pattern
    D    D   D   D
    D    D   D   D 
    D    D   D   D
    D    D   D   D
    
    */
class Pattern7{
	public static void main(String[]args){
		int N=4;
		for(int i=1; i<=N; i++){
			for(int j=1; j<=N; j++){
				System.out.print("D" +"    ");
			}
			System.out.println();
		}
	}
}
