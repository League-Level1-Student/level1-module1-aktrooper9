package _02_cat;

public class catRunner {
public static void main(String[] args) {
	Cat cat = new Cat("a very annoying cat ");
	cat.meow();
	cat.printName();
	for(int i = 0; i<9;i++){
		cat.kill();
	}
}
}
