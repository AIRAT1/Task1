import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter your fuel consumption in liters per 100 km");
            showAlertMessage();
            double fuelConsumption = scanner.nextDouble();

            System.out.println("Enter your fuel remaining in liters");
            showAlertMessage();
            double fuelRemaining = scanner.nextDouble();

            int distance = (int) (fuelRemaining * Constants.ONE_HUNDRED_KILOMETER / fuelConsumption);
            System.out.println("You can drive more about " + distance + " km");
        } catch (Exception e) {
            System.out.println("Unsupported values, restart program and try again");
            e.printStackTrace();
        }
    }

    private static void showAlertMessage() {
        System.out.println("INTEGER OR DOUBLE VALUE ONLY");
        System.out.println("DOUBLE VALUES SEPARATE ONLY BY COMMA");
    }
}
