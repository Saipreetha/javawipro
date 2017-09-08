package logic;
public class PossibleWords1 {
	public static String output1="";
public static void main(String[] args){
	IdentifyPossibleWords("Fi_er","Fever:filer:Filter:Fixer:fiber:fibre:tailor:offer");
	System.out.println(output1);
}
public static void IdentifyPossibleWords(String input1,String input2){
	try{
		String first1="";
		String last1="";
		String first="";
		String last="";
	    char ch[]=input1.toCharArray();
		for(int i=0;i<=input1.length();i++){
			if(ch[i].equals('_')){
				
			}
			 first=input1.toLowerCase().substring(0,input1.length()/2);
		     last=input1.toLowerCase().substring(input1.length()-2,input1.length());
		}
		for(int i=0;i<=input2.length();i++){
			String input3= input2.toLowerCase().substring(i,i+input1.length());
			if(input3.contains(":")){
			}
			else{
				 first1=input3.substring(0,2);
				 last1=input3.substring(input1.length()-2,input1.length());
			    if(first.equals(first1)&&last.equals(last1)){
				output1+=(input3.toUpperCase()+":");
			}
			}
		}
	}
	catch(StringIndexOutOfBoundsException e){
		//System.out.println(); 
	}
	}
}

