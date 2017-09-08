package logic;
import java.util.*;
public class DateOfBirthFinder {
	public static String output1="";
	public static void main( String [] args ) {
	ArrayList<Integer> arrList=new ArrayList<Integer>();
	arrList.add(11);
	arrList.add(17);
	arrList.add(5);
		dateOfBirthFinder (arrList);//Check your Test Cases
	System.out.print(output1);
	}
	public static void dateOfBirthFinder(ArrayList<Integer> arrList) {
	// Code here
    String date="13/07/2017";
    int year=Integer.parseInt(date.substring(6)); 
    Iterator<Integer> it=arrList.iterator();
    int year1=(year-it.next());
    int day=Integer.parseInt(date.substring(0,2));
    int month=Integer.parseInt(date.substring(3,5));
    for(int i=year1;i<=year;i++){
    	if(i%4==0){
    		day+=1;
    }
    }
    int day1=(day-it.next());
    int day2=29;
    if(day1<0){
    	 day2=day2+day1;
    	 output1+=(day2+"/");
    }
    else if(day1==0||day1==1){
    	output1+=(01+"/");
    }
    else{
    	output1+=(day1+"/");
    }
    if(day==30||day==31){
    	month++;
    }
    int month1=(month-it.next());
    String ch[]={"jan","jan","feb","mar","apr","may","jun","jul","aug","sep","oct","nov","dec"};
    int month2=11;
    if(month1<0){
    	month2=month2+month1;
    	output1+=(ch[month2]+"/");
    }
    else{
    output1+=(ch[month1]+"/");
    }
    output1+=(year1);
    	//output1= // assign the output value at the end
	}
	}