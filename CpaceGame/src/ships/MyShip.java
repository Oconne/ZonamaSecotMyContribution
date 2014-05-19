package ships;



import javax.swing.*;

import canvaces.MyCanvas;

import java.awt.Color;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import weapons.MyCannonBall;

public class MyShip extends Ship{

	
	private MyCannonBall weapon;
	
	
	public void drawShip(){
		
		

		this.getContentPane().add(new MyCanvas());
	         
}
	
	
	
	public void initShip(){
		
		weapon=new MyCannonBall();
		
		this.addKeyListener((KeyListener) this);
		
		
		
	}

	
	public void keyPressed(KeyEvent e) {
		
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
	
	
	
}
