
import java.awt.Color;
import java.awt.Graphics;



import javax.swing.JComponent;
import javax.swing.JFrame;

import ships.ShipCreator;
import canvaces.MyCanvas;


public class MainProgram {
	
  public static void main(String[] a) {
	  
	  
    JFrame window = new JFrame();
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setBounds(30, 30, 300, 300);
    window.setBackground(Color.GREEN);
    window.getContentPane().add(new MyCanvas());
    window.setVisible(true);
    
     ShipCreator shipFactury=new ShipCreator();
    shipFactury.addShip(ShipCreator.My, window, 35, 35);
     
    
  }
}



