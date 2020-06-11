package AnimalAndInterfaceEdible;

public class Apple extends Fruit implements Edible {
    @Override
    public String howToEat() {
        return "Apple could be slided";
    }
}
