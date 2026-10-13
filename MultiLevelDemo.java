// Base class
class Animal {
    void eat() {
        System.out.println("Animal eats food");
    }
}

// Intermediate derived class
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

// Final derived class
class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy weeps");
    }
}

public class MultilevelDemo {
    public static void main(String[] args) {
        Puppy p = new Puppy();

        p.eat();   // Inherited from Animal
        p.bark();  // Inherited from Dog
        p.weep();  // Puppy's own method
    }
}