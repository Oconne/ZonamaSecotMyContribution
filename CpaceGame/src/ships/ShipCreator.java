package ships;

import javax.swing.JFrame;



public class ShipCreator {

	public static final int My=0;
	public static final int Enemy=1;
	
	public void addShip(int shipType,JFrame jf ,int xloc,int yloc){
		
		
		Ship ship=this.createShip(shipType);
		ship.setLocation(xloc,yloc);
		
		jf.add(ship);
		ship.initShip();
		
	}

	private Ship createShip(int shipType) {
		// TODO Auto-generated method stub
		
		if(shipType==My){
			
			return new MyShip();
			
		}else if(shipType==Enemy){
			
			return new EnemyShip();
		}
		
		
		return null;
	}
	
	
	
}
