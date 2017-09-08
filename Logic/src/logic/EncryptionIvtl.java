package logic;
import java.util.HashMap;
public class EncryptionIvtl {
	public static String output="";
	public static void main(String args[]){
		usermethod("@#@#1234 1444");
		System.out.print(output);
	}
	public static void usermethod(String input1){
		String str = input1;
		int len = str.length();
		HashMap<Character, Integer> numChars = new HashMap<Character, Integer>(Math.min(len, 26));
		for (int i = 0; i < len; ++i)
		{
			char charAt = str.charAt(i);
            if (!numChars.containsKey(charAt))
		    {
		        numChars.put(charAt, 1);
		    }
		    else
		    {
		        numChars.put(charAt, numChars.get(charAt) + 1);
		    }
		}

		System.out.println(numChars);	
	}

}
