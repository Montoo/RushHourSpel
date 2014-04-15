package RushHourSpel;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
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
		this.setTitle("Level Kiezen");
		this.setLocationRelativeTo(null);						// Frame aanmaken
		this.setDefaultCloseOperation(JFrame. EXIT_ON_CLOSE);
		this.setVisible(true);
		
		
		JPanel levelKiezenPanel = new JPanel();
		levelKiezenPanel.setBackground(Color.GREEN);			// Panel aanmaken
		levelKiezenPanel.setLayout(null);
		
		this.add(levelKiezenPanel);
		
		
		level1 = new JButton("LEVEL 1");
		level2 = new JButton("LEVEL 2");
		level3 = new JButton("LEVEL 3");
		level4 = new JButton("LEVEL 4");						// Knoppen en hun eigenschappen
		level5 = new JButton("LEVEL 5");
		level6 = new JButton("LEVEL 6");
		spelLadenKnop = new JButton ("SPEL LADEN");
		levelBack = new JButton("TERUG");
		
		level1.setBounds(100, 50, 200, 70);
		level2.setBounds(400, 50, 200, 70);
		level3.setBounds(100, 150, 200, 70);
		level4.setBounds(400, 150, 200, 70);
		level5.setBounds(100, 250, 200, 70);
		level6.setBounds(400, 250, 200, 70);
		spelLadenKnop.setBounds(400, 400, 200, 70);
		levelBack.setBounds(100, 400, 200, 70);
		
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
			 new SpelOpenen();							//Zorgt ervoor dat je teruggaat naar het Introscherm
		}
		
	}

}

