package password;
import java.util.Scanner;
public class TestCode {
   String output;
   TestCode(){
	   
   }
   String passGen(String input1,String input2,long input3){
	   String inp1=input1;
	   String inp2=input2;
	   int last;
	   inp1=input1.substring(inp1.length()-2,inp1.length());
	   inp2=input2.substring(0,2);
	   String upp=inp1.toUpperCase();
	   String low=inp2.toLowerCase();
	   last=(int) ((input3)%10);
	   int first=0;
	   int seven=0;
	   int rem=0;
	   while(input3!=0){
		   first=(int)(input3%10);
		   rem=(int)(input3%10);
		   seven=seven+rem;
		   input3=input3/10;
	   }
	   int sem=0;
	   int yum=0;
	   if(seven>9){
		   while(seven!=0){
		   sem=seven%10;
		   yum=yum+sem;
		   seven=seven/10;
	   }
		   output = "" +upp+last+ first+low+yum;
	   }
		   else{
			   output = "" +upp+last+ first+low+seven;  
		     }
	   int hum=0;
	   int jim=0;
	   if(yum>9){
		   while(yum!=0){
			   hum=yum%10;
			   jim=jim+hum;
			   yum=yum/10;
		   }
		   output = "" +upp+last+ first+low+jim;
	   }
	   
	  System.out.print("your password is:"+output);
	return output; 
	}
}
class TestMain{
	public static void main(String args[]){
		TestCode you=new TestCode();
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the first name minimum 3 characters");
		String input1=scan.nextLine();
		System.out.print("Enter the last name minimum 3 characters");
		String input2=scan.nextLine();
		System.out.print("Enter the Mobile number");
		long input3=scan.nextLong();
		you.passGen(input1, input2, input3);
		scan.close();
	}
}