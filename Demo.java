class Marks{
	int prfMarks;
	int dbmsMarks;
	Marks(int prfMarks, int dbmsMarks){
		this.prfMarks=prfMarks;
		this.dbmsMarks=dbmsMarks;
	} 
}
class Student{
	String id;
	String name;
	Marks studentMarks;
	
	Student(){
	}
	Student(String id, String name){
		this.id=id;
		this.name=name;
	} 
}
class Demo{
	public static void main(String args[]){
		Student s1=new Student("S0001","Nimal");	
		s1.studentMarks=new Marks(67,78);
	}
}
