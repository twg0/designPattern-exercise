package Chap3_Decorator.CoffeeOrderSystem;

public class Whip extends CondimentDecorator{
	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", 휘핑크림";
	}

	@Override
	public double cost() {
		return .10;
	}
}
