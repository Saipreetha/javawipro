package dailyChallanges;
import java.util.*;
import java.util.Arrays;
public class Aug21 {
	public static void main(String[] args) {
		//Your Code Here
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=scan.nextInt();
		}
		scan.close();
		int count=0,count1=0;
		int mat=0;
		int del=0;
		for(int i=0;i<n;i++){
		    int match=arr[i];
		    for(int j=i+1;j<n;j++){
		        if(match==arr[j]&&match!=mat){
		            count++;
		            mat=match;
		        }
		                if(arr[i] == mat)
		                {
		                    		                    
		                        arr[j] = arr[j+1];
		                    }
		                    break;
		                }
		            }
		        
		    
		
    System.out.print(count);
	}
}