package inheritance;

public class Person2 {
	char gender;
	String Name;
	Person2(){
		
	}
	Person2(char gender,String Name){
		this.gender=gender;
		this.Name=Name;
	}

}
class Student extends Person2{
	String stuname;
	Student(){
		
	}
	Student(String stuname){
		this.stuname=stuname;
	}
}
class Teacher extends Person2 {
              int salary;
              String sub;
          Teacher(){
        	  
          }
         Teacher(int salary,String sub){
        	 super('m',"Sam");
        	 this.salary=salary;
        	 this.sub=sub;
         }
         void display(){
        	 System.out.println("Name & Gender of the Person is:"+Name+"\t" +gender);
     		System.out.println("Salary & subject of the teacher is:"+salary+"\t"+sub);
         }
}
class CollegeStudent extends Student{
	int year;
	String major;
	CollegeStudent(){
		
	}
	CollegeStudent(int year,String major){
		super("Harish");
		this.year=year;
		this.major=major;
	}
	void display1(){
		System.out.println("Name of the Student is:"+stuname);
		System.out.println("Year & major of the Student is:"+year+"\t"+major);
	}
}
class TestStudent{
       public static void main(String args[]){
		CollegeStudent me1 = new CollegeStudent(2018,"EEE");
	    Teacher me = new Teacher(20000,"Maths");
        me1.display1();
        me.display();
	    
}
}
