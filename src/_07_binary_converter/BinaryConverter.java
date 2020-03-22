package _07_binary_converter;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class BinaryConverter {
	BinaryConverter(){    
		JFrame f=new JFrame("Convert 8 bits of binary to ASCII"); 
					//submit button
		JButton b=new JButton("convert");    
		b.setBounds(10,100,140, 40);    
					//enter name label
		JLabel label = new JLabel();		
		label.setText("Enter Name :");
		label.setBounds(10, 10, 100, 100);
					//empty label which will show event after button clicked
		JLabel label1 = new JLabel();
		label1.setBounds(10, 110, 200, 100);
					//text field to enter name
		JTextField textfield= new JTextField();
		textfield.setBounds(150, 100, 130, 30);
					//add to frame
		f.add(label1);
		f.add(textfield);
		f.add(label);
		f.add(b);    
		f.setSize(300,300);    
		f.setLayout(null);    
		f.setVisible(true);    
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
		
							//action listener
		b.addActionListener(new ActionListener() {
	        
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String textinput = textfield.getText(); 
			
				    if(textinput.length() != 8){
				        JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
				        textfield.setText("-");
				    }
				        
				    String binary = "[0-1]+";//must contain numbers in the given range
				    if (!textinput.matches(binary)) {
				        JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
				        textfield.setText("-");   
				    }
				    
				    try {
				        int asciiValue = Integer.parseInt(textinput, 2);
				        char theLetter = (char) asciiValue;
				        String stringletter = Character.toString(theLetter);
				        label1.setText(stringletter);	 
				    } catch (Exception e) {
				        JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
				        textfield.setText("-"); 
				       
				    }
				
		}          
	      });
		}         
	
				                       
				
					
			         
		
		        
	
	
			public static void main(String[] args) {    
		    new BinaryConverter();    
		} 
}
 