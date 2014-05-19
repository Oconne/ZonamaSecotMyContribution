package weapons;



public class EnemyWeapon extends Weapon{

	public static final int Cannon=0;
	
	
	protected Projectile createProjectile(int cWeapon){
		
		if(cWeapon==Cannon){
			
			return new MyCannonBall();
		}
		else{
			
			return null;
			}
		
	}
	
	
}