public class Filler extends Character {

	//Use characters super constructor
	public Filler(Cave initLoc){
		super(initLoc);
	}
	//Test is space can be modified by filler
	public boolean modifyCave(Cave loc){
		if (loc.isPit())
			return true;
		else return false;
	}
	//Text to display on the interface when a modify is done
	public String describeModification(){
		return "Pit was filled in";
	}
	//If filler can move, call Characters move function to complete move
	public boolean move(Cave to){
		if((to.isPit() || to.isOpen() || to.isTeleport()) && to.isOccupied()==false){
			super.move(to);
			return true;
		}
		else if(to.isBlocked()==false &&to.isOpen()==false&&to.isPit()==false&&to.isTeleport()==false){
			super.move(to);
			return true;
		}
		else
			return false;
	}
	
	public String getName(){
		return "Filler";
	}

}


