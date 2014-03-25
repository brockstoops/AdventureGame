//Brock Stoops

import java.util.Random;

public class Board extends Object {
	
	private Cave [][] board;
	private Cave test;

	public Board(int rows, int cols){
		
		this.board = new Cave[rows][cols];
		
		//Double for loop to make random board
		//Makes spaces for teleport, blocked, pit and open randomly
		for (int i=0; i<rows; ++i) {
			for (int j=0; j<cols; ++j) {				
		
				Random rand = new Random();
				int temp;
				temp = rand.nextInt(10);
				if(temp == 5){
					this.board[i][j] = new Cave(i, j);
					this.board[i][j].makeTeleport();
				}
				else if(temp == 9 || temp == 8){
					this.board[i][j] = new Cave(i, j);
					this.board[i][j].makeBlocked();
				}
				else if(temp == 7 || temp == 6){
					this.board[i][j] = new Cave(i,j);
					this.board[i][j].makePit();
				}
				else if(temp<5){
					this.board[i][j] = new Cave(i,j);
					this.board[i][j].makeOpen();
				}
			}
		}
		//Make sure start and finish are left open
		board[0][0].setOccupied(true);
		board[rows-1][cols-1].makeOpen();
	}
	
	//retrun the cave type for this space on the board
	public Cave getCave(int r, int c){
		if(ok(r,c) == false)
			return null;
		else
			return this.board[r][c];
	}
	
	//make sure move is on board
	public boolean ok(int r, int c){
		if(r>=0 && r<10 && c>=0 && c<10)
			return true;
		else 
			return false;
	}
	
	//Get random open spot on board using random number generators
	public Cave getUnoccupiedOpenLocation(){
		while(true){
		Random rand2 = new Random();
		Random rand3 = new Random();
		int temp1 = rand2.nextInt(9);
		int temp2 = rand3.nextInt(9);
		
		this.test = this.board[temp1][temp2];
		
		if(this.test.isOpen()==true&&this.test.isOccupied()==false)
			break;
		}
		return this.test;
	}
	
}
