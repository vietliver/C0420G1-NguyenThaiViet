package AnimalAndInterfaceEdible;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal x: animals) {
            System.out.println(x.makeSound());
            if (x instanceof Chicken) {
                Edible edible = (Chicken) x;
                System.out.println(edible.howToEat());
            }
        }

        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit x: fruits) {
            System.out.println(x.howToEat());
        }
    }
}
