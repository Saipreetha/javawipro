package set;
import java.util.*;
public class country {
	String CountryName;
public static HashSet<String> H1=new HashSet<String>();
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
		if(it.next()==CountryName){
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
	country co=new country();
	saveCountryNames("India");
	saveCountryNames("China");
	saveCountryNames("Japan");
	co.getCountry("China");
}
}
