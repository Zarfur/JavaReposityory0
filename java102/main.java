public class main {
    Point point = new Point(4,3); // new calls constructor to make new object
    Point xTranslation = point.translateX(3); // should be (7, 3)
    Point yTranslation = point.translateY(-7); // should be (4, -4)
    Point xyTranslation = point.translateX(-4).translateY(-3); // should be (0, 0)
    public main() { //make "main"
        Point a= new Point(4, 5);
        Point b= new Point (6,4);
        System.out.println("x: "+ point.x+" y: "+ point.y);
        System.out.println("x transl: " + xTranslation);
        System.out.println("y transl: " + yTranslation);
        System.out.println("xy transl: " + xyTranslation);
        System.out.println(Point.distance(a, b));
    }
    public static void main(String[] args){
        new main(); // triggers "main"
    }
}