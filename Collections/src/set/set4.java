package set;

import java.util.TreeSet;
import java.util.Iterator;

public class set4 {
	String CountryName;
public static TreeSet<String> H1=new TreeSet<String>();
static String saveCountryNames(String CountryName){
	H1.add(CountryName);
	System.out.println(H1);	
	return CountryName;
}
 String getCountry(String CountryName){
	this.CountryName=CountryName;
	Iterator<String> it=H1.iterator();
	int c=0;
	while(it.hasNext()){
		if(it.next().toString().equals(CountryName)){
			c=1;	
		}
	}
		if(c!=0){
			System.out.println(CountryName);
		}
		else{
			System.out.println("Null");
		}
	
	return CountryName;
}
public static void main(String[] args){
	set4 so=new set4();
	saveCountryNames("India");
	saveCountryNames("China");
	saveCountryNames("Japan");
	so.getCountry("China");
}
}
