package logic;

public class LongestPalindrome {
public static void main(String[] args) {
	String str="";
	String str1="";
	int c=0;
	StringBuffer str2=new StringBuffer(str);
	str2.reverse();
	if(str.contains(str2)){
		System.out.println(str2.length());
	}
	else {
		for(int i=0;i<str.length();i++){
			for(int j=i+1;j<str.length();j++){
				if(str.substring(i,i+1).equals(str.substring(j,j+1))){
					str1=str1+str.substring(i,i+1)+(str.substring(j,j+1));
					c++;
				}
		}
		}
		if(c!=0){
			System.out.println(str1.length()+1);
		}
		else{
			System.out.println(-1);
		}
	}
}
}