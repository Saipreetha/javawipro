package dailyChallanges;
import java.util.*;
public class july24 {
	public static void main(String []args){
		Scanner scan=new Scanner(System.in);
		 String output="";
		int input=scan.nextInt();
		scan.close();
	    for(int row=0;row<input;row++){
		for(int i=1;i<input-row;i++){
	    	System.out.print('*');
	    	output+='*';
	    }
		System.out.print('/');
		output+='/';
		for(int i=0;i<row;i++){
			System.out.print('*');
			System.out.print('*');
			output+='*';
			output+='*';
		}
		System.out.print('\\');
		output+='\\';
		for(int i=1;i<input-row;i++){
	    	System.out.print('*');
	    	output+='*';
	    }
		System.out.println();
		output+='\n';
		}
	    StringBuffer rev=new StringBuffer(output);
	    StringBuffer fin=rev.reverse();
	    String hh=new String(fin);
	    System.out.print(hh.substring(1));
}
}
