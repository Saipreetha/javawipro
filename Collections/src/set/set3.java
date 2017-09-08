package set;
import java.util.*;
public class set3 {
	public static void main(String[] args){
    TreeSet<String> tre=new TreeSet<String>();
    TreeSet<String> trerev=new TreeSet<String>();
	tre.add("Apple");
    tre.add("Mango");
    tre.add("Jack Fruit");
    String var="Mango";
    trerev=(TreeSet<String>)tre.descendingSet();
    System.out.println(trerev);
    Iterator<String> it=tre.iterator();
    Iterator<String> itr=tre.iterator();
    while(it.hasNext()){
    	System.out.println(it.next());
    }
    int c=0;
    while(itr.hasNext()){
    	if(itr.next().contains(var)){
    		c++;
    	}
    }
    if(c!=0){
    	System.out.print("The element exists");
    }
    else{
    	System.out.print("The element not exists");
    }
}
}
