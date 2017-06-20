package String;
import java.util.Scanner;
public class DeleteXChar {
	public static void main(String args[]){
		System.out.print("Enter the string");
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		scan.close();
		String low=str.toLowerCase();
		 String com1=low.substring(low.length()-1,low.length());
	 	  String com2=low.substring(0,1);
	 	  if(com1.equals("x")&&com2.equals("x")){
	 		 String com3=str.substring(1,str.length()-1);
	 		 System.out.print(com3);
	 	  }
	 	  else{
	 		 System.out.print(str);
	 	  }
}
}
