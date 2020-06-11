package AnimalAndInterfaceEdible;

public class Tiger extends Animal {
    @Override
    public String makeSound() {
        return "Tiger: Roar";
    }

    @Override
    public String howToEat() {
        return "could be boiled";
    }
}
