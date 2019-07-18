import java.util.Scanner;

public class FamilyTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());
        double nightPrice = Double.parseDouble(scanner.nextLine());
        double procen = Double.parseDouble(scanner.nextLine());

        if (nights > 7) {
            nightPrice = nightPrice * 0.95;
        }

        double razhodi = budget * (procen / 100);

        double totalTaxes = razhodi + nights * nightPrice;

        if (totalTaxes <= budget) {
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.", budget - totalTaxes);
        } else {
            System.out.printf("%.2f leva needed.", totalTaxes - budget);
        }
    }
}
