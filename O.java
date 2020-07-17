package model;

/**
Piece: O
*  Orientation:  
*      up      left     down     right
*     ____     ____     ____     ____
*   0|    |  0|    |  0|    |  0|    |
*   1| ** |  1| ** |  1| ** |  1| ** |   
*   2| ** |  2| ** |  2| ** |  2| ** |
*   3|____|  3|____|  3|____|  3|____|
*     0123     0123     0123     0123
*    
*/

import java.util.ArrayList;

public class O extends Tetromino {

  public O(Game game) {
    /**
     * Constructor. You may want to modify
     * @param game used in the call to super constructor
     */
    super(game, "O", Cell.YELLOW);
    
    // initializing the layout array
    // layout array is an array of array lists
    // and the array lists contain the layout coordinates
    for(int i = 0; i < layout.length; i++) {
    	layout[i] = new ArrayList<Coordinate>();
    }
    
    for(int i = 0; i < layout.length; i++) {
    	for(int j = 0; j < 2; j++) {
    			Coordinate c = new Coordinate(j, 0);
    			layout[i].add(c);
    	}
    		
    	for(int j = 0; j < 2; j++) {
    			Coordinate c = new Coordinate(j, 1);
    			layout[i].add(c);
    	}
    }
  }

  /**
   * rotates the piece counter-clockwise. See above orientation
   * for reference on which tile to rotate around. 
   */
  @Override
  public boolean rotate() {
	  return false; // O does not rotate at any point in the game
  }

  
}
