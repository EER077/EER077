public class MilkDecorator extends BeverageDecorator {
    public MilkDecorator(IBeverage beverage) {
        super(beverage);
    }
    @Override
    public double getCost() {
        return beverage.getCost() + 15.0;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Молоко";
    }
}