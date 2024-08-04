class Book {
	float price;
	String name;
	Book() {
		name = "PHP";
		price = 200.0f;
	}
	Book(String n,float p) {
		name = n;
		price = p;
	}
	void show() {
		System.out.println("Name = "+ name);
		System.out.println("Price = "+ price);
	}
}
class BookDemo {
	public static void main(String[] Args) {
		Book b1 = new Book();
		Book b2 = new Book("Java",300.0f);
		b1.show();
		b2.show();
	}
}