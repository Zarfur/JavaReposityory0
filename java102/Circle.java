public class Circle implements Shape { // Circle creation function

    public final Point center;
	public final double radius;
	public Circle(Point center, double radius) {
		this.center = center;
		this.radius = radius;
	}

	public double area() {
		return Math.PI * Math.pow(radius, 2);
	}

	public double perimeter() {
		return 2 * Math.PI * radius;
	}

	/** 
	* @return Whether point p is inside of the circle.
	*/
	public boolean isInside(Point p) {
		return Point.distance(center, p) < radius;
	}

	/** 
	* @return Whether point p part of/on the border of the circle.
	*/
	public boolean isOn(Point p) {
		return Point.distance(center, p) == radius;
	}

	/** 
	* @param x How much to translate the circle by in the + x direction.
	* @param y How much to translate the circle by in the + y direction.
	* @return The circle that results from the translation.
	*/
	public Circle translate(double x, double y) {
		return new Circle(center.translateX(x).translateY(y), radius);
	}

	/** 
	* @return The circle that results from scaling by k.
	*/
	public Circle scale(double k) {
		return new Circle(center, radius * k);
	}

    public static Circle fromPoints(Point p1, Point p2, Point p3){ //Practice(5)
        double distance1 = p2.x-p1.x;
        double distance2=p2.y-p1.y;
        double distance11=p3.x-p1.x;
        double distance22=p3.y-p1.y;
        double midpoint = distance1*(p1.x+p2.x)+distance2 * (p1.y+p2.y);
        double midpoint2=distance11*(p1.x+p3.x)+distance22*(p1.y+p3.y);
        double lineToucher = 2 * (distance1 * (p3.y - p2.y) - distance2 * (p3.x -p2.x));
        double k=(distance22*midpoint-distance2*midpoint2)/lineToucher;
        double h=(distance1*midpoint2-distance11*midpoint)/lineToucher;
        Point center = new Point(k,h);
        double r = Point.distance(center, p1);
        Circle circ = new Circle(center, r); 
        return circ;
    }//(5)
	@Override
	public String toString() {
		return "(center: " + center + "; radius: " + radius + ")";
	}
}