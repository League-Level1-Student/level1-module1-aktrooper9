package _04_popcorn;

import javax.swing.JOptionPane;

public class PopcornMaker {
public static void main(String[] args) {
	String flavor = JOptionPane.showInputDialog("what flavor of popcorn do you want");
	String time = JOptionPane.showInputDialog("how long do you want to cook your popcorn");
	int i = Integer.parseInt(time);
	Microwave m = new Microwave();
	Popcorn pop = new Popcorn(flavor);
	m.putInMicrowave(pop);
	m.setTime(i);
	m.startMicrowave();

}
}
