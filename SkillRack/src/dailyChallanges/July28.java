package dailyChallanges;
import java.util.*;
public class July28 {
	public static void main(String[] args) {
		//Your Code Here
		Scanner scan=new Scanner(System.in);
		String input=scan.nextLine();
		String[] input1=input.split(" ");
		int l=input1.length;
		for(int i=l-1;i>=0;i--){
		   System.out.print(input1[i]+" ");
		}
	}

}
