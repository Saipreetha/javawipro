package mile3;
import java.util.*;
public class LPS6 {
static int findKey(int input1[],int input2){
	int arr[]=input1;
	int num=input2;
	int key[]=new int[num];
	int value[]=new int[num];
	int count=0;
	for(int i=0;i<arr.length;i++){
		if(arr[i]<0){
			count++;
		}
	}
	int m=0;
	int hem=0;
	int rem=0;
	int fina=0; 
	if(count!=num){
         for(int i=0;i<arr.length;i=hem){
        	 if(arr[i]<0){
        		// System.out.println(arr[i]);
        		 for(int f=0;f<key.length;f++){
        			 if(f%2!=0){
        				 fina=fina+key[f];
        			 }
        			 else{
        				 fina=fina-key[f];
        			 }
        		 }
        		 System.out.print(fina);
        	 }
        	 else{
        		 rem=arr[i]/10;
        		 key[m]=rem;
        		 hem=arr[i]%10;
        		 value[m]=hem;
        	 }
         }
	}
	else{
		Arrays.sort(arr);
		System.out.println(arr[num-1]);
	}
	return 0;
}
public static void main(String[] args){
	int arr[]={74,-56,15,71,92,23};
	int num=6;
	LPS6.findKey(arr,num);
}
}
