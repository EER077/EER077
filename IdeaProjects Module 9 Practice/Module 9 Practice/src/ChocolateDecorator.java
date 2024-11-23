public class ChocolateDecorator extends BeverageDecorator {
    public ChocolateDecorator(IBeverage beverage) {
        super(beverage);
    }
    @Override
    public double getCost() {
        return beverage.getCost() + 18.0;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Шоколад";
    }
}
