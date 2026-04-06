package Day_1.DP.Inheritance;

public class Cat extends Animal {
    void meows (){
        System.out.println("Meow Meow");


    }
    public static void main(String[] args) {
    Cat cat = new Cat();
    cat.eat();
    cat.meows();
    
}
}