package String;
import java.util.Scanner;
public class Pallindrome {
	public static void main(String args[]){
		System.out.print("Enter the string");
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		scan.close();
		StringBuffer str2=new StringBuffer(str);
		StringBuffer str3=new StringBuffer(str2);
		str3.reverse();
		System.out.println(str3);
		 if(String.valueOf(str).compareTo(String.valueOf(str3))==0){
			System.out.println(" a given String is Palindrome");
		}
		else{
			System.out.println(" a given String is not a Palindrome");
		}
		
	}

}
