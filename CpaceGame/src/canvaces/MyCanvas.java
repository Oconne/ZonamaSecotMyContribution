package canvaces;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;



import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

public  class MyCanvas extends JComponent implements KeyListener {

  public void paint(Graphics g) {
    g.drawRect (10, 10, 200, 200);  
  }
  
  public  MyCanvas(){
	  
	  
	  this.addKeyListener(this);
	  
  }
  
  public void keyPressed(KeyEvent e) {
		
	  
	 // System.out.println("");
	     int c = e.getKeyCode(); 
		

	     if (c == KeyEvent.VK_LEFT) { // for left key
	    	 
	       this.setLocation(getX()-1, getY());
	         }
	         
	         else  if (c == KeyEvent.VK_UP) { // for up key
	        
	      	 this.setLocation(getX(), getY()+1);
	      	 
	         }
	         
	         else  if (c == KeyEvent.VK_RIGHT) { // for right key
	      	
	      	   this.setLocation(getX()+1, getY());
	       
	         }
	         
	         else if (c == KeyEvent.VK_DOWN) { // for down key
	      	   
	      	 this.setLocation(getX(), getY()-1);
	         
	         }
		
		
  }

public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	
}

public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
  
  
}
