import java.util.Scanner;

public class TripCostCalculator {
    private final double distance;
    private final double fuelConsumption;
    private final double fuelPrice;
    private double totalCost;
    private double totalFuelNeeded;

    public TripCostCalculator(double distance, double fuelConsumption, double fuelPrice) {
        this.distance = distance;
        this.fuelConsumption = fuelConsumption;
        this.fuelPrice = fuelPrice;
    }

    public double calculateCost() {
        totalFuelNeeded =  (distance / 100) * fuelConsumption;
        totalCost =  totalFuelNeeded * fuelPrice;
        return totalCost;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the distance to travel (in kilometers): ");
        double distance = sc.nextDouble();
        double fuelConsumption = 5;
        System.out.println("Enter the fuel price per liter: ");
        double fuelPrice = sc.nextDouble();

        TripCostCalculator tripCostCalculator = new TripCostCalculator(distance, fuelConsumption, fuelPrice);
        double totalCost = tripCostCalculator.calculateCost();
        System.out.println("Total cost for the trip: " + totalCost);
    }
}
