import java.io.*;
import java.util.*;
public class LuckyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
String[] str1=str.split("#");
int arr[]=new int[str1.length];
int l=str1.length;
int b=0;
int temp=0;
int flag;
int[] prime=new int[100];
for(int i=0;i<l;i++)
{
arr[i]=Integer.parseInt(str1[i]);	
}
int count=0;
for(int i=0;i<str1.length;i++){
	if(arr[i]>=11&&arr[i]<=9999){
		count++;
	}
}
if(count==arr.length){
	for(int i=0;i<l;i++)
	{
		temp=arr[i];
		while(temp!=0)
		{
			b=temp%10;
			if(b==2 || b==3 || b==5 || b==7 ){
			System.out.println(b);
			}}
			temp/=10;
			
			for(int j=0;j<l;j++)
		{
			for(int k=0;k<l;k++)
			{
				
			}
		}
		
	}
}
else{
	System.out.print("-9999");
}
          }
	}


