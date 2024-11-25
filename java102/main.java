public class main {
    Point point = new Point(4,3); // new calls constructor to make new object
    Point xTranslation = point.translateX(3); // should be (7, 3)
    Point yTranslation = point.translateY(-7); // should be (4, -4)
    Point xyTranslation = point.translateX(-4).translateY(-3); // should be (0, 0)
    public main() { //make "main"
        Point a= new Point(0, 1);
        Point b= new Point (6,4);
        Point[] points={a,b};
        System.out.println("x: "+ point.x+" y: "+ point.y);
        System.out.println("x transl: " + xTranslation);
        System.out.println("y transl: " + yTranslation);
        System.out.println("xy transl: " + xyTranslation);
        System.out.println(Point.distance(a, b));
        System.out.println(Point.centerOfMass(points)); //Practice(1)
        System.out.println(a.angle()); //Practice(2)
        System.out.println(a.rotate90()); //Challenge(1)
        System.out.println(a.rotate(90));//Challenge(1)
        ArrayList<String> arr = new ArrayList<>();
    }
    public static void main(String[] args){
        new main(); // triggers "main"
    }
}