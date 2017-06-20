package String;
import java.util.Scanner;
public class LastCompare {
    public static void main(String args[]){
 	  System.out.print("Enter the string 1 & string 2");
 	  Scanner scan=new Scanner(System.in);
 	  String str1=scan.nextLine();
 	  String str2=scan.nextLine();
 	  scan.close();
 	 String low=str1.toLowerCase();
 	String low2=str2.toLowerCase();
 	  String com1=low.substring(str1.length()-1,str1.length());
 	  String com2=low2.substring(0,1);
 	  if(com1.equals(com2)){
 		  String com3=str1.substring(0,str1.length()-1);
 		 
 		  System.out.print(com3+str2);
 	  }
 	  else{
 		 		 System.out.print(str1+str2);
    }
    }

}
