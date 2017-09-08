package mile3;
import java.util.*;
import java.util.Map.Entry;
public class LPS3 {
 public static void generator(int arr[],String str){
 String upper="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
 String fri=str.toUpperCase();
 String str1[]=fri.split(" ");
 HashMap<Character,Integer> map=new HashMap<Character,Integer>();
 for(int i=0;i<upper.length();i++){
	 char ch=upper.charAt(i);
	 map.put(ch,i+1);
 }
 
 HashMap<Character,Integer> map1=new HashMap<Character,Integer>();
 for(int i=0;i<arr.length;i++){
	 char ch=upper.charAt(i);
	 map1.put(ch,arr[i]);
 }
 /*Iterator<Entry<Character,Integer>> it = map1.entrySet().iterator();
while(it.hasNext()){
	System.out.println(it.next());
}*/
 int sum[]=new int[str1.length];
for(int i=0;i<str1.length;i++){
	for(int j=0;j<str1[i].length();j++){
		char ch=str1[i].charAt(j);
		int temp=map1.get(ch);
		System.out.println(temp);
		if((j!=str1[i].length()-1)&&(temp>=0)){
		sum[i]=sum[i]+(temp);
		System.out.println(sum[i]);
		}
		else{
			int temp2=map.get(ch);
			System.out.println(temp2);
			sum[i]=sum[i]+(temp+temp2);
			System.out.println(sum[i]);
		}
	}
}
int pro=1;
for(int i=0;i<sum.length;i++){
	 pro=pro*sum[i];
	 //System.out.println(sum[i]);
}
System.out.println(pro);
 }
 public static void main(String[] args){
		int arr[]={15,16,1,-2,-13,61,11,4,3,19,-4,17,-3,90,-65,67,12,0,13,2,3,43,21,-17,2,42};
        String str="Wipro Limited";
        generator(arr,str);
	}
}
