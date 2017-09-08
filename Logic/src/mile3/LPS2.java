package mile3;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;
public class LPS2 {
	public static void main(String args[]){
		Scanner scan=new Scanner (System.in);
		int input2=scan.nextInt();
		int input1[]=new int[input2];
		for(int i=0;i<input2;i++){
			input1[i]=scan.nextInt();
		}
		scan.close();
		LPS2 m2=new LPS2();
		m2.Password(input1, input2);
	}
	public void Password(int input1[],int input2){
		int input3[]=new int[input2];
		int count[]=new int[input2];
		for(int i=0;i<input1.length;i++){		
			input3[i]=input1[i];
		}
		TreeSet<Integer> it=new TreeSet<Integer>();
		for(int i=0;i<input2;i++){
			while(input3[i]!=0){
				count[i]++;
				input3[i]/=10;
			}
	 		if(count[i]==3){
				it.add(input1[i]);
			}
			if(count[i]>3){
				int rem=0,rem2=0;
				rem=input1[i]/10;
				it.add(rem);
				rem=input1[i]/1000;
				rem=rem*1000;
				rem2=input1[i]-rem;
				it.add(rem2);
			}
	}
	Iterator<Integer> ih=it.iterator();
	System.out.print(ih.next());
		int low=0;
		int high=9;
		int rem=0;
		for(int i=0;i<input1.length;i++){
			while(input1[i]!=0){
				rem=input1[i]%10;
				if(low<rem){
					low=rem;
				}
				if(high>rem){
					high=rem;
				}
				input1[i]/=10;
			}
		}
		System.out.print(low+high);
	}
	}
