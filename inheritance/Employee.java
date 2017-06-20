package inheritance;

public	class Employee extends Person{
		double annualSalary;
		int yearOfJoining;
		String natInsuNum;
		Employee(){
			super("Sam");
		}
		Employee(double annualSalary){
			super();
			this.annualSalary=annualSalary;
			
		}
		
	    Employee(String natInsuNum){
	    	this();
			this.natInsuNum=natInsuNum;
			
        }
		
		void display(){
			System.out.println("The salary of the person is:"+annualSalary);
		}
		void disp2(){
		System.out.println("The national insurance number of the person is:"+natInsuNum);
		}
}
class TestEmployee{


	public static void main(String args[]){
		Employee me1 = new Employee(2.89);
	    Employee me = new Employee("12309");
	    me1.display();
	    me.disp2();
	    
}
}
