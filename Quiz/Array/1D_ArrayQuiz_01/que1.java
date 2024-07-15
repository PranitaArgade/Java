//output:null null null null null
//reason:Array of object is initialized with null by default,so the index no value is put explicitly contain null. 

class Core2Web{
	public static void main(String[]args){
		Core2Web [] var1=new Core2Web[5];
		for(int var2=0; var2<var1.length; var2++)
			System.out.println(var1[var2]);
	}
}
