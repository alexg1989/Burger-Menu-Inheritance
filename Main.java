public class Main {

    public static void main(String[] args) {

	Hamburger burger1 = new Hamburger("Basic", "Bacon", "White", 3.56);

    burger1.addAddition1("Tomato", 0.25);
    burger1.addAddition2("Lettuce", 0.35);
    burger1.addAddition3("Cheese", 1.00);
    burger1.addAddition4("Pickle", 0.20);

    System.out.println("Total Burger price with additions " + burger1.itemizePrice());

    HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
    healthyBurger.addAddition1("Egg", 2.25);
    healthyBurger.addHealthyAddition1("Onion", 0.50);
    System.out.println("Total Healthy Burger price is  " + healthyBurger.itemizePrice());

    DeluxeBurger deluxeBurger = new DeluxeBurger();
    deluxeBurger.addAddition1("SHould not do this", 5.35);
    deluxeBurger.itemizePrice();

    }
}
