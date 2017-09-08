package logic;

public class Decryption {	
	public static String output1="";
	public static void main( String [] args ) {
	userMethod( "XgzBgxxkbgg"); //Test Cases
	System.out.println( output1 ); //Check the output value
	}
	public static void userMethod( String input1 ) {
	// Code here
	int key=0;
	char ch[]=input1.toCharArray();
	if(ch[input1.length()-1]>=65&&ch[input1.length()-1]<=90){
		key=ch[input1.length()-1]-64;
	}
	else if(ch[input1.length()-1]>=97&&ch[input1.length()-1]<=122){
		key=ch[input1.length()-1]-96;
	}
	for(int i=0;i<input1.length()-1;i++){
		char cha=input1.charAt(i);
		char upp;
		char low;
		if(cha>=65&&cha<=90){
			upp=(char) ((char)cha+key);
			if(upp>=90){
				output1+=(char)(upp-26);
			}
			else{
				output1+=(upp);
			}
		}
		else if(cha>=97&&cha<=122){
			low=(char) ((char)cha+key);
			if(low>=122){
				output1+=(char)(low-26);
			}
			else{
				output1+=(low);
			}
		}
	}
	output1+=(ch[input1.length()-1]);
// assign the output value at the end
}
}