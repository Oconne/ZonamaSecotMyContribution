package weapons;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Weapon {

	
	public void fire(int cWeapon,JFrame jf,int xloc,int yloc){
		
	Projectile	 projectile=this.createProjectile(cWeapon);
		
	projectile.drawProjetile();
	
	projectile.setLocation(xloc, yloc);
	
	projectile.arm();
	
	jf.getContentPane().add(projectile);
	
	ActionEvent e = null;
	projectile.actionPerformed(e);;
	
	}

	private Projectile createProjectile( int cWeapon) {
		// TODO Auto-generated method stub

		return null;
	}
	
	
	
	
}
