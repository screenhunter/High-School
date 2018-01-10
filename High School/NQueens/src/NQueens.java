// Class: NQueens
//
// Author: Your Name Here
//
// License Information:
//   This class is free software; you can redistribute it and/or modify
//   it under the terms of the GNU General Public License as published by
//   the Free Software Foundation.
//
//   This class is distributed in the hope that it will be useful,
//   but WITHOUT ANY WARRANTY; without even the implied warranty of
//   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
//   GNU General Public License for more details.

   import edu.kzoo.grid.BoundedGrid;
   import edu.kzoo.grid.Grid;
   import edu.kzoo.grid.Location;
   import edu.kzoo.grid.display.GridDisplay;

/**
 *  Environment-Based Applications:<br>
 *
 *    The NQueens class implements the N Queens problem.
 *
 *  @author Your Name (based on a template provided by Alyce Brady)
 *  @version 1 September 2002
 **/

   public class NQueens
   {
    // Instance Variables: Encapsulated data for EACH NQueens problem
      private Grid board;
      private GridDisplay display;
   
   // constructor
   
    /** Constructs an object that solves the N Queens Problem.
     *    @param n the number of queens to be placed on an
     *              <code>n</code> x <code>n</code> board
     *    @param d an object that knows how to display an 
     *              <code>n</code> x <code>n</code> board and
     *              the queens on it
     **/
      public NQueens(int n, GridDisplay d)
      {
         board = new BoundedGrid(n, n);
         display = d;
         display.setGrid(board);
         display.showGrid();
      }
   
   // methods
   
    /** Returns the number of queens to be placed on the board. **/
      public int numQueens()
      {
         return board.numCols() - board.numObjects();   // replace this with something more useful
      }
   
    /** Solves (or attempts to solve) the N Queens Problem. **/
      public boolean solve()
      {
         placeQueen(0);
         return true;   // replace this with something more useful
        
      }
   
    /** Attempts to place the <code>q</code>th queen on the board.
     *  (Precondition: <code>0 <= q < numQueens()</code>)
     *    @param q index of next queen to place
     **/
      private boolean placeQueen(int q)
      {
        // Queen q is placed in row q.  The only question is
        // which column she will be in.  Try them in turn.
        // Whenever we find a column that could work, put her
        // there and see if we can place the rest of the queens.
      
        //return false;
         if (q < 0 || q > board.numCols()-1)
            return false;
         	
         for (int i = 0; i < board.numCols(); i++) {
            Location loc = new Location(q, i);
            if (locationIsOK(loc)) {
               addQueen(loc);
               break;
            }
         }
         placeQueen(q+1);
         display.showGrid();
         return true;
      }
   
    /** Determines whether a queen can be placed at the specified
     *  location.
     *    @param loc  the location to test
     **/
      private boolean locationIsOK(Location loc)
      {
        // Verify that another queen can't attack this location.
        // (Only queens in previous rows have been placed.)
         boolean x = true;
        
         for (int i = 0; i < board.numCols(); i++) {
         
         	if (!board.isEmpty(new Location(loc.row(), i)) || !board.isEmpty(new Location(i, loc.col())))
         		return false;
         
         }
         
      	return x;
      }
   
    /** Adds a queen to the specified location.
     *    @param loc  the location where the queen should be placed
     **/
      private void addQueen(Location loc)
      {
         new Queen(board, loc);      // queens add themselves to the board
      }
   
    /** Removes a queen from the specified location.
     *    @param loc  the location where the queen should be removed
     **/
      private void removeQueen(Location loc)
      {
         board.remove(loc);
      }
   
   }
