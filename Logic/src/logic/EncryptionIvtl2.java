package logic;
import java.util.HashMap;
public class EncryptionIvtl2 {
	public static String output="";
	public static void main(String args[]){
		usermethod("2k17 is the best year .");
		System.out.print(output);
	}
	public static void usermethod(String input1){
		String str=input1;
		char[] c=str.toCharArray();
		int loopcount=0;
		int count=0;
		for(int i=0;i<c.length;i++)
		{
		//System.out.println(c[i]+" "+i);
		boolean flag=true;
		for(int k=0;k<i;k++){
		if(c[i]==(str.charAt(k)))
		flag=false;
		}
		if(flag){
		for(int j=0;j<str.length();j++)
		{
		if(c[i]==str.charAt(j))
		count=count+1;
		}
		if(count>2){
			System.out.print(c[i]+count);
		}
		else{
			System.out.print(c[i]);
		}
		count=0;
		loopcount++;
		}
		}
		}
		boolean married=true;	   
		}
			

