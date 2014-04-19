package RushHourSpel;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LevelKiezen extends JFrame implements ActionListener {
	
	private JButton level1;
	private JButton level2;
	private JButton level3;
	private JButton level4;
	private JButton level5;
	private JButton level6;
	private JButton levelBack;
	private JButton spelLadenKnop;
	
	public LevelKiezen()
	{
		
		this.setSize(800, 800);
		this.setTitle("Rushhour");
		this.setLocationRelativeTo(null);						// Frame aanmaken
		this.setDefaultCloseOperation(JFrame. EXIT_ON_CLOSE);
		this.setVisible(true);
		
		JPanel levelKiezenPanel = new JPanel();
		levelKiezenPanel.setBackground(Color.GREEN);			// Panel aanmaken
		levelKiezenPanel.setLayout(null);
		
		this.add(levelKiezenPanel);
		
		level1 = new JButton("Level 1");
		level2 = new JButton("Level 2");
		level3 = new JButton("Level 3");
		level4 = new JButton("Level 4");						// Knoppen en hun eigenschappen
		level5 = new JButton("Level 5");
		level6 = new JButton("Level 6");
		spelLadenKnop = new JButton ("Spel Laden");
		levelBack = new JButton("Terug");
		
		level1.setBounds(150, 150, 200, 50);
		level2.setBounds(450, 150, 200, 50);
		level3.setBounds(150, 250, 200, 50);
		level4.setBounds(450, 250, 200, 50);
		level5.setBounds(150, 350, 200, 50);
		level6.setBounds(450, 350, 200, 50);
		spelLadenKnop.setBounds(450, 500, 200, 50);
		levelBack.setBounds(150, 500, 200, 50);
		
		level1.addActionListener(this);
		
		levelKiezenPanel.add(level1);
		levelKiezenPanel.add(level2);
		levelKiezenPanel.add(level3);
		levelKiezenPanel.add(level4);
		levelKiezenPanel.add(level5);
		levelKiezenPanel.add(level6);
		levelKiezenPanel.add(spelLadenKnop);
		levelKiezenPanel.add(levelBack);
		
		levelBack.addActionListener(this);
		

	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource () == levelBack )
			
		{
			new SpelOpenen();
			this.dispose();							//Zorgt ervoor dat je teruggaat naar het Introscherm
		}
		
		if(e.getSource () == level1 )
			
		{
			new Speelbord();
			this.dispose();							//Zorgt ervoor dat je teruggaat naar level 1 gaat
		}
	}

}

