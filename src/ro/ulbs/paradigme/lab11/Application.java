package ro.ulbs.paradigme.lab11;

public class Application {
    // Component
    public interface Pizza {
        String getDescription();
        double getCost();
    }
    // Concrete Component
    public class PlainPizza implements Pizza {
        @Override
        public String getDescription() {
            return "Plain dough";
        }
        @Override
        public double getCost() {
            return 4.00;
        }
    }
    public static abstract class PizzaDecorator implements Pizza {
        protected Pizza tempPizza;
        public PizzaDecorator(Pizza newPizza) {
            tempPizza = newPizza;
        }
        @Override
        public String getDescription() {
            return tempPizza.getDescription();
        }
        @Override
        public double getCost() {
            return tempPizza.getCost();
        }
    }
    //First concrete decorator
    public class Mozzarella extends PizzaDecorator {
        public Mozzarella(Pizza newPizza) {
            super(newPizza);
        }
        @Override
        public String getDescription() {
            return tempPizza.getDescription() + ", mozzarella";
        }
        @Override
        public double getCost() {
            return tempPizza.getCost() + 0.50;
        }
    }
    // Second concrete decorator
    public static class Pepperoni extends PizzaDecorator {
        public Pepperoni(Pizza newPizza) {
            super(newPizza);
        }
        @Override
        public String getDescription() {
            return tempPizza.getDescription() + ", pepperoni";
        }
        @Override
        public double getCost() {
            return tempPizza.getCost() + 0.75; // Assume pepperoni costs an extra 75 cents.

        }
    }
    //Lets build some pizza
    public static void main(String[] args) {
        Application app = new Application();
        Pizza basicPizza = app.new PlainPizza();
        Pizza mozzarellaPizza = app.new Mozzarella(basicPizza);
        Pizza pepperoniPizza = new Pepperoni(mozzarellaPizza);
        System.out.println(pepperoniPizza.getDescription());
        System.out.println(pepperoniPizza.getCost());
    }
        }


