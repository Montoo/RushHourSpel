package RushHourSpel;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class Auto extends SpelFiguren implements ActionListener, MouseMotionListener{

	private int clickedX;
	private int LocationAutoX, LocationAutoY = 400;
	
	public Auto(int x, int y)
	{
		
		this.setSize(lengthCarX, lengthCarY);
		this.setBackground(Color.YELLOW);
		this.addMouseMotionListener(this);
	}

	@Override
	public void mouseDragged(MouseEvent e)
	{	
		int muisX = e.getX();
		int verschilX = clickedX - muisX;
		LocationAutoX = this.getX() - verschilX - 50;;
		
		this.setLocation(LocationAutoX, LocationAutoY);
		
		if(LocationAutoX < 0)
		{
			this.setLocation(0, LocationAutoY);
		}
			
		if(LocationAutoX > 400)
		{
			this.setLocation(400, LocationAutoY);
		}
		
		try
		{
			if(collisionBus())
			{
				
				this.setLocation(200, LocationAutoY);
				System.out.println("Collision!");
			}
		}
		catch(NullPointerException ex)
		{
			
		}
	}
		
	
		
	@Override
	public void mouseMoved(MouseEvent e)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		// TODO Auto-generated method stub
		
	}
	
	public boolean collisionBus()
	{
		
		return SpeelLevels.bus1.getBounds().intersects(this.getBounds());

	}
}
