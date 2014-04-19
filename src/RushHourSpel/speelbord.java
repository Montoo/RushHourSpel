package RushHourSpel;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Speelbord extends JFrame implements ActionListener
{
	
	private JButton spelregelsKnop;
	private JButton herstartenKnop;
	private JButton	highscoresKnop;
	private JButton levelSelectKnop;
	private JButton opslaanKnop;
	private JButton afsluitenKnop;
	
	
	public Speelbord()
	{
		this.setSize(800, 800);
		this.setTitle("Rushhour");
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame. EXIT_ON_CLOSE);
		this.setVisible(true);
		
		JPanel speelbord = new JPanel();
		speelbord.setBackground(Color.GREEN);
		speelbord.setLayout(null);
		
		this.add(speelbord);
		
		spelregelsKnop = new JButton("Spelregels");
		herstartenKnop = new JButton("Herstarten");
		highscoresKnop = new JButton("Highscores");
		levelSelectKnop = new JButton("Level Selecteren");
		opslaanKnop = new JButton("Opslaan");
		afsluitenKnop = new JButton("Afsluiten");
		
		spelregelsKnop.setBounds(575, 150, 200, 50);
		herstartenKnop.setBounds(575, 225, 200, 50);
		highscoresKnop.setBounds(575, 300, 200, 50);
		levelSelectKnop.setBounds(575, 375, 200, 50);
		opslaanKnop.setBounds(575, 450, 200, 50);
		afsluitenKnop.setBounds(575, 525, 200, 50);
		
		spelregelsKnop.addActionListener(this);
		herstartenKnop.addActionListener(this);
		highscoresKnop.addActionListener(this);
		levelSelectKnop.addActionListener(this);
		opslaanKnop.addActionListener(this);
		afsluitenKnop.addActionListener(this);
		
		SpeelLevels level1 = new SpeelLevels();
		level1.setLayout(null);
		level1.setBounds(0,0, 500, 500);
		
		JPanel speelveld = new JPanel();
		speelveld.setBackground(Color.WHITE);
		speelveld.setLayout(null);
		speelveld.setBounds(50, 125, 500, 500);
		speelveld.add(level1);
		
		speelbord.add(speelveld);
		speelbord.add(spelregelsKnop);
		speelbord.add(herstartenKnop);
		speelbord.add(highscoresKnop);
		speelbord.add(levelSelectKnop);
		speelbord.add(opslaanKnop);
		speelbord.add(afsluitenKnop);
		
		
	}
		


	@Override
	public void actionPerformed(ActionEvent e)
	{
		
		if(e.getSource () == spelregelsKnop )
			
		{
			new SpelregelsOpenen();
		}
		
		if(e.getSource () == herstartenKnop )
			
		{
			new Speelbord();
			this.dispose();
		}
		
		if(e.getSource () == highscoresKnop )
			
		{
			new HighscoreOpenen();
			this.dispose();
		}
		
		if(e.getSource () == levelSelectKnop )
			
		{
			new LevelKiezen();
			this.dispose();
		}
		
		if(e.getSource () == opslaanKnop )
			
		{
			new HighscoreOpenen();
			this.dispose();
		}
		
		if(e.getSource () == afsluitenKnop )
			
		{
			new SpelOpenen();
			this.dispose();
		}
		
	}
	
}

