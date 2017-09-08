package list;
import java.util.*;
public class Employee {
    String e;
    int eCode;
}
class EmployeeDB{
	boolean addEmployee(Employee e){
		return true;
	}
	boolean deleteEmployee(int eCode){
		return true;
	}
	String showPaySlip(int eCode){
		return true;
	}
	Employee[] listAll() ;

public static void main(String[] args){
	  List<Employee> list=new ArrayList<Employee>();
	  list.add(123,null);
	  list.addAll(9,'u');	  
}
}