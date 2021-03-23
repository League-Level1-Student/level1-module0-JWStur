package _09_sound_effects_machine;

import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JButton;
import javax.swing.JFrame;

public class sound_effects_machine {

	public void displayButton() {
		JFrame frame1 = new JFrame();
        frame1.setVisible(true);
        JButton button1 = new JButton();
        button1.setText("Sound 1");
        frame1.add(button1);
        frame1.pack();
        JFrame frame2 = new JFrame();
        frame2.setVisible(true);
        JButton button2 = new JButton();
        button2.setText("Sound 2");
        frame2.add(button2);
        frame2.pack();
        JFrame frame3 = new JFrame();
        frame3.setVisible(true);
        JButton button3 = new JButton();
        button3.setText("Sound 3");
        frame3.add(button3);
        frame3.pack();
        JFrame frame4 = new JFrame();
        frame4.setVisible(true);
        JButton button4 = new JButton();
        button4.setText("Sound 4");
        frame4.add(button4);
        frame4.pack();
       
		
	}
	
	private void playSound(String soundFile) {
		String path = "src/_09_sound_effects_machine/";
			File sound = new File(path+soundFile);
			if (sound.exists()) {
				new Thread(() -> {
				try {
					Clip clip = AudioSystem.getClip();
					clip.open(AudioSystem.getAudioInputStream(sound));
					clip.start();
					Thread.sleep(clip.getMicrosecondLength()/1000);
				}
				catch (Exception e) {
					System.out.println("Could not play this sound");
				}}).start();
	 		}
			else {
				System.out.println("File does not exist");
			}
		
	}
    
}
