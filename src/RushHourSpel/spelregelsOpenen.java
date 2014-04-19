package RushHourSpel;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SpelregelsOpenen extends JFrame implements ActionListener {
	
	 protected static JButton spelregelsSluiten;
	
	public SpelregelsOpenen()
	{
		 
		 this.setSize(800, 800);
		 this.setTitle("Rushhour");
		 this.setLocationRelativeTo(null);						// Frame aanmaken 
		 this.setDefaultCloseOperation(JFrame. EXIT_ON_CLOSE);
		 this.setVisible(true);
		 
		 JPanel paneel = new JPanel();
		 paneel.setBackground(Color.GREEN);			// Groot paneel aanmaken
		 paneel.setLayout(null);
		 
		 this.add(paneel);
		 JLabel regels = new JLabel(new ImageIcon("C:\\Users\\Montoo\\Dropbox\\IPSEN1 groep 3\\Project\\Rushhour\\spelregels.jpg")); // Afbeelding van spelregels toevoegen
		 
		 JPanel spelregels = new JPanel();
		 spelregels.setBounds(15,125, 550, 520);	// Paneel voor textveld aanmaken
		 spelregels.setBackground(Color.WHITE);
		 
		 spelregelsSluiten= new JButton("Spelregels Sluiten");
		 spelregelsSluiten.setBounds(580,375, 200, 50);
		 spelregelsSluiten.addActionListener(this);
		 
		 spelregels.add(regels);
		 paneel.add(spelregels);
		 paneel.add(spelregelsSluiten);
	 }

	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource () == spelregelsSluiten )
		{
			this.dispose();							// Zorgen dat je spelregels kan sluiten
		}
		
	}

}
