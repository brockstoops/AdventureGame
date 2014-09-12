public class Miner extends Character{
	
	//Calls Character's constructor
	public Miner(Cave initLoc){
		super(initLoc);
	}
	//Checks if space can be modified by Miner
	public boolean modifyCave(Cave loc){
		if (loc.isBlocked())
			return true;
		else 
			return false;
	}
	//Describes the action completed in the interface
	public String describeModification(){
		return "Blocked cave is now open";
	}
	//If Miner can move, call Character's move function to actually complete the move
	public boolean move(Cave to){
		if((to.isBlocked() || to.isOpen() || to.isPit() ||to.isTeleport())&& to.isOccupied()==false){
			super.move(to);
			return true;
		}
		else if(to.isBlocked()==false &&to.isOpen()==false&&to.isPit()==false&&to.isTeleport()==false){
			super.move(to);
			return true;
		}
		else {
			return false;
		}
	}
	public String getName(){
		return "Miner";
	}

}
