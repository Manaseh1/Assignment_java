// Question 2
public class Employees {
    // attribute declaration
    private String name;
    private int year;
    private String address;

    // constructor function that is always called when an object is being
    // created/instanciated
    public Employees(String name, int year, String address) {
        this.name = name;
        this.year = year;
        this.address = address;
    }

    // function to get the details of employees
    public String getDetails() {
        // the quotation marks are just for spacing dont wory
        return name + " " + " " + "      " + year + "      " + " " + " " + address;
    }

    public static void main(String[] args) {
        // object creation from the class Employee
        Employees emp1 = new Employees("Robert", 1994, "64C - WallStreet");
        Employees emp2 = new Employees("Sam", 2000, "68D - WallStreet");
        Employees emp3 = new Employees("John", 1999, "26B - WallStreet");
        // printing out the necessary display
        System.out.println("Name      year of joinin      address");
        System.out.println(emp1.getDetails() + "\n" + emp2.getDetails() + "\n" + emp3.getDetails());
        ;

    }
}
