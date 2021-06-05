package day50_inheritance.overriding_package;

public class Cat extends Animal {

    public void jump(){
        System.out.println("Cat is jumping");
    }

    @Override
    public void speak() {
        System.out.println("Cat is saying meow");
    }
}
