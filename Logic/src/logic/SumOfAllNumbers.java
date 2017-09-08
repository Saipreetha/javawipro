package logic;
public class SumOfAllNumbers {
	public static int output1;
public static int output2;
public static void main(String [] args) {
int  arr[] = new int []{3,-4,6,2,-6,3};
findOriginalFirstAndSum(arr);
System.out.println(output1);
System.out.println(output2);
}
public static void findOriginalFirstAndSum(int [] input1) {
  int [] input2=new int[input1.length];
  input2[input1.length-1]=input1[input1.length-1];
  int last=input2[input1.length-1];
 for(int i=input1.length-1;i>0;i--){
	input2[i-1]=last-input1[i-1];
	last=input2[i-1];
 }
 int sum=0;
 for(int i=0;i<input2.length;i++){
    sum=sum+input2[i];
 }
output1=input2[0];
output2 =sum;
}
}