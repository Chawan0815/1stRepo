package Super_And_This_Keyword_Using_Method_Calling;

class Animal {
    String type = "Animal"; 

    Animal() {
        System.out.println("Animal constructor called"); 
    }

    void sound() { 
        System.out.println("Animal makes a sound"); 
    }
}
class Dog extends Animal {
    String type = "Dog";

    Dog() {
        super(); 
        System.out.println("Dog constructor called");
    }

    void sound() {
        super.sound(); // Call Animal's sound()
        System.out.println("Dog barks"); 
    }

    void showType() { // 2nd call
        System.out.println("Dog type: " + this.type); 
        System.out.println("Animal type: " + super.type);
    }
}

class Puppy extends Dog {
    String type = "Puppy";

    Puppy() {
        super(); // Call Dog constructor
        System.out.println("Puppy constructor called"); 
    }

    void sound() { 
        super.sound(); // Call Dog's sound()
        System.out.println("Puppy yelps"); 
    }

    void showType() { //1st call
        System.out.println("Puppy type: " + this.type);
        super.showType(); // Call Dog's showType()
    }
}

public class Main {
    public static void main(String[] args) {
        Puppy p = new Puppy();
        p.showType();
        p.sound();
    }
}
