package approach;

public class pyramid4 {
	public static void main(String args[]){
	
		for(int row=1;row<=10;row++){
			for(int space=1;space<=10-row;space++){
				System.out.print(" ");
			}
			for(int inc=1;inc<=row;inc++){
				System.out.print(+inc);
			}
			for(int alpha=row;alpha>1;alpha--){
				System.out.print((char)(alpha+63));
			}
			System.out.println();
		}
	}

}
