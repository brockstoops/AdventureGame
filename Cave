//Brock Stoops


//All methods are very self explanatory, so left out comments for each one since they arent needed

public class Cave{

	public static enum CaveType{
		OPEN, BLOCKED, PIT, TELEPORT
	}

	//Declare variables for this class
	private int row;
	private int column;
	public String type;
	private boolean occupied;
	private boolean marked;
	
	//Set row and column for this cave
	public Cave(int r, int c){
		this.row = r;
		this.column = c;		
	}
	
	public int getRow(){
		return this.row;
	}
	
	public int getCol(){
		return this.column;
	}
	
	public void setOccupied(boolean set){
		this.occupied = set;
	}
	
	public boolean isOccupied(){
		if(this.occupied)
			return true;
		else
			return false;
	}
	
	public void setMarked(boolean set){
		this.marked = set;
	}
	
	public boolean isMarked(){
		if(this.marked)
			return true;
		else
			return false;
	}
	
	public void makeOpen(){
		this.type = "OPEN";
	}
	
	public boolean isOpen(){
		if(this.type == "OPEN")
			return true;
		else
			return false;
	}
	
	public void makeBlocked(){
		this.type = "BLOCKED";
	}
	
	public boolean isBlocked(){
		if(this.type == "BLOCKED")
			return true;
		else
			return false;
	}
	
	public void makePit(){
		this.type = "PIT";
	}
	
	public boolean isPit(){
		if(this.type == "PIT")
			return true;
		else
			return false;
	}
	
	public void makeTeleport(){
		this.type = "TELEPORT";
	}
	
	public boolean isTeleport(){
		if(this.type == "TELEPORT")
			return true;
		else
			return false;
	}
}
