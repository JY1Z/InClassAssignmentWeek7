import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TripCostCalculatorTest {

    @Test
    void testCalculateCost() {
        // Arrange
        double distance = 200; // 200 km
        double fuelConsumption = 5; // 5 liters per 100 km
        double fuelPrice = 1.5; // 1.5 per liter

        TripCostCalculator calculator = new TripCostCalculator(distance, fuelConsumption, fuelPrice);

        // Act
        double result = calculator.calculateCost();

        // Assert
        double expectedCost = (200.0 / 100) * 5 * 1.5;
        assertEquals(expectedCost, result, 0.001, "The calculated trip cost is incorrect");
    }
}
