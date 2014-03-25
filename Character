//Brock Stoops


public abstract class Character implements CaveWorker{
	
	protected Cave location;
	
	//Set location
	public Character(Cave initLoc){
		location = initLoc;
		location.setOccupied(true);
	}
	//Get location
	public Cave getLocation(){
		return location;
	}
	//Move function
	//moves player, marks new spot occupied and old spot open
	public boolean move(Cave to){
		if(location.isMarked()==false && location.isTeleport()==false){
			location.makeOpen();
		}
		location.setOccupied(false);
		this.location = to;
		to.setOccupied(true);
		return true;
	}
	
	public abstract String getName();
	
}
