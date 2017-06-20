package String;
import java.util.Scanner;
public class EvenString {
	public static void main(String args[]){
		System.out.print("Enter the string");
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		scan.close();
		int length=str.length();
        if(length%2==0){
        	String str2=str.substring(0,(str.length()/2));
    		System.out.print(str2);
        }
        
	}
}
