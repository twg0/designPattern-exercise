package Chap3_Decorator.CoffeeOrderSystem;

public abstract class CondimentDecorator extends Beverage{
	Beverage beverage;

	public abstract String getDescription();
}
