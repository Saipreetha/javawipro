package map;

import java.util.HashMap;

public class Map4 {
	public static HashMap<String,Integer> M1=new HashMap<String,Integer>();
	public static HashMap<String,Integer> phonebook(String name,int num){
		M1.put(name, num);
		return M1;
	}
public static void check(String name){
	System.out.println(M1.get(name));
	}
public static void main(String[] args){
	phonebook("sam",256784);
	phonebook("tom",256785);
	phonebook("ram",256786);
	check("sam");
}
}


