package _06_duck;

public class Duck {
	public static void main(String[] args) {
		Duck sad = new Duck("pig", 0);
		sad.quack();
		sad.waddle();
	}
	public String favoriteFood;
	public int numberOfFriends;
	Duck(String favoriteFood, int numberOfFriends) {
      	this.favoriteFood = favoriteFood;
      	this.numberOfFriends = numberOfFriends;
}
	void quack(){
		System.out.println("QUACK");
	}
	void waddle(){
		System.out.println("waddle");
	}

}
