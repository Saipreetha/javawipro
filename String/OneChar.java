package String;
import java.util.Scanner;
public class OneChar {
	public static void main(String args[]){
		System.out.print("Enter the two strings");
		Scanner scan=new Scanner(System.in);
		String str1=scan.nextLine();
		String str2=scan.nextLine();
		scan.close();
		int len=0;
		String extra=null;
		int len1=str1.length();
		int len2=str2.length();
		if(len1==len2){
			for(int i=0;i<len2;i++){
				System.out.print(str1.charAt(len+i));
				System.out.print(str2.charAt(len+i));
		}
		}
		else if(len1>len2){
		for(int i=0;i<len2;i++){
		System.out.print(str1.charAt(len+i));
		System.out.print(str2.charAt(len+i));
	    extra=str1.substring(i,str1.length());
	}
		System.out.print(extra);
	}
		else if(len1<len2){
			for(int i=0;i<len1;i++){
			System.out.print(str1.charAt(len+i));
			System.out.print(str2.charAt(len+i));
		    extra=str2.substring(i,str2.length());
		}
			System.out.print(extra);
		}
}
}