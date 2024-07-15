class Exam{
	int No_QuePaper=50;
	int No_Student=50;
	static int AnsSheet=50;
	void ExamHall(){
		System.out.println("NO of Quespaper:"+No_QuePaper);
		System.out.println("No of Student:"+No_Student);
		System.out.println("AnsSheet"+AnsSheet);
	}
}
class Teacher{
	public static void main(String[]args){
		Exam obj1=new Exam();
		Exam obj2=new Exam();
		obj1.ExamHall();
		obj2.ExamHall();
		System.out.println("......................");
	        obj1.No_Student=40;
		obj2.AnsSheet=40;
		obj1.ExamHall();
		obj2.ExamHall();
	}
}
