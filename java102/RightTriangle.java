public class RightTriangle implements Shape{ //Practice(6)
    public final Point rightAngle;
    public final double b; 
    public final double h; 

    public RightTriangle(Point rightAngle, double b, double h){
        this.rightAngle=rightAngle;
        this.b = b;
        this.h=h;
    }
    public double area(){
        return (b*h)/2;
    }
	public RightTriangle scale(double k) {
        return new RightTriangle(rightAngle, b*k, h*k);
	}

    public static boolean similar(RightTriangle t1, RightTriangle t2){
        double ratio1 = t1.b/t1.h;
        double ratio11=t2.b/t2.h;
        return ratio1==ratio11;
    }
    @Override
	public String toString() {
		return "(corner: " + rightAngle + "; height: " + h + "; base: " +b +")";
	}
}//(6)
