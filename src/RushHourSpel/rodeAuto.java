package RushHourSpel;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JOptionPane;

public class RodeAuto extends SpelFiguren implements ActionListener, MouseMotionListener {
	
	static RodeAuto rd;
	private int LocationRdX, LocationRdY = 230;
	private int clickedX;

	
		public RodeAuto(int x, int y){
			
			this.setSize(lengthCarX, lengthCarY);
			this.setBackground(Color.RED);
			
			this.addMouseMotionListener(this);
			
		}
			
		@Override
		public void mouseDragged(MouseEvent e)
		{
			
			int muisX = e.getX();
			int verschilX = clickedX - muisX;
			LocationRdX = this.getX() - verschilX - 50;
			
			this.setLocation(LocationRdX, LocationRdY);
			
			if(LocationRdX < 0){
				this.setLocation(0, LocationRdY);
			}
				
			if(LocationRdX > 400){
				this.setLocation(400, LocationRdY);
				JOptionPane.showMessageDialog(null,"Goedzo!");
			}
			
			try{
				if(collisionBus()){
					
					this.setLocation(200, LocationRdY);
					System.out.println("Collision!");
				}
			}
			catch(NullPointerException ex){
				
			}
			
		}

		@Override
		public void mouseMoved(MouseEvent e)
		{
			
			
		}

		@Override
		public void actionPerformed(ActionEvent e)
		{
			
			
		}
			
		
		public boolean collisionBus(){
			
				return SpeelLevels.bus1.getBounds().intersects(this.getBounds());
			
			
		}

		

		
}
