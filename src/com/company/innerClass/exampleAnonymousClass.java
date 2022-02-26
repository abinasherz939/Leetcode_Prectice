package com.company.innerClass;
interface Animal{
    void eat();
}
class pet{
    public void doStuff(Animal animal){

        animal.eat();
    }
}
public class exampleAnonymousClass {
    // example with interfaces
    public static void main(String[] args) {
        Animal animalObject = new Animal() {
            @Override
            public void eat() {
                System.out.println("Eat");
            }
        };

        animalObject.eat();
    }
}
class example2AnonymousClass{
    public static void main(String[] args) {

        pet pet = new pet();
        pet.doStuff(new Animal() {
            @Override
            public void eat() {
                System.out.println("eating");
            }
        });

    }
}