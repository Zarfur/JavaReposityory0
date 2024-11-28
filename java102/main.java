import java.util.ArrayList;
// ALL java classes default to inherit from the "Object class"
// all these classes inherit methods like toString and hashCode from Object class
public class main {

    public static void returnAll(LibraryItem[] items) { // Practice returnAll(7)
        for (int i=0; i<items.length; i++){
            LibraryItem item = items[i];
            item.returnItem();
        }
    }//(7)

    public static ArrayList<LibraryItem> availableItems(LibraryItem[] items) { // Practice availableItems(8)
        ArrayList<LibraryItem> aItems = new ArrayList<>();
        for (int i=0;i<items.length; i++){ 
            if (items[i].available() == true){
                aItems.add(items[i]);
            }
        }
        return aItems;
    }// (8)

    static double sumArea(Shape[] shapes){
        double sum=0;
        for (Shape shape : shapes){
            sum+=shape.area();
        }
        return sum;
    }
    static Shape[] scaleAll(Shape[] shapes, double k) {
        Shape[] scaled = new Shape[shapes.length];
        for (int i = 0; i < shapes.length; i++) {
            scaled[i] = shapes[i].scale(k);
        }
        return scaled;
    }
    Point point = new Point(4,3); // new calls constructor to make new object
    Point xTranslation = point.translateX(3); // should be (7, 3)
    Point yTranslation = point.translateY(-7); // should be (4, -4)
    Point xyTranslation = point.translateX(-4).translateY(-3); // should be (0, 0)
    static <T> String arrayToString(T[] arr) {// turns any type of array into printable string
        String str = "[";
        for (int i = 0; i < arr.length - 1; i++) {
            str += arr[i] + ", ";
        }
        return str + arr[arr.length - 1] + "]";
    }
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
        Grid<Integer> grid = new Grid<>(5,0);
        Grid<Integer> grid2= new Grid<>(7, 5);
        grid.set(2,2,4);
        System.out.println("grid:\n" +grid);
        System.out.println(grid.diagonal());//Practice(3)
        System.out.println("maxSideLength: "+ Grid.maxSideLength());//Practice(4)

        Shape[] shapes = {new Circle(new Point(1.8, -20), 2), //Testing shapes interface
            new Square(new Point(100, 2.1), 5.4),
            new Circle(new Point(0, 0), 1),
            new Circle(new Point(4, 9.123), 98.32),
            new Square(new Point(-321, 0), 0.02)};
        System.out.println(sumArea(shapes));
        String scaleAll = "";
        for (int i=0;i<shapes.length;i++) {
            scaleAll += scaleAll(shapes, 3)[i]+ "\n ";} //scaling
        System.out.println("scale all "+scaleAll);
        Point a5 = new Point(-10,8);
        Point b5= new Point(-14,0);
        Point c5= new Point(-10,-2);
        System.out.println("practice 5: " +Circle.fromPoints(a5, b5, c5)); //Practice(5)
        //Practice(6) INSIDE RightTriangle.java!
        LibraryItem[] items = new LibraryItem[3];
        items[0] = new Book("Frank", "STEIN", "Marrigold Shelly", 345);
        items[1] = new DVD("FarryHotterAndThePhilosophicStone", "FHATSS", 180);
        items[2]= new Book("ToKillaShockingNerd", "TKAMB", "Harpy Lee", 670);
        returnAll(items);
        items[2].checkOut();
        System.out.println("Freakistein is: "+items[0].available());//Practice(7)
        System.out.println("HaruPotter is: "+items[1].available());//Practice(7)
        System.out.println("MokingBard is: "+items[2].available());
        ArrayList<LibraryItem> aItem = availableItems(items);
        System.out.println("These items are available: " + "\n"+ aItem);//Practice(8)
    }
    public static void main(String[] args){
        new main(); // triggers "main"
        System.out.println("!array lists below"); // \/ playing with array lists \/
        ArrayList<String> arr = new ArrayList<>(); // new array list with strings
        arr.add("hello");
        arr.add("World");
        System.out.println(arr);
        arr.set(0, "Goodbye");
        System.out.println(arr); 
        //string array list practice^^^
        ArrayList<Boolean> conditions = new ArrayList<>();//Boolean array list called conditions
        conditions.add(true);//first item true
        conditions.add(arr.get(0) == "Hello");//check if true=hello turn it into second item(false)
        conditions.add(conditions.get(0) || conditions.get(1));//checks true or second item turn it into third item (true)
        System.out.println(conditions);
        //boolean array list practice^^^
        ArrayList<Integer> intArr = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
	        intArr.add(0);
        }   
        System.out.println(intArr.size());
        System.out.println(intArr.get(30));
        //Integer array with 50 elements all 0^^^(ArrayList end)
        //Squares and circles below
        Point e= new Point(0, 1);
        Square sqr=new Square(e,1);
        Circle c =new Circle(e,1);
        Point p=new Point(1,1);
        System.out.println(c.isOn(p));
        System.out.println(sqr.isOn(p));
        System.out.println(c.translate(3,4));
        System.out.println(sqr.translate(3,4));
        String corners="";
        for (int i=0;i<sqr.corners().length;i++) {
            corners += sqr.corners()[i]+ " ";}
        System.out.println("Corners: "+corners);
        // \/ inheritance stuffs
        A a = new A(12.3, 430);
        System.out.println(a);
        B b = new B(-12.31, "hello");
        System.out.println(b);
        a.method1();
        b.method1();
        b.method2();
        //this works because B inherits from A, therefore B is a type of A, so A can be a B object
        A bInDisguise = new B(1002.013, "world");
        bInDisguise.method2();
        //System.out.println(b.bField + " " + bInDisguise.bField);
        //This doesnt work because the computer treats bID is an A object, and A doesnt have a bField so itll error

        
    }
}
