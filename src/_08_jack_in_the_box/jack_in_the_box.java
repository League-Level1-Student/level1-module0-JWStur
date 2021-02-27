package _08_jack_in_the_box;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class jack_in_the_box implements ActionListener {
	
    public void showButton() {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        JButton button = new JButton();
        button.setText("Suprise");
        frame.add(button);
        frame.pack();
        button.addActionListener(this); 
        int timesPressed = 0
         
   }

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if (timesPressed == 5) {
			showPicture(jackInTheBox)
		}
	}
	
	private void showPicture(String fileName) { 
	     try {
	          JLabel imageLabel = createLabelImage(fileName);
	          JFrame frame = new JFrame();
	          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	          frame.add(imageLabel);
	          frame.setVisible(true);
	          frame.pack();
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	     private JLabel createLabelImage(String fileName) {
	         try {
	              URL imageURL = getClass().getResource(fileName);
	              if (imageURL == null) {
	                   System.err.println("Could not find image " + fileName);
	                   return new JLabel();
	              } else {
	                   Icon icon = new ImageIcon(imageURL);
	                   JLabel imageLabel = new JLabel(icon);
	                   return imageLabel;
	              }
	         } catch (Exception e) {
	              System.err.println("Could not find image " + fileName);
	              return new JLabel();
	         }
	    }
}
