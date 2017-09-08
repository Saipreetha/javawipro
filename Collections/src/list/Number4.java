package list;
import java.util.*;
public class Number4 {
	public static void main(String[] args){
	ArrayList al=new ArrayList();
	al.add(1.4);
	al.add(3);
	al.add(2.7f);
    for(int i=0;i<al.size();i++){
    	Object o=al.get(i);
    	if(o instanceof Double || o instanceof Float || o instanceof Integer){
            System.out.println("Value is "+o.toString());    
        }
    }
}
}