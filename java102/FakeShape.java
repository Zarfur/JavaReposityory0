public class FakeShape implements Shape {
	public double area() { return 0; }
//FakeShape's scale method returns square, not Shape
	public Square scale(double k) { 
		return new Square(new Point(0, 0), 1); 
	}
}