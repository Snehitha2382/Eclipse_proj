package basics;

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
        circle c = new circle();
        square s = new square();
        System.out.println(c.area(3.14));
        System.out.println(s.area(3.14));
        
        Orange o = new Orange();
        o.eat();
	}

}
