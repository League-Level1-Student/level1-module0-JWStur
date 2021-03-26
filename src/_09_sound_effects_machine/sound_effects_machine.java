package _09_sound_effects_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class sound_effects_machine implements ActionListener {
JButton button1 = new JButton();
JButton button2 = new JButton();
JButton button3 = new JButton();
JButton button4 = new JButton();
	public void displayButton()  {
		
		JFrame frame1 = new JFrame();
		JPanel panel = new JPanel();
        frame1.setVisible(true);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        button1.setText("Sound 1");
        panel.add(button1);
        button1.addActionListener(this);
        button2.setText("Sound 2");
        panel.add(button2); 
        button2.addActionListener(this);
        button3.setText("Sound 3");
        panel.add(button3);
        button3.addActionListener(this);
        button4.setText("Sound 4");
        button4.addActionListener(this);
        panel.add(button4);
        frame1.add(panel);
        frame1.pack();
       
		
	}
	

	private void playSound(String soundFile) {
//		String path = "src/_09_sound_effects_machine/";
//			File sound = new File(path+soundFile);
//			if (sound.exists()) {
//				new Thread(() -> {
//				try {
//					Clip clip = AudioSystem.getClip();
//					clip.open(AudioSystem.getAudioInputStream(sound));
//					clip.start();
//					Thread.sleep(clip.getMicrosecondLength()/1000);
//				}
//				catch (Exception e) {
//					System.out.println("Could not play this sound");
//				}}).start();
//	 		}
//			else {
//				System.out.println("File does not exist");
//			}
		System.out.println(soundFile);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		JButton clicked = (JButton) arg0.getSource();
		if (clicked == button1) {
			playSound("BARK!!!");
		}
		else if (clicked == button2) {
			playSound("QUACK!!!");
		}
		else if (clicked == button3) {
			playSound("RAWR!!!");
		}
		else if (clicked == button4) {
			playSound("MUNCH!!!");
		}
	}
    
}
