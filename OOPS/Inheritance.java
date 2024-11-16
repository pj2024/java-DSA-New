public class Inheritance {
    public static void main(String[] args) {
        // Fish shark = new Fish();
        // shark.eat();

        // Dog dobby = new Dog();
        // dobby.leg = 4;
        // dobby.eat();
        // System.out.println(dobby.leg);

        // AdentherMammales am = new AdentherMammales();
        // am.walk();
        // am.eat();
        // am.breath();


        Tuna t1 = new Tuna();
        t1.eat();
        t1.swim();
        t1.breath();
    }
}





/*

    Single Level Inheritance

 */
// Base class
class Animal{
    String color;

    void eat(){
        System.out.println("Eats");
    }

    void breath(){
        System.out.println("Breaths");
    }
}


// derived class
class Fish extends Animal{
    int fins;

    void swim(){
        System.out.println("Swims in water");
    }
}












/* 
     Multilevel Inheritance

*/

class Mammales extends Animal{
    int leg;
}

class Dog extends Mammales{
    String breed;
}












/*
    Hierarchical Inheritance

*/

class BigFish extends Animal{
    void swim(){
        System.out.println("Can Swim");
    }
}

class Bird extends Animal{
    void fly(){
        System.out.println("Can Fly");
    }
}

class AdentherMammales extends Animal{
    void walk(){
        System.out.println("Can Walk");
    }
}











/*

    Hybrid Inheritance
*/

// Fish extends Animal Base class
class Tuna extends Fish{
    void faskSwim(){
        System.out.println("Can swim very Fast");
    }
}

// Fish extends Animal Base class
class shark extends Fish{
    void eat(){
        System.out.println("Eat Big Fishes");
    }
}
// Mammels extends Animal Base class
class Dog1 extends Mammales{
    void bark(){
        System.out.println("Can Bark");
    }
}

