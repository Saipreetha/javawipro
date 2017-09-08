package dailyChallanges;
import java.util.*;
public class July20 {

    public static void main(String[] args) {
		//Your Code Here
		System.out.println("Enter the N");
		Scanner scan=new Scanner(System.in);
		int countries=scan.nextInt();
		int originalArray[]=new int[countries];
		int duplicateArray[]=new int[countries];
		int newArray[]=new int[countries];
		System.out.println("Enter the pp");
		for(int i=0;i<countries;i++){
			originalArray[i]=scan.nextInt();
			duplicateArray[i]=originalArray[i];
		}
		Arrays.sort(duplicateArray);
		for(int i=0,j=0;i<countries;i++,j++){
			
		}
	}
}