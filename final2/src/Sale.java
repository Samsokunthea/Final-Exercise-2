public class Sale implements DiscountRate {
    private double amount;
    private Customer customer;

    public Sale(double amount, Customer customer) {
        this.amount = amount;
        this.customer = customer;
    }

    public double getAmount() {
        return amount;
    }

    public double getTotalAmount() {
        double serviceDiscount = getServiceDiscountRate(customer.getType());
        double productDiscount = getProductDiscountRate(customer.getType());

        double productAmount = amount * (1 - productDiscount);

        return productAmount;
    }

    public double getServiceDiscountRate(String type) {
        switch (type) {
            case "Premium":
                return 0.20;
            case "Gold":
                return 0.15;
            case "Silver":
                return 0.10;
            default:
                return 0.0;
        }
    }

    @Override
    public double getProductDiscountRate(String type) {
        switch (type) {
            case "Premium":
            case "Gold":
            case "Silver":
                return 0.10;
            default:
                return 0.0;
        }
    }
}
