class NewCircle {
    private double radius;
    private String color;

    // Default constructor
    public NewCircle() {
        this.radius = 1.0;
        this.color = "red";
    }

    // Constructor with radius
    public NewCircle(double radius) {
        this.radius = radius;
    }

    // Constructor with radius and color
    public NewCircle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    // used to get the radius of a circle
    public double getRadius() {
        return radius;
    }

    // calculates the area of a circle using the Math library found in java
    public double getArea(double radius) {
        double squared_radius = radius * radius;
        return Math.PI * squared_radius;
    }

    public static void main(String[] args) {
        // object creation
        NewCircle circle = new NewCircle();
        // printing out radius and area
        System.out.println("The radius is :" + circle.getRadius());
        System.out.println("The area is :" + circle.getArea(1.0));
    }
}