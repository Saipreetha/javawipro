package cocubes;
public class Logic1 {
	public static void main(String args[]){
		int arr[]={7,4,3,6,9};
		sample(arr);
	}
	public static void sample(int arr[]){
		int len=arr.length;
		int count=0;
		for(int i=0;i<len;i++){
			for(int j=i+1;j<len;j++){
				if(arr[i]>arr[j]){
					if(arr[i]%arr[j]!=0){
						if(arr[i]%2!=0&&arr[j]%2==0){
						count++;
					}
					}
				}
				else{
					if(arr[j]%arr[i]!=0){
						
						count++;
					
					}
				}
			}
		}
		System.out.print(count);
	}
}
