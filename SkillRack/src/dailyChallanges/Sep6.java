package dailyChallanges;

import java.util.Scanner;

public class Sep6 {
	public static void main(String[] args) {
		//Your Code Here
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		scan.close();
		for(int row=1;row<=num;row++){
				for(int j=row;j<row;j++){
					System.out.print(j);
				}
			System.out.println();
		}
		
		/*for(int row=num;row>0;row--){
			for(int i=1;i<=row;i++){
				for(int j=row;j<=row;j++){
					System.out.print(j);
				}
			}
			System.out.println();
		}*/
	}
}
