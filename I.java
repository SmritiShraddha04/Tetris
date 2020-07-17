package model;
/**
Piece: I
*  Orientation:  
*        up       left      down      right       up again
*       _____     _____     _____     _____        _____
*     0|   * |  0|     |  0|  *  |  0|     | ->  0| *   |
*     1|   * |  1| ****|  1|  *  |  1|**** | ->  1| *   |
*     2|   * |  2|     |  2|  *  |  2|     | ->  2| *   |
*     3|   * |  3|     |  3|  *  |  3|     | ->  3| *   |
*     4|_____|  4|_____|  4|_____|  4|_____| ->  4|_____|
*       01234     01234     01234   01234          01234
*     
*     Notice this means that as you keep rotating it 
*     will automatically move left
*/

import java.util.ArrayList;

public class I extends Tetromino {
  /**
   * Constructor. You may want to modify
   * @param game used in the call to super constructor
   */
  public I(Game game) {
    super(game, "I", Cell.CYAN);
    
    // initializing the layout array
    // layout array is an array of array lists
    // and the array lists contain the layout coordinates
    for(int i = 0; i < layout.length; i++) {
    	layout[i] = new ArrayList<Coordinate>();
    }
    
    for(int i = 0; i < layout.length; i++) {
    	if(i == 0 || i == 2) {
    		for(int j = 0; j < layout.length; j++) {
    			Coordinate c = new Coordinate(0, j);
    			layout[i].add(c);
    		}
    	}
    	
    	if(i == 1 || i == 3) {
    		for(int j = 0; j < layout.length; j++) {
    			Coordinate c = new Coordinate(j, 0);
    			layout[i].add(c);
    		}
    	}
    }
  }

  /**
   * rotates the piece counter-clockwise. See above orientation
   * for reference on which tile to rotate around. 
   */
  @Override
  public boolean rotate() {
	  Coordinate newCo = getOrigin();
	  
	  if(orientation == 0 || orientation == 2) {
		  orientation++;
		  newCo = newCo.translate(-2, 1);
		  
		  return setOrigin(newCo);
	  }
	  
	  if(orientation == 1 || orientation == 3) {
		  if(orientation == 1) {
			  orientation++;
		  } else {
			  orientation = 0;
		  }
		  newCo = newCo.translate(1, -1);
		  
		  return setOrigin(newCo);
	  }
	  
	  return false;
  }
}
