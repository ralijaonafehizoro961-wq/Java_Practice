package Java_exercise_Easy.inheritance_polymorphism;

class Animal{
    public void shout(){
        System.out.println("The Animal shouts");
    }
}

class Dog extends Animal{
    @Override
    public void shout(){
        System.out.println("Wouf");
    }
}
public class Ex31_AnimalDog {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.shout();
        Animal animal = new Animal();
        animal.shout();
    }
}
