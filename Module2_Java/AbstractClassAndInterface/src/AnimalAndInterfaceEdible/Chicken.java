package AnimalAndInterfaceEdible;

public class Chicken extends Animal {
    @Override
    public String makeSound() {
        return "Chicken: cluck";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
