package guvitest;
import java.util.Scanner;
public class camelcase {
	static String toCamelCase(String s){
	   String[] parts = s.split("_");
	   String camelCaseString = "";
	   for (String part : parts){
	      camelCaseString = camelCaseString + toProperCase(part);
	   }
	   System.out.print(camelCaseString);
	   return camelCaseString;
	}

	static String toProperCase(String s){
	    return s.substring(0, 1).toUpperCase() +
	               s.substring(1).toLowerCase();
	}
public static void main(String[] args){
	System.out.print("Enter the string");
	Scanner scan=new Scanner(System.in);
	String input=scan.nextLine();
	camelcase.toCamelCase(input);
	scan.close();
}
}
