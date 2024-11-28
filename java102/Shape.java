public interface Shape {//interface allows for define contract and specify methods
    double area();
    /**
     * @return The shape that results from scaling by k
     */
    Shape scale(double k);
    //returns Shape because Circl&Sqr are both Shape objects because they r in Shape interface
    
}

