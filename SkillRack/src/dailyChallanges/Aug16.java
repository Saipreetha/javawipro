package dailyChallanges;

import java.util.Scanner;

public class Aug16 {
	public static void main(String[] args) {
		//Your Code Here
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		int arr[][]=new int[num][3];
		for(int i=0;i<num;i++){
		    for(int j=0;j<3;j++){
		        arr[i][j]=scan.nextInt();
		    }
		}
		scan.close();
		int rem[]=new int [num];
		int rem2[]=new int[num];
        for(int i=0;i<num;i++){
        	for(int j=0;j<2;j++){
            rem[j]=arr[i][2]-arr[i][j];
            rem2[j]=Math.abs(rem[j]);
        }
        	if(rem2[0]<rem2[1]){
        		System.out.println("Police 1");
        	}
        	else if(rem2[0]>rem2[1]){
        		System.out.println("Police 2");
        	}
        	else if(rem2[0]==rem2[1]){
        		System.out.println("Both");
        	}
        }
	}
}

