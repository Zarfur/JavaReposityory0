public class A { // can make new A, unlike Shape(where u must make circ or sqr)
//Everything in B will call things from A because B inherits A
//protected means only class and inherited classes can view it
//they are only accessible to A and B
    protected final double field1;
	protected final double field2;

	public A(double field1, double field2) {
		System.out.println("the constructor of A has been called");
		this.field1 = field1;
		this.field2 = field2;
	}

	public void method1() {
		System.out.println("method 1 of A has been called");
	}
	
	public void method2() {
		System.out.println("method 2 of A has been called");
	}
    @Override// i did this cuz i dont like seeing the A@sklfdjaslkf stuff
    public String toString(){
        return "A (field1 = "+ field1 + ", field2 = "+field2 +")";
    }
}