// This if for question number 3
public class Customer {
    // class attribute declaration
    private String name;
    private int balance;

    // constructor function that is always initialized whenever an object is created
    public Customer(String name, int balance) {
        // assigning class attributes to variables which have similiar names to the
        // attributes
        this.name = name;
        this.balance = balance;
    }

    // This retrieves the names of customers with balance less than 200
    private String getName() {
        if (balance < 200) {
            return name;
        } else {
            return "";
        }
    }

    // Function for adding a hundred for every customer who has a balance of more
    // than a thousand
    private void addBalance() {
        if (balance > 100) {
            this.balance += 100;
        }

    }

    public static void main(String[] args) {
        // Object instanciation - this is creating of objects from the class customer
        Customer[] cust = new Customer[4];
        cust[0] = new Customer("John", 100);
        cust[1] = new Customer("Mary", 120);
        cust[2] = new Customer("Licoln", 5000);
        cust[3] = new Customer("Alice", 50000);

        // the code below is for display
        System.out.println("Customers with less than balance of 200");
        for (Customer customer : cust) {
            String name = customer.getName();
            if (!name.isEmpty()) {
                System.out.println(name);
            }
        }
        System.out.println("Customers with more than 1000 get added 100 and they are:");
        for (Customer customer : cust) {
            customer.addBalance();
            if (customer.balance > 1000) {
                System.out.println("Customer: " + customer.name + ", New Balance: " + customer.balance);
            }
        }
    }

}
