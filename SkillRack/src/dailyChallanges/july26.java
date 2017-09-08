package dailyChallanges;
import java.util.*;
public class july26 {
	public static void main(String[] args){
	Scanner scan=new Scanner(System.in);
	int num=scan.nextInt();
	int arr[]=new int[num];
	for(int i=0;i<num;i++){
	    arr[i]=scan.nextInt();
	}
    for(int i=0;i<num;i++){
    	int max=0;
        if(i==0){
            System.out.print(-1+" ");
        }
        else if(arr[i-1]>arr[i]){
        	System.out.print(arr[i-1]+" ");
        }
        else if(arr[i-1]<arr[i]){
        	for(int j=0;j<i-1;j++){
        		if(arr[j]>arr[i]){
        			max=arr[j];
        		}
        	}
        	if(max>0){
        		System.out.print(max+" ");
        	}
        	else{
        		System.out.print(-1+" ");
        	}
        }
        else{
        	for(int j=0;j<i-1;j++){
        		if(arr[j]>arr[i]){
        			max=arr[j];
        		}
        	}
        	if(max>0){
        		System.out.print(max+" ");
        	}
        	else{
        		System.out.print(-1+" ");
        	}
        }
    }
    scan.close();
}
}
