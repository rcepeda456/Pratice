package pratice;

public class PracticeOOP {
 
	public int ammoClip =30;
	public  String gunType ="Uzi";
	public int magSize = 300;
	
	
	public  boolean CanShoot() {

			return ammoClip >0;
		
			
	}
		
	public void Shoot() {
		if(CanShoot()) { // if canShoot  function is true then we  decrement ammoClip
			ammoClip--;
			if(ammoClip == 0) { // if ammoClip is  = 0 then we call the Reload function below
				Reload();
			}
				
			
		}
		else {
			System.out.println("We cannot shoot"); // else we cannot shoot
		}
	}
	public  void Reload() {

		 
			int ammoNeeded = 30 - ammoClip; 
			if(magSize > ammoNeeded) {
				magSize = magSize - ammoNeeded;
				ammoClip = 30;
			}else {
				ammoClip = ammoClip + magSize;
				magSize =0;
				
				
			}
		}
	
	}

