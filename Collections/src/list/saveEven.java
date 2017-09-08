package list;
import java.util.*;
public class saveEven {
	static ArrayList<Integer> A1=new ArrayList<Integer>();
    static ArrayList<Integer>A2=new ArrayList<Integer>();
    static int saveEvenNumbers(int n){
	for(int i=2;i<n;i=i+2){
	A1.add(i);
			}
	System.out.println(A1);
	return 0;
}
static int printEvenNumbers(){
Iterator<Integer> it=A1.iterator();
while(it.hasNext()){
	A2.add(new Integer(((Integer) it.next()).intValue())*2);
}
System.out.println(A2);
return 0;
}
static int printEvenNumber(int num){
int c=0;
Iterator<Integer> it=A1.iterator();
while(it.hasNext()){
	if(new Integer(((Integer) it.next()).intValue())==num){
		c=1;
	}
}
if(c!=0){
	return num;
}
else
	return 0;
}
public static void main(String []args){
saveEvenNumbers(10);
printEvenNumbers();
System.out.println(printEvenNumber(4));
}
}
