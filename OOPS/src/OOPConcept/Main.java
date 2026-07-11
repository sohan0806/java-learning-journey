package OOPConcept;
// --- 1. ABSTRACTION & ENCAPSULATION (Base Class) ---
abstract class Vehicle {
    private String brand;
    private String model;
    private double baseRentalRate;

    public Vehicle(String brand, String model, double baseRentalRate) {
        this.brand = brand;
        this.model = model;
        this.baseRentalRate = baseRentalRate;
    }

    public abstract double calculateRentalCost(int days);

    public void displayDetails() {
        System.out.println(brand + " " + model + " (Base Rate: $" + baseRentalRate + "/day)");
    }

    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }
    
    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public double getBaseRentalRate() { return baseRentalRate; }
    public void setBaseRentalRate(double baseRentalRate) { this.baseRentalRate = baseRentalRate; }
}

// --- 2. INHERITANCE & POLYMORPHISM (Subclasses) ---
class Car extends Vehicle {
    private int seatingCapacity;

    public Car(String brand, String model, double baseRentalRate, int seatingCapacity) {
        super(brand, model, baseRentalRate);
        this.seatingCapacity = seatingCapacity;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getBaseRentalRate() * days;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Type: Car, Seats: " + seatingCapacity);
    }
}

class Bike extends Vehicle {
    private boolean requiresHelmetRental;

    public Bike(String brand, String model, double baseRentalRate, boolean requiresHelmetRental) {
        super(brand, model, baseRentalRate);
        this.requiresHelmetRental = requiresHelmetRental;
    }

    @Override
    public double calculateRentalCost(int days) {
        double cost = getBaseRentalRate() * days;
        if (requiresHelmetRental) {
            cost += (5 * days); 
        }
        return cost;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Type: Bike, Helmet Included: " + (requiresHelmetRental ? "Yes" : "No"));
    }
}

class Truck extends Vehicle {
    private double loadCapacityTons;

    public Truck(String brand, String model, double baseRentalRate, double loadCapacityTons) {
        super(brand, model, baseRentalRate);
        this.loadCapacityTons = loadCapacityTons;
    }

    @Override
    public double calculateRentalCost(int days) {
        double heavyLoadFee = 50.0; 
        return (getBaseRentalRate() * days) + heavyLoadFee;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Type: Truck, Load Capacity: " + loadCapacityTons + " tons");
    }
}

// --- 3. EXECUTION ---
public class Main {
    public static void main(String[] args) {
        Vehicle[] fleet = new Vehicle[3];
        fleet[0] = new Car("Toyota", "Camry", 50.0, 5);
        fleet[1] = new Bike("Yamaha", "R1", 30.0, true);
        fleet[2] = new Truck("Ford", "F-150", 100.0, 2.5);

        int rentalDays = 5;

        for (Vehicle vehicle : fleet) {
            vehicle.displayDetails();
            System.out.println("Rental Cost for " + rentalDays + " days: $" + vehicle.calculateRentalCost(rentalDays));
            System.out.println("-----------------------------------");
        }
    }
}