package inheritance;

public class Animal {
	void eat(){
		System.out.println("Animal is eating");
	}
	void sleep(){
		System.out.println("Animal is sleeping");
	}

}
class Bird extends Animal{
	void eat(){
		System.out.println("Bird is eating");
	}
	void sleep(){
		System.out.println("Bird is sleeping");
	}
	void fly(){
		System.out.println("Bird is flying");
	}
}
class printAnimal{
	public static void main(String[] args){
		Animal a=new Animal();
		Bird b=new Bird();
		a.eat();
		a.sleep();
		b.eat();
		b.sleep();
		b.fly();
	}
}
