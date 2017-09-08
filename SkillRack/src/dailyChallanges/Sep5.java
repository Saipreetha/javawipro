package dailyChallanges;
import java.util.*;
public class Sep5 {
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int in=1;
		int arr[][]=new int[a][a];
		for(int i=0;i<a;i++){
		for(int j=0;j<a;j++){ 
			   arr[i][j]=in;
		       in++;
		}
		}
		for(int i=0;i<a;i++){
			for(int j=0;j<a;j++){
				if(i%2==0){
				System.out.print(arr[i][j]+" ");
				}
		}
			if(i%2==0){
				System.out.println();
			}
		}
		for(int i=a-1;i>=0;i--){
			for(int j=0;j<a;j++){
				if(i%2!=0){
				System.out.print(arr[i][j]+" ");
				}
			}
			if(i%2!=0){
				System.out.println();
			}
		}

} 
}
