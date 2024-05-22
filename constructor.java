public class Area {
    private double length;
    private double breadth;

    // Method to set the dimensions of the rectangle
    public void setDim(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to calculate and return the area of the rectangle
    public double getArea() {
        return length * breadth;
    }

    public static void main(String[] args) {
        // Create an instance of the Area class
        Area rectangle = new Area();

        // Set the dimensions of the rectangle
        rectangle.setDim(5.0, 3.0);

        // Calculate and print the area of the rectangle
        System.out.println("Area of the rectangle: " + rectangle.getArea());
    }
}