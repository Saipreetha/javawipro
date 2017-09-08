package set;
import java.util.*;
public class Employee {
	HashSet<String> set=new HashSet<String>();
    void employee(String emp_name){
	set.add(emp_name);
	Iterator<String> it=set.iterator();
    while(it.hasNext()){
    	System.out.println(it.next());
    }
}
    public static void main(String[] args){
    	Employee emp=new Employee();
    	emp.employee("sam");
    	emp.employee("joe");
    	emp.employee("john");
    }
}
