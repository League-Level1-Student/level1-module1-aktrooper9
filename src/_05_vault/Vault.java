package _05_vault;

import java.util.Random;

import javax.swing.JOptionPane;

public class Vault {
	
	private int code;
	Vault(){
		System.out.println(code);
		Random r = new Random();
		code = r.nextInt(999);
	
	}
boolean tryCode(int guess){
	if (guess==code){
		JOptionPane.showMessageDialog(null, "you are in ");
		return true;
	}
	else{
		JOptionPane.showMessageDialog(null, "error ");
		return false;	}
	
}
}
