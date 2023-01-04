package basics;

public class Fruit {
String name = "";
String taste = "";
int size = 0;
}

class Apple extends Fruit{
	public void eat() {
		System.out.println("Apple is sweet");
	}
}

class Orange extends Fruit{
	public void eat() {
		System.out.println("Orange is sour");
	}
}