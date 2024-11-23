public class SugarDecorator extends BeverageDecorator {
    public SugarDecorator(IBeverage beverage) {
        super(beverage);
    }
    @Override
    public double getCost() {
        return beverage.getCost() + 7.0;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Сахар";
    }
}
