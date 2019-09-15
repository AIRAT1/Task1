import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            int distance;
            System.out.println("Enter your fuel consumption in liters per 100 km");
            showAlertMessage();
            int fuelConsumption = scanner.nextInt();

            System.out.println("Enter your fuel remaining in liters");
            showAlertMessage();
            int fuelRemaining = scanner.nextInt();

            distance = fuelRemaining * Constants.ONE_HUNDRED_KILOMETER / fuelConsumption;
            System.out.println("You can drive more about " + distance + " km");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Unsupported values, restart program and try again");
        }
    }

    private static void showAlertMessage() {
        System.out.println("INTEGER VALUE ONLY");
    }
}
