package Day_1.DP.Inheritance;

public class puppy extends Dog {
    void weep(){
        System.out.println("Puppy Weeping");
    }
    
    public static void main(String[] args) {
    puppy puppy = new puppy();
    puppy.weep();
    Dog dog = new Dog();
    dog.eat();
    dog.bark();
    
}
}
