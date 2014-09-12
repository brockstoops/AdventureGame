//Brock Stoops
//COP 3330
//Assignment 4

public class Adventurer extends Character {
	
	//Constructor
	public Adventurer(Cave initLoc){
		super(initLoc);
	}
	
	//Adventurer can modify teleports
	public boolean modifyCave(Cave loc){
		if (loc.isTeleport()){
			loc.setMarked(true);
			return true;
		}
		else 
			return false;
	}
	//Display words for bottom line
	public String describeModification(){
		return "Marked spot as Teleport";
	}
	//If valid move call Characters move function
	public boolean move(Cave to){
		if((to.isTeleport() || to.isOpen() || to.isPit()) && to.isOccupied() == false) {
			super.move(to);
			return true;
		}
		else
			return false;
	}
	//Name
	public String getName(){
		return "Adventurer";
	}


}
