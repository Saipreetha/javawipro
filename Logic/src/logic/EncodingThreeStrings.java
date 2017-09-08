package logic;
public class EncodingThreeStrings {
    public static String  Front1[]=new String[10];
	public static String  Middle1[]=new String[10];
	public static String  End1[]=new String[10];
	public static String output1="";
    public static String output2="";
    public static String output3="";
    public static String outputt3="";
    public static int d;
    public static void main(String[] args) {
		encodeThreeStrings ("Raagam", "Talam", "Pallavi");	
	}
	public static void encodeThreeStrings(String input1, String input2, String input3) {
		int a[]={(char)input1.length(),
		(char)input2.length(),
		(char)input3.length()};
		for(int j=0;j<3;j++){
		for(int i=0;i<3;i++){
		if((a[i])%3==1){
		Front1[j]=input1.substring(0,(a[i]%3));
		Middle1[j]=input1.substring((a[i]%3),a[i]-(a[i]%3));
	    End1[j]=input1.substring(a[i]-(a[i]%3));
	     }
		else if((a[i])%3==2){
			Front1[j]=input1.substring(0,(a[i]%3));
			Middle1[j]=input1.substring((a[i]%3),a[i]-(a[i]%3));
		    End1[j]=input1.substring(a[i]-(a[i]%3));
		 }
		else if((a[i])%3==0){
			Front1[j]=input1.substring(0,(a[i]%3));
			Middle1[j]=input1.substring((a[i]%3),a[i]-(a[i]%3));
		    End1[j]=input1.substring(a[i]-(a[i]%3));		 }
		}
		}
		output1=Front1[1]+Middle1[2]+End1[3];
		output2=Middle1[1]+End1[2]+Front1[3];
		output3=End1[1]+Front1[2]+Middle1[3];
     for(int i=0;i<output3.length();i++){
	 char[] e=output3.toCharArray();
	 d=(int)e[i];
	if(d>=97 && d<=122)
	{
		d=d-32;
		e[i]=(char)d;
	}
	else{
		d=d+32;
	e[i]=(char)d;}
	outputt3+=e[i];
}
System.out.println(output1);
System.out.println(output2);
System.out.println(outputt3);	
	}
}


