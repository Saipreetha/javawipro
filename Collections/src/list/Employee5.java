package list;
import java.util.*;
public class Employee5 {
    	 int  id;
    	 String name;
    	 int address;
    	 int sal;
    	 public Employee5(int id,String name,int address,int sal){
    		  this.id=id;
    		  this.name=name;
    		  this.address=address;
    		  this.sal=sal;
    		  }
    	 public static void main(String[] args){
    	 List<Employee5> list=new ArrayList<Employee5>();
         Employee5 emp1=new Employee5(33186,"varun",23,2300);
         list.add(emp1);
         Employee5 emp2=(new Employee5(33187,"deepak",24,5600));
         list.add(emp2);
         Employee5 emp3=(new Employee5(33188,"apple",25,5000));
         list.add(emp3);
         Employee5 emp4=(new Employee5(33189,"rohan",26,5678));
         list.add(emp4);
         int var=23;
         Iterator<Employee5> itr=list.iterator();
          while(itr.hasNext())
         {
        	  Employee5 emp=(Employee5)itr.next();
        	  if(emp.address==var){
        	  System.out.println(emp.id+" "+emp.name+" "+emp.sal);
        	  }
         }
        }

    	 }

