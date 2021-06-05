package day50_inheritance.overriding_package;

public class Dog extends Animal{

    public void run(){
        System.out.println("Dog is jumping");
    }

    @Override
    public void speak() {
        System.out.println("Dog is barking");
    }
}
