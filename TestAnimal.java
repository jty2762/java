class Animal{
public void bark(){
    System.out.println("animal sound");
    }
}

public class TestAnimal {
    public static void main(String[] args){
        Animal animal = new Animal();
        animal.bark();

        Dog dog = new Dog();
        dog.bark();

        Cat cat = new Cat();
        cat.bark();
    }
}