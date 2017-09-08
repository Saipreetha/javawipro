package logic;
public class WiFiPINGenerator {
	public static String output1="";
    public static void main( String [] args ) {
   pinGenerator (324,"YUGAN");//Check your Test Cases
	System.out.print(output1);
}
public static void pinGenerator (int input1, String input2) {
	int n=input1;
	int sum;
	while (n>9){
        sum=0;
    while (n>0) {
   int rem;
   rem=n%10;
   sum=sum+rem;
   n=n/10;
}
n=sum;
}
	if(n==1){
		output1+=(n+1);
	}
	else if(n%2!=0){
		output1+=(n-1);
	}
	else{
		output1+=(n);
	}
int spl=input1%10;
char arr[]={')','!','@','#','$','%','^','&','*','('};
output1+=(arr[spl]);
char ch[]=input2.toCharArray();
	char lst=ch[input2.length()-1];
	output1+=(lst);
	int i=0;
	int last1[]=new int[3];
	while(input1!=0){
	 last1[i]=input1%10;
	 input1=input1/10;
	 i++;
	}
	output1+=(last1[1]);
}
}
