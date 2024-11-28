public class B extends A {
    //extends means it inherits from/is child of A
    // B does not inhert from Object Class but it inherits what A inherits from Object Class
	public final String bField;
	
	public B(double field1and2, String bField) {
		super(field1and2, field1and2);
        //super refers to parent class and calls A
        //child class must call parent class constructor
        //this creates an A with 2 double values
        //If B refrences super.field1 or .field2, they will both be the same dobule value
    
		this.bField = bField;
		System.out.println("the constructor of B has been called");
	}
// B methods will run A methods
// with Override, B makes its OWN method 2, meaning it wont just take method2 from A
// rather it does its own thing 
	@Override 
	public void method2() {
		System.out.println("method 2 of B has been called");
	}

	public double field() {
		return super.field1;
	}
}
