package map;
import java.util.*;
import java.util.Map.Entry;
public class map1 {
String CountryMap;
static HashMap<String,String> M1=new HashMap<String,String>();
public static HashMap<String,String> saveCountryCapital(String CountryName, String capital){
	M1.put(CountryName, capital);
	System.out.println(M1);
	return M1;
}

public static String getCapital(String CountryName){
String str=M1.get(CountryName);
	System.out.println(str);
    return str;	
}
public static String getCountry(String capital) {
    for(String o:M1.keySet()){
        if(M1.get(o).equals(capital)) {
            System.out.println(o);
        }
    }	   
	return capital;
}
static void getiterator(){
Iterator<Entry<String, String>> it = M1.entrySet().iterator();
HashMap<String,String> M2=new HashMap<String,String>();
    for(Entry<String, String> entry : M1.entrySet()){
        M2.put(entry.getValue(), entry.getKey());
    }
    System.out.println(M2);
}
static void itearator2(){
	Iterator<Entry<String, String>> it = M1.entrySet().iterator();
	ArrayList<String> al=new ArrayList<String>();
	for(Entry<String, String> arr:M1.entrySet()){
		al.add(arr.getKey());
	}
	System.out.println(al);
}
	public static void main(String[] args){
	saveCountryCapital("India", "Delhi");
	saveCountryCapital("Japan", "Tokyo");
	getCapital("India");
	getCountry("Tokyo");
	getiterator();
	itearator2();
}
}
