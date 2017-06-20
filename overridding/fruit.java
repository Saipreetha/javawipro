package overridding;

public class fruit {
	String name;
	String taste;
	String size;
	void eat(){
		System.out.println(name+"is very tasty"+taste+"is like milky");
	}
}
class apple extends fruit{
	void eat(){
		System.out.println("Apple is very crispy and crunchy it's taste is like sweetness");
	}
}
class orange extends fruit{
	void eat(){
		System.out.println("Orange is very juicy  it's taste is like citrus taste");
	}
}
class PrintFruit{
	public static void main(String args[]){
		fruit hu=new fruit();
		apple yu=new apple();
		orange gh=new orange();
		hu.eat();
		yu.eat();
		gh.eat();
	}
}