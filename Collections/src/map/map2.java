package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class map2 {
public static HashMap<String,String> M1=new HashMap<String,String>();
public static HashMap<String,String> keyenter(String CountryName,String capital){
	M1.put(CountryName,capital);
	return M1;
}
public static String keycheck(String CountryName){
	int c=0;
	for(String s:M1.keySet()){
		if(s.contains(CountryName)){
			c=1;
		}
	}
	if(c!=0){
	System.out.println("Exists");
	}
		else{
			System.out.println("Not Exists");		
		}
	return CountryName;
}
public static String valuecheck(String capital){
	int c=0;
	for(String s:M1.values()){
		if(s.contains(capital)){
			c=1;
		}
	}
	if(c!=0){
	System.out.println("Exists");
	}
		else{
			System.out.println("Not Exists");		
		}
	return capital;
}
public static String iterators(){
Iterator<Entry<String, String>> it=M1.entrySet().iterator();
while(it.hasNext()){
	System.out.println(it.next());
}
return null;
}
public static void main(String[] args){
	keyenter("India","Delhi");
	keyenter("Japan","Tokyo");
	keycheck("India");
	valuecheck("Tyojg");
	iterators();
}
}

