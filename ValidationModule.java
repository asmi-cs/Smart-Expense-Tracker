import java.util.Scanner;

public class ValidationModule {

    public double handleRainyMonth(double totalExpenses, double water, double repair) {
        return totalExpenses + water + repair;
    }

    public void validateExpenses(double income, double totalExpenses) {
        if (totalExpenses > income) {
            System.out.println("Warning: Expenses exceed Income!");
        } else {
            System.out.println("Expenses are within Income.");
        }
    }

    public static double readPositiveDouble(Scanner sc, String message) {
        double value;

        while (true) {
            System.out.print(message);
            try {
                value = sc.nextDouble();
                if (value < 0) {
                    System.out.println("Value cannot be negative. Try again.");
                } else {
                    return value;
                }
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter a number.");
                sc.next();
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ValidationModule vm = new ValidationModule();

        double income = readPositiveDouble(sc, "Enter Monthly Income: ");
        double totalExpenses = readPositiveDouble(sc, "Enter Total Basic Expenses: ");

        System.out.print("Is it Rainy Month? (yes/no): ");
        String rainyInput = sc.next();

        if (rainyInput.equalsIgnoreCase("yes")) {
            double water = readPositiveDouble(sc, "Enter Extra Water Cost: ");
            double repair = readPositiveDouble(sc, "Enter Repair Cost: ");
            totalExpenses = vm.handleRainyMonth(totalExpenses, water, repair);
        }

        vm.validateExpenses(income, totalExpenses);

        System.out.println("Final Total Expenses: " + totalExpenses);

        sc.close();
    }
}

 
