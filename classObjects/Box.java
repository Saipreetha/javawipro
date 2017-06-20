package classObjects;

public class Box {
	double width;
	double height;
	double depth;
    void volume(double a,double b,double c){
		width=a;
		height=b;
		depth=c;
	    System.out.print(width*height*depth);
	
	}

public static void main(String args[]){
              Box box1=new Box();
              box1.volume(3.4, 2.4, 1.3);
}

}
