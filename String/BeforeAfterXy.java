package String;
import java.util.Scanner;
public class BeforeAfterXy {
	public static void main(String args[]){
	 	  System.out.print("Enter the string 1 & string 2:");
	 	  Scanner scan=new Scanner(System.in);
	 	  String str=scan.nextLine();
          String str2=scan.nextLine();
          scan.close();
          String finalString="";
          int len = str.length();
          int len2 = str2.length();
          for (int i = 0; i < (len-len2)+1; i++) {
             String tmp = str.substring(i,i+len2);
           if (i > 0 && tmp.equals(str2)){
              finalString =finalString + str.substring(i-1,i);
           }
              if (i < len-len2 && tmp.equals(str2)){
               finalString = finalString +str.substring(i+len2,i+len2+1);
              }
              }
          
            System.out.print(finalString);
          
          }
}
