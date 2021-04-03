package _10_cuteness_tv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class cuteness_tv implements ActionListener {
JButton button1 = new JButton();
JButton button2 = new JButton();
JButton button3 = new JButton();

	public void displayButton()  {
		
		JFrame frame1 = new JFrame();
		JPanel panel = new JPanel();
        frame1.setVisible(true);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        button1.setText("Duck");
        panel.add(button1);
        button1.addActionListener(this);
        button2.setText("Frog");
        panel.add(button2); 
        button2.addActionListener(this);
        button3.setText("Unicorn");
        panel.add(button3);
        button3.addActionListener(this);
        frame1.add(panel);
        frame1.pack();
       
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		JButton clicked = (JButton) arg0.getSource();
		if (clicked == button1) {
			System.out.println("duck");
			playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
		}
		else if (clicked == button2) {
			System.out.println("frog");
			playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
		}
		else if (clicked == button3) {
			System.out.println("unicorn");
			playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
		}
	}
	void playVideo(String videoID) {
	     
	     // Workaround for Linux because "Desktop.getDesktop().browse()" doesn't 
	     //work on some Linux implementations 
	     try {
	     if (System.getProperty("os.name").toLowerCase().contains("linux")) {
	     if (Runtime.getRuntime().exec(new String[] { 
	      "which", "xdg- open" }).getInputStream().read() != -1) {
	     Runtime.getRuntime().exec(new String[] { "xdg-open", videoID }); 
	     }
	     } else {
	          URI uri = new URI(videoID);
	          java.awt.Desktop.getDesktop().browse(uri);
	     }      } catch (Exception e) {
	          e.printStackTrace();
	     }
	}

}
	
