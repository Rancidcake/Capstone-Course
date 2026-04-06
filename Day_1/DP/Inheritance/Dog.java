package Day_1.DP.Inheritance;

public class Dog extends Animal {
    void bark (){
        System.out.println("Dog Barking");


    }
    public static void main(String[] args) {
    Dog dog = new Dog();
    dog.eat();
    dog.bark();
}
    
}

