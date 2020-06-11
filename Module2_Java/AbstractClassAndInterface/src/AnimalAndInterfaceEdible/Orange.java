package AnimalAndInterfaceEdible;

public class Orange extends Fruit implements Edible {
    @Override
    public String howToEat() {
        return "Orange could be juiced";
    }
}
