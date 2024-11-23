public class BaseBeverage implements IBeverage {
    @Override
    public double getCost() {
        return 60.0;
    }
    @Override
    public String getDescription() {
        return "Мароканский чай ";
    }
}
