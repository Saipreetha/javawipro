package list;
import java.util.*;
public class String3 {
	static ArrayList<String> list=new ArrayList<String>();
	Iterator<String> it=list.iterator();
	int printall(){
	while(it.hasNext()){
		 System.out.print(list);
		 break;
	}
	return 0;
	}
	
	public static void main(String[] args){
		String3 st=new String3();
		list.add("sam");
		list.add("Rohan");
		st.printall();
	}
}
