package logic;
public class Mania {
	public static int output1;
	public static int output2;
public static void main(String[] args){
	cosubstring("mania","m");
	System.out.println(output1);
	System.out.println(output2);
}
public static void cosubstring(String input1,String input2){
	for(int i=0;i<=input1.length();i++){
		for(int j=i+1;j<=input1.length();j++){
			String input3=input1.substring(i,j);
			if(input3.length()>1){
				output1++;
			if(input3.contains(input2)){
				output2++;
			}
			}
		}
	}
}
}
