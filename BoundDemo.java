public class BoundDemo {

    // Bounded type: T can only be Number or its subclasses (Integer, Double, Float...)
    static <T extends Number> void show(T val) {
        System.out.println("Numeric Value: " + val);
    }

    public static void main(String[] args) {
        show(10);     // Valid (Integer)
        show(5.5);    // Valid (Double)

        // show("Hello"); // Compile-time Error: String is not a Number
    }
}