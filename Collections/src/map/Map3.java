package map;
import java.util.*;
import java.util.Map.Entry; 
public class Map3 {
	public static void main(String[] args){
		Properties capital=new Properties();
	    capital.put("TamilNadu", "Chennai");
	    capital.put("Karnataka","Bangalore");
	    Iterator<Entry<Object, Object>> it=capital.entrySet().iterator();
	    while(it.hasNext()){
	    	System.out.println(it.next());
	    }
	}
}
