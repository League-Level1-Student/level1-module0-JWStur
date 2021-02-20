package _08_jack_in_the_box;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class jack_in_the_box implements ActionListener {
	
    public void showButton() {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        JButton button = new JButton();
        button.setText("Suprise");
        frame.add(button);
        frame.pack();
        button.addActionListener(this); 
        
        
   }

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
	
}
