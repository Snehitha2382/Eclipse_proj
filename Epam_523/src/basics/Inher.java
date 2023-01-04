package basics;

public class Inher {
private int a;

public Inher(int a) {
	super();
	this.a = a;
}
public void display() {
	System.out.println("Inher 1 "+a);
}
}

class Inher_2 extends Inher{
	private int b;

	public Inher_2(int a, int b) {
		super(a);
		this.b = b;
	}

	public void display() {
		super.display();
		System.out.println("Inher 2 "+b);
	}
	
}

class Inher_3 extends Inher_2{
	private int c;

	public Inher_3(int a, int b, int c) {
		super(a, b);
		this.c = c;
	}
	public void display() {
		super.display();
		System.out.println("inher 3 "+c);
	}
}