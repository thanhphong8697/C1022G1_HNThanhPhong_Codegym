package AbtractClassAndInterface.Practice.AnimalClassAndEdibleInterface;

public class Chicken extends Animal implements Edible{
    @Override
    public String makeSound() {
        return "Chicken: chit chit";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
