package weapons;


import java.awt.*;

import javax.swing.ImageIcon;

import canvaces.MyCanvas;




public class MyCannonBall extends Projectile {

	public void drawProjectile(){
		
		//ImageIcon image = new ImageIcon("MyWeapon.jpg"); ako moge
	
		getContentPane().add(new MyCanvas());
		
	}
	
	 
	public void arm(){
		
		this.nSpeed=-10;
		
	}
	
	
	
	
}
