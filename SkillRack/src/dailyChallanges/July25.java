package dailyChallanges;
import java.util.*;
public class July25 {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int row=scan.nextInt();
		int column=scan.nextInt();
		int [][]arr=new int[row][column];
		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++){
				arr[i][j]=scan.nextInt();
			}
		}
		int [][]arr2=new int[row][column];
		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++){
		      if(j==0){
		    	  arr2[i][j]=arr[i][j+1];
		      }
		      else if(j==column-1){
		    	  arr2[i][j]=arr[i][j-1];
		      }
		      else{
		    	  arr2[i][j]=arr[i][j-1]+arr[i][j+1];
		      }
			}
		}
		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++){
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
		scan.close();
	
	
	}

}
