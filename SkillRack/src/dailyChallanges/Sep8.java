package dailyChallanges;
import java.util.*;
public class Sep8 {
	 public static void main(String[] args) {
			//Your Code Here
			Scanner scan=new Scanner(System.in);
			String str=scan.nextLine();
			int n=scan.nextInt();
			int len=str.length();
			int j=0;
			int count=0;
			    for(int k=n;k<=len;k=k+n){
			    if(count%2==0){
			    String re1=str.substring(j,k);
			    System.out.print(re1);
			    System.out.println();
			    }
			    else{
			    	String re1=str.substring(j,k);
			    	StringBuffer rev=new StringBuffer(re1);
			    	rev.reverse();
				    System.out.print(rev);
				    System.out.println();
			    }
			    count++;
			    j=k;
			}
				String output="";
		        if(len%n!=0){
		            int y=n-(len%n);
		            while(y!=0){
		                output+="*";
		                y--;
		            }
		        }
				if(count%2==0)
				  System.out.print((str.substring(j))+output);
				else{
				    StringBuffer rev=new StringBuffer(str.substring(j)+output);
				    rev.reverse();
				    System.out.print(rev);
				}
			}
		}
