package RushHourSpel;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class HighscoreOpenen extends JFrame implements ActionListener {
	
	private JButton highscoreSluiten;

		
		public HighscoreOpenen() 
		{
			this.setSize(800, 800);
			this.setTitle("Highscores");
			this.setLocationRelativeTo(null);						// Frame aanmaken
			this.setDefaultCloseOperation(JFrame. EXIT_ON_CLOSE);
			this.setVisible(true);
			
			JPanel highscoresScherm = new JPanel();
			highscoresScherm.setBackground(Color.GREEN);			// Panel aanmaken
			highscoresScherm.setLayout(null);
			
			
			this.add(highscoresScherm);
			
			highscoreSluiten = new JButton("Highscore sluiten");
			highscoreSluiten.setBounds(550, 350, 200, 50);
			highscoreSluiten.addActionListener(this);				// "highscore Sluiten" knop aanmaken
			highscoresScherm.add(highscoreSluiten);
			
			JTextArea highscoreLijst = new JTextArea("Highscores Lijst", 100, 300);
			highscoreLijst.setLineWrap(true);
			highscoreLijst.setWrapStyleWord(true);
			highscoreLijst.setForeground(Color.BLACK);				// Text Area aanmaken
			highscoreLijst.setBounds(50, 50, 400, 650);
			highscoresScherm.add(highscoreLijst);
			
			
		}

		@Override
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource () == highscoreSluiten )					//zorgen dat het highscore frame sluit
			{
				highscoresScherm.dispose();
			}
		}
}
