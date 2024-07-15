class Pr13{
	public static void main(String[]args){
		int N=110;

		for(int i=1; i<N; i++){
			int temp=1,count=0;
			while(temp!=0){
				count++;
				temp=temp/10;
			}

		
		if(count==3){
			System.out.println(i);
		}
	}
}
}
