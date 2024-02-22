import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter customer type (Premium/Gold/Silver/Normal): ");
        String customerType = scanner.next();

        System.out.print("Enter sale amount: ");
        double saleAmount = scanner.nextDouble();

        Customer customer = new Customer(customerType);
        Sale sale = new Sale(saleAmount, customer);

        System.out.println("Total Amount for " + customerType + " Customer: $" + sale.getTotalAmount());

        scanner.close();
    }
}