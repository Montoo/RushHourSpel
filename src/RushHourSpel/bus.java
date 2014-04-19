package RushHourSpel;

import java.awt.Color;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class Bus extends SpelFiguren implements MouseMotionListener {
	
	private int clickedY;
	
	public Bus(int x, int y)
	{
		
		this.setSize(lengthBusX, lengthBusY);
		this.setBackground(Color.BLUE);
		this.addMouseMotionListener(this);
	}


	@Override
	public void mouseDragged(MouseEvent e)
	{
		int muisY = e.getY();
		int verschilY = clickedY - muisY;
		int BusY = this.getY() - verschilY - 75;
		
		
		this.setLocation(LocationBusX, BusY);
		
		
		if(BusY > 350)
		{
			setLocation(LocationBusX, 350);
		}
		
		if(BusY < 0)
		{
			setLocation(LocationBusX, 0);
		}
		
		
		try
		{
			if(collisionRodeAuto())
			{
				
				this.setLocation(LocationBusX, 80);
				System.out.println("Collision!");
			}
			
			if(collisionAuto())
			{
				
				this.setLocation(LocationBusX, 250);
				System.out.println("Collision!");
			}
			

		}
		catch(NullPointerException ex)
		{
			
		}
	}
	


	

	public boolean collisionRodeAuto()
	{
		
		return SpeelLevels.rd.getBounds().intersects(this.getBounds());
		
	}
	

	public boolean collisionAuto()
	{
			
		return SpeelLevels.auto1.getBounds().intersects(this.getBounds());
		
	}
	
	@Override
	public void mouseMoved(MouseEvent e)
	{
	}
}
