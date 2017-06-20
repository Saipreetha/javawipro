package approach;
import java.util.Scanner;
public class pyramid1 {
public static void main(String []args){
	int row;
	System.out.println("Enter the rows");
	Scanner scan =new Scanner(System.in);
	row=scan.nextInt();
	for(int i=1;i<=row;i++){
		for(int j=1;j<=i;j++){
			System.out.print(+j);
		}
		System.out.println();
		scan.close();
	
	}
	
}
}
