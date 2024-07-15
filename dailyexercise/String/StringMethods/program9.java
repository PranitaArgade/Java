class LastIndexOfDemo{
	public static void main(String[]args){
		String str="Shashi";
		System.out.println(str.lastIndexOf('h',2));//1(beacause searcing h upto index 2
                System.out.println(str.lastIndexOf('h',0));//-1(beacuse upto 0 not content exit i.e why -1)
		System.out.println(str.lastIndexOf('h',6));//4

	}
}
