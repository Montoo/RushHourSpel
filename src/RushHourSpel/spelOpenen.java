package RushHourSpel;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SpelOpenen extends JFrame implements ActionListener {
	
	
	private JButton startSpelKnop;
	private JButton	exitKnop;
	private	JButton highScoresKnop;
	
	
	public SpelOpenen()
	{
		this.setSize(800, 800);
		this.setTitle("Rushhour");
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame. EXIT_ON_CLOSE);
		this.setVisible(true);
		
		
		JPanel introscherm = new JPanel();
		this.add(introscherm);
		
		introscherm.setBackground(Color.GREEN);
		introscherm.setLayout(null);
		
		startSpelKnop = new JButton("Start Spel");
		startSpelKnop.setBounds(300, 200, 200 ,50);
		startSpelKnop.addActionListener(this);
		
		highScoresKnop = new JButton("Highscores");
		highScoresKnop.setBounds(300, 300, 200 ,50);
		
		exitKnop = new JButton("Exit");
		exitKnop.setBounds(300, 400, 200 ,50);
		exitKnop.addActionListener(this);
		
		introscherm.add(startSpelKnop);
		introscherm.add(highScoresKnop);
		introscherm.add(exitKnop);
	}
	
	public static void main(String[] args)
	{	
		new SpelOpenen();
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource () == startSpelKnop )
			
		{
			new LevelKiezen();
		}
		
		if(e.getSource () == exitKnop )
			
		{
			System.exit(0);
		}
	}

}
