package Kumar143;



public class Student {


	String sName;
	int sRollNo;
	Student(String Name,int Rollno){
	this.sName =Name;
	this.sRollNo=Rollno;
	}
	
	public static void main(String[] args) {
	 
		Student s1=new Student("Prem",100);
		System.out.println(s1.sName);
		System.out.println(s1.sRollNo);

		Student s2=new Student("Nagesh",101);
		System.out.println(s2.sName);
		System.out.println( s2.sRollNo);
		
		
	

}
}