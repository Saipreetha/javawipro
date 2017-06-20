package String;
import java.util.Scanner;
public class SeperatorString {
	  public static void main(String args[]){
	 	  System.out.print("Enter the string 1 & string 2 & number of time repeated");
	 	  Scanner scan=new Scanner(System.in);
	 	  String str1=scan.nextLine();
	 	  String str2=scan.nextLine();
	 	  int num=scan.nextInt();
	 	  scan.close();
	 	  int i=num;
	 	  while(i!=0){
	 		  System.out.print(str1);
	 		  i--;
	 		  if(i!=0){
	 		 System.out.print(str2);
	 	  }
	 	  }

}
}