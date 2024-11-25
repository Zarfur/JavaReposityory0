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
    public static Point centerOfMass(Point[] points) { // Practice: Center of Mass(1)
        double eks=0, why=0;
        for(int i=0;i<points.length;i++){
            eks+= points[i].x;
            why+= points[i].y;
        }
        eks = eks/points.length;
        why = why/points.length;
        return new Point(eks,why);
    }//(1)

    public double angle(){ // Practice: Angle(2)
        double x = this.x, y =this.y;
        double angleMeasurement = Math.atan2(y,x);
        angleMeasurement = Math.toDegrees(angleMeasurement);
        return angleMeasurement;
    }//(2)

    public Point rotate90(){ // Challenge: Rotation (1C)
        double x = this.x, y = this.y;
        return new Point(0-y, x);
    }
    public Point rotate(double theta){ //Challenge: Rotation (1C)
        double x = this.x, y=this.y;
        double radians = Math.toRadians(theta);
        double cos = Math.cos(radians);
        double sin = Math.sin(radians);
        double newX=x*cos-y*sin;
        double newY= x*sin + x*cos;
        return new Point(newX, newY);
    } //(1C)

    @Override // overrides everything
    public String toString(){ // overrides method into string
        return "(" + x + "," + y + ")";
    }

    public static double distance(Point p1, Point p2) { // distance between 2 points
        return Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));
    }
}