package mile3;
import java.io.*;
import java.util.*;
public class LPS4 {
public static int nnGenereator(String input1){
	String str=input1;
	String output=" ";
	int k=2,m=1;
	int sum=0;
	int h=0;
	for(int i=0;i<input1.length();i++){
		String first=str.substring(i,m);
		int fir=Integer.parseInt(first);
		m++;
		if(fir%2==0)
			h=0;
		else
			h=1;
		for(int j=i+1;j<input1.length();j++){
		String ch=str.substring(i,k);
		int num=Integer.parseInt(ch);
		k++;
		sum=sum+num;
		if(h==0){
		if(sum%2==0){
		    output=Integer.toString(sum);
		}
		}
		else{
			if(sum%2!=0){
			    output=Integer.toString(sum);
			}
		}
	}
	}
	System.out.println(output);
	return 0;
}
public static void main(String[] args){
	String str="9880127431";
	LPS4.nnGenereator(str);
}
}
