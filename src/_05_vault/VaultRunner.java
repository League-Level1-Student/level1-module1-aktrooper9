package _05_vault;

import java.util.Random;

import javax.swing.JOptionPane;

public class VaultRunner {
public static void main(String[] args) {
	String i = JOptionPane.showInputDialog("What is the password");
	int h = Integer.parseInt(i);
	Vault vault = new Vault();
	vault.tryCode(h);
	
}

}