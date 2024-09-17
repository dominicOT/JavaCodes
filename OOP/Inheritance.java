// Animal.java (Parent class)
public class Animal {
    // Properties of an animal
    private String name;
    private int age;

    // Constructor to initialize an animal
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to make an animal sound
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }

    // Method to display animal information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// koala.java (Child class that inherits from Animal)
public class koala extends Animal {
    // Additional property specific to koalas
    private String breed;

    // Constructor to initialize a koala
    public koala(String name, int age, String breed) {
        // Call the parent class constructor to initialize the animal properties
        super(name, age);
        this.breed = breed;
    }

    // Override the makeSound method to make a koala-specific sound
    @Override
    public void makeSound() {
        System.out.println("The koala barks.");
    }

    // Additional method specific to koalas
    public void displayBreed() {
        System.out.println("Breed: " + breed);
    }
}

// Main.java (Driver class to test the program)
public class Inheritance {
    public static void main(String[] args) {
        // Create an animal object
        Animal animal = new Animal("Generic Animal", 5);
        animal.displayInfo();
        animal.makeSound();

        // Create a koala object
        Koala koala = new Koala("Fido", 3, "Golden Retriever");
        koala.displayInfo();
        koala.makeSound();
        koala.displayBreed();
    }
}
