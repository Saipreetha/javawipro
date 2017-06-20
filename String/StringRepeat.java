package String;
import java.util.Scanner;
public class StringRepeat {
	public static void main(String args[]){
		System.out.print("Enter the string");
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		scan.close();
		int length=str.length();
		if(str.length()<2){
			System.out.print(str);
		}
		else{
		for(int i=0;i<length;i++){
			String str2=str.substring(0,2);
			System.out.print(str2);
		}
		}
	}

}
