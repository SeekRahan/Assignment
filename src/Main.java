import java.util.Scanner;

// Main.java
public class Main {
    public static void main(String[] args) {
        try {
            // Create a CommissionEmployee object
            CommissionEmployee employee = new CommissionEmployee("Mark", "Dabuo", "123-45-6789", 5000.0, 0.1);
            // Display employee's details
            System.out.println(employee);

            // Update grossSales and commissionRate
            employee.setGrossSales(6000.0);
            employee.setCommissionRate(0.15);
            // Display updated details
            System.out.println("\nUpdated Employee Details:");
            System.out.println(employee);

            // Calculate and display earnings
            System.out.printf("\nEarnings: %.2f\n", employee.earnings());

            // Test validation by setting invalid values
            System.out.println("\nTesting validation:");
            employee.setGrossSales(-100.0); // Should throw exception
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            // Test validation by setting invalid values
            CommissionEmployee employee = new CommissionEmployee("Ama", "Danquah", "987-65-4321", 7000.0, 0.2);
            employee.setCommissionRate(1.5); // Should throw exception
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
