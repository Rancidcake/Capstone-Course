package Day_1.DP;

public class Diamond_Problem {
	public static void main(String[] args) {
		Bat bat = new Bat();

		bat.eat();
		bat.walk();
		bat.fly();
		bat.sound();
	}
}

class Animal {
	void eat() {
		System.out.println("Animal eats");
	}
}

class Mammel extends Animal {
	void walk() {
		System.out.println("Mammel walks");
	}
}

class WingedMammel extends Mammel {
	void fly() {
		System.out.println("WingedMammel flies");
	}
}

class Bat extends WingedMammel {
	void sound() {
		System.out.println("Bat makes ultrasonic sounds");
	}
}
