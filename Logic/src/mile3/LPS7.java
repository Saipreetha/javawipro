package mile3;

public class LPS7 {
public static String jumblewords(String str1,int method){
    int num=method;
    String str=str1;
    String str2[]=str.split(" ");
    if(num==2){
    	for(int i=0;i<str2.length;i++){
    		String output1="";
    		String output2="";
    		for(int j=0;j<str2[i].length();j++){
    		if(j%2==0){
    		char ch=str2[i].charAt(j);
    		output1+=ch;
    		}
    		else{
    			char ch=str2[i].charAt(j);
    			output2+=ch;
    		}
    	}
    		System.out.print(output1+output2+" ");
    	}
    }
    if(num==1){
    	for(int i=0;i<str2.length;i++){
    		String output1="";
    		String output2="";
    		for(int j=0;j<str2[i].length();j++){
    		if(j%2==0){
    		char ch=str2[i].charAt(j);
    		output1+=ch;
    		}
    		else{
    			char ch=str2[i].charAt(j);
    			output2+=ch;
    		}
    	}
    		StringBuffer rev=new StringBuffer(output2);
    		rev.reverse();
    		System.out.print(output1+rev+" ");
    	}
    }
    
	return null;
}
public static void main(String[] args){
	String str="PROJECT BASED LEARNING";
	int method=1;
	LPS7.jumblewords(str,method);
}
}
