package classObjects;

public class Patient {
	String patient_name;
	void Bmi(double weight,double height){
		System.out.print((weight / ( height  * height ) ) * 703);
	    }
public static void main(String args[]){
	Patient Patients=new Patient();
	Patients.Bmi(117,62);
}
}
