package factory_method;

public class NYPizzaStore extends PizzaStore {

	Pizza createPizza(String item) {
		switch (item) {
			case "cheese":
				return new NYStyleCheesePizza();
			case "veggie":
				return new NYStyleVeggiePizza();
			case "pepperoni":
				return new NYStylePepperoniPizza();
			default:
				return null;
		}
	}
}
