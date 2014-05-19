package weapons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Projectile extends JFrame implements ActionListener {

	public  int nSpeed;
	
	
	public void actionPerformed(ActionEvent e) { // tuk iskam da ipolzwam subitito taimera prawi nowa sekunda
		
		this.setLocation(getX()+nSpeed, getY());
		
		if((this.getY()<0) || (this.getY()>600) ) // tuk iskam dostyp do viso4inata na prozoreza na igrata 4rez 600
		{
			
			
		//	this.removeActionListener
			remove(this);
			
		}
		
		
	}
	
	public void drawProjetile(){}
	
	public void arm (){nSpeed=5;}
	
	public void setLocation(int xloc,int yloc){
		
		this.setLocation(xloc, yloc);
		
	}
	
	public void release(){
	
		
	} 
	
	
	
}
