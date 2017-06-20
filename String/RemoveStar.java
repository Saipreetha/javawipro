package String;
import java.util.Scanner;
public class RemoveStar {
	 public static void main(String args[]){
	 	  System.out.print("Enter the string with *:");
	 	  Scanner scan=new Scanner(System.in);
	 	  String str=scan.nextLine();
	 	  char c='*';
	 	  scan.close();
	 	  int len = str.length();
	 	  String finalString = "";
	 	  for (int i = 0; i < len; i++) {
	 	    if (i == 0 && str.charAt(i) != c){
	 	      finalString =finalString+ str.charAt(i);
	 	    }
	 	    if (i > 0 && str.charAt(i) != c && str.charAt(i-1) != c){
	 	      finalString =finalString + str.charAt(i);
	 	    }
	 	    if (i > 0 && str.charAt(i) == c && str.charAt(i-1) != c){
	 	      finalString = finalString.substring(0,finalString.length()-1);
	        }
	 	  }
	 	  System.out.print(finalString);
	 	}
}