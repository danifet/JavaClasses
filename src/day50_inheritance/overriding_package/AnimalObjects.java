package day50_inheritance.overriding_package;

public class AnimalObjects {

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.name = "Gray";
        animal.type = "Pitbull";
        animal.speak();

        Cat cat = new Cat();
        cat.speak();

        Dog dog = new Dog();
        dog.speak();
    }
}
