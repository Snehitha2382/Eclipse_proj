package basics;

public interface Shape {
   public double area(double d); 
}
class circle implements Shape{
	public double area(double r) {
		return 3.14*r*r;
	}
} 

class square implements Shape{
	public double area(double a) {
		return a*a;
	}
}

