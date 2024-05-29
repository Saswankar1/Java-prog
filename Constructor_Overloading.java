public class Car {
    String brand;
    String model;
    int year;

    // Constructor with no parameters
    public Car() {
        this.brand = "Unknown";
        this.model = "Unknown";
        this.year = 0;
    }

    // Constructor with brand and model parameters
    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.year = 0; // Default year
    }

    // Constructor with all parameters
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println();
    }

    public static void main(String[] args) {
        Car car1 = new Car(); // Using the no-argument constructor
        Car car2 = new Car("Toyota", "Camry"); // Using the constructor with brand and model parameters
        Car car3 = new Car("Honda", "Civic", 2020); // Using the constructor with all parameters

        car1.displayInfo();
        car2.displayInfo();
        car3.displayInfo();
    }
}
