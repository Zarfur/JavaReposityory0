public class Point { // point is an object (coords) Each point has its own variables and methods
	public final double x;  // field, stores data, no values=not initilized
	public final double y; // 

    public Point(double x, double y){ //constructor function
        this.x=x; //this. means top level scope
        this.y=y; // this.y = y field, y = argument y
    } // no return
//method to translate point in a direction
    public Point translateX(double t){ // function but no static instead public
        return new Point(x+t, y);
    }
    public Point translateY(double t){
        return new Point(x,y+t);
    }
    @Override // overrides everything
    public String toString(){ // overrides method into string
        return "(" + x + "," + y + ")";
    }

    public static double distance(Point p1, Point p2) { // distance between 2 points
        return Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));
    }
}