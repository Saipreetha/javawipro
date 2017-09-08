package map;
import java.util.*;
import java.util.Map.Entry;
public class Map6 {
	String CountryMap;
static Hashtable<String,String> M1=new Hashtable<String,String>();
public static Hashtable<String,String> saveCountryCapital(String CountryName, String capital){
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
static Hashtable<String,String> getiterator(){
Iterator<Entry<String, String>> it = M1.entrySet().iterator();
Hashtable<String,String> M2=new Hashtable<String,String>();
for(Entry<String, String> entry : M1.entrySet()){
    M2.put(entry.getValue(), entry.getKey());
}
System.out.println(M2);
return M2;
}
static ArrayList<String> itearator2(){
Iterator<Entry<String, String>> it = M1.entrySet().iterator();
ArrayList<String> al=new ArrayList<String>();
for(Entry<String, String> arr:M1.entrySet()){
	al.add(arr.getKey());
}
System.out.println(al);
return al;
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
