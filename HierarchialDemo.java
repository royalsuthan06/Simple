class Animal {
    void eat() {
        System.out.println("Eating food");
    }
}

class Dog extends Animal {}

class Cat extends Animal {}

public class HierarchicalDemo {
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();

        d.eat(); // Dog inherits Animal
        c.eat(); // Cat inherits Animal
    }
}