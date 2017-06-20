package String;
import java.util.Scanner;
public class RepeatN {
	public static void main(String args[]){
	 	  System.out.print("Enter the string & num (Betweeen string length):");
	 	  Scanner scan=new Scanner(System.in);
	 	  String str=scan.nextLine();
	 	  int num=scan.nextInt();
	 	  scan.close();
	 	  String str2=str.substring(num-1,str.length());
	 	  for(int i=0;i<num;i++){
	 		  System.out.print(str2);
	 	  }

}
}