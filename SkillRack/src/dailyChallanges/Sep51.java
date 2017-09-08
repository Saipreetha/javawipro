package dailyChallanges;
import java.util.*;
public class Sep51  {
	   public static void main(String[] args) {
			//Your Code Here
			Scanner scan=new Scanner(System.in);
			int input=scan.nextInt();
			for(int i=1;i<=input;i++){
			    System.out.print(i+" ");
			}
			System.out.println();
			for(int i=(input*2)+1;i<=input*3;i++){
			    System.out.print(i+" ");
			}
			System.out.println();
			for(int i=(input*3)+1;i<=input*4;i++){
			    System.out.print(i+" ");
			}
	        System.out.println();
	        for(int i=(input+1);i<=input*2;i++){
	            System.out.print(i+" ");
	        }
		}
	}
