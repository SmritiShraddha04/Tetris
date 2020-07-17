package model;

import java.util.ArrayList;

/**
 * 
 *  Piece: Z
 *  Orientation:  
 *      up       left     down     right
 *     _____     _____     _____    _____ 
 *  0 |     |  0|   * |  0|     | 0|   * | 
 *  1 | **  |  1|  ** |  1| **  | 1|  ** |
 *  2 |  ** |  2|  *  |  2|  ** | 2|  *  |
 *  3 |_____|  3|_____|  3|_____| 3|_____|
 *     01234     01234     01234    01234
 */

public class Z extends Tetromino{
  /**
   * Constructor. You may want to modify
   * @param game used in the call to super constructor
   */
  public Z(Game game) {
    super(game, "Z", Cell.RED);
    
    // initializing the layout array
    // layout array is an array of array lists
    // and the array lists contain the layout coordinates
    for(int i = 0; i < layout.length; i++) {
    	layout[i] = new ArrayList<Coordinate>();
    }
    
    Coordinate c1 = new Coordinate(0, 0);
    layout[0].add(c1);
    Coordinate c2 = new Coordinate(0, 1);
    layout[0].add(c2);
    Coordinate c3 = new Coordinate(1, 1);
    layout[0].add(c3);
    Coordinate c4 = new Coordinate(-1, 0);
    layout[0].add(c4);
    
    Coordinate c5 = new Coordinate(0, 0);
    layout[1].add(c5);
    Coordinate c6 = new Coordinate(0, 1);
    layout[1].add(c6);
    Coordinate c7 = new Coordinate(-1, 1);
    layout[1].add(c7);
    Coordinate c8 = new Coordinate(-1, 2);
    layout[1].add(c8);
    
    Coordinate c9 = new Coordinate(0, 0);
    layout[2].add(c9);
    Coordinate c10 = new Coordinate(0, 1);
    layout[2].add(c10);
    Coordinate c11 = new Coordinate(1, 1);
    layout[2].add(c11);
    Coordinate c12 = new Coordinate(-1, 0);
    layout[2].add(c12);
    
    Coordinate c13 = new Coordinate(0, 0);
    layout[3].add(c13);
    Coordinate c14 = new Coordinate(0, 1);
    layout[3].add(c14);
    Coordinate c15 = new Coordinate(-1, 1);
    layout[3].add(c15);
    Coordinate c16 = new Coordinate(-1, 2);
    layout[3].add(c16);
  }

  /**
   * rotates the piece counter-clockwise. See above orientation
   * for reference on which tile to rotate around. 
   */
  @Override
  public boolean rotate() {
	  if(count >= 1) {
		  Coordinate newCo = getOrigin();
		  
		  if(orientation == 0 || orientation == 2) {
			  orientation++;
			  newCo = newCo.translate(1, -1);
			  
			  return setOrigin(newCo);
		  }
		  
		  if(orientation == 1 || orientation == 3) {
			  if(orientation == 1) {
				  orientation++;  
			  } else {
				  orientation = 0;
			  }
			  newCo = newCo.translate(-1, 1);
			  
			  return setOrigin(newCo);
		  }
	  }
	  
	  return false;
  }
}
