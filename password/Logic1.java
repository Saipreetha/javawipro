package password;
import java.util.Scanner;
public class Logic1 {
	public static void main(String args[]){
		int rem=0;
		int count0=0,count1=0,count2=0,count3=0,count4=0,count5=0,count6=0,count7=0,count8=0,count9=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the 10 numbers");
		int[] arr=new int[10];
		for(int i=0;i<10;i++){
			arr[i]=scan.nextInt();
		}
		for(int j=0;j<10;j++){
		while(arr[j]!=0){	
			rem=arr[j]%10;
   	     if(rem==0){
   	    	 count0++;
   	     }
   	     else if(rem==1){
   	    	 count1++;
   	     }
   	     else if(rem==2){
   	    	 count2++;
   	     }
   	     else if(rem==3){
   	    	 count3++;
   	     }
   	     else if(rem==4){
   	    	 count4++;
   	     }
   	     else if(rem==5){
   	    	 count5++;
   	     }
   	     else if(rem==6){
   	    	 count6++;
   	     }
   	     else if(rem==7){
   	    	 count7++;
   	     }
   	     else if(rem==8){
   	    	 count8++;
   	     }
   	     else if(rem==9){
   	    	 count9++;
   	     }
   	     arr[j]=arr[j]/10;	
		}
		}
		scan.close();
		
		System.out.println("the count of num 0:"+count0);
		System.out.println("the count of num 1:"+count1);
		System.out.println("the count of num 2:"+count2);
		System.out.println("the count of num 3:"+count3);
		System.out.println("the count of num 4:"+count4);
		System.out.println("the count of num 5:"+count5);
		System.out.println("the count of num 6:"+count6);
		System.out.println("the count of num 7:"+count7);
		System.out.println("the count of num 8:"+count8);
		System.out.println("the count of num 9:"+count9);
	}

}