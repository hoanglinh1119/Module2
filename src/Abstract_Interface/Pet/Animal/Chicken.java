package Abstract_Interface.Pet.Animal;

public class Chicken extends Animal implements Edible{
    @Override
    public String makeSound() {
        return "Chick chick";
    }

    @Override
    public String howToEat() {
        return " could be fried ";
    }
}
