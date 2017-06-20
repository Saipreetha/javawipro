package encapsulation;

public class Author {
	private String name;
	private String email;
	private char gender;
	Author(){
		
	}
	Author(String name,String email,char gender){
		this.name=name;
		this.email=email;
		this.gender=gender;
		System.out.println("Author:"+name+"\nmail id:"+email+"\nGender:"+gender);
	}
	
	 void display(){
		 System.out.println("Author:"+name+"\nmail id:"+email+"\nGender:"+gender);
	 }

}
class Book extends Author{
	private String bookname="Maths";
	private double price;
	private int qtyInStock;
	Book(){
		
	}
	Book(double price,int qtyInStock){
		super( "Thomas","thomas@edf.com",'m');
		this.price=price;
		this.qtyInStock=qtyInStock;
	}
	public void setPrice(double price){
		 this.price=price;
	 }
	public void getName(){
		 System.out.println("Book name:"+bookname);
		}
	public void setqtyInStock(int qtyInStock){
		 this.qtyInStock=qtyInStock;
	 }
	public void getPrice(){
		 System.out.println("Book price:"+price); 
	 }
	public void getqtyInStock(){
		 System.out.println("Qty In stock:"+qtyInStock);
	 }
	}

class PrintDetails{
	public static void main(String args[]){
	    Book b=new Book();
		System.out.println("The Details Are:");
		b.setPrice(200);
		b.setqtyInStock(10);
		b.getName();
		b.getPrice();
		b.getqtyInStock();
		
	}
}