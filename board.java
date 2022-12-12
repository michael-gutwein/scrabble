class board{
    tile[][] board;
    int whiteCounter = 12;
    int blackCounter = 12;


    /**
     * Constructor for board
     */
    public board(){
        board = new tile[15][15];

    }
    

    /**
     * @return int which represents the value of the player. 1 will represent black win. 
     * 2 will represent white win.
     */
    public int endGame(){
        if (whiteCounter <= 0){
            return 1;
        }
        else if (blackCounter <= 0){
            return 2;
        }
        return 0;
    }
    


    /**
     * Jump method for the white king. Killing method
     * @param newX End coordinate of the piece (row/x)
     * @param newY End coordinate of the piece (column/y)
     * @param oldX Start coordinate of the piece (row/x)
     * @param oldY Start coordinate of the piece (column/y)
     */
   // public boolean commonValidation(int newX, int newY, int oldX, int oldY){
     //   if (board[newX][newY] != null){
       //     System.out.println("There is a piece there.");
         //   return false;
        //}
        //if (newX < 0){
          //  System.out.println("You've gone out of bounds.");
          //  return false;
        //}
        //if (newX > 7){
           // System.out.println("You've gone out of bounds.");
         //   return false;
       // }
        //if (newY < 0){
        //    System.out.println("You've gone out of bounds.");
      //      return false;
    //    }
    //    if (newY > 7){
     //       System.out.println("You've gone out of bounds.");
    //        return false;
    //    }
    ///    return true;
  //  }


    /**
     * Putting the pieces onto the board.
     */

    

    /**
     * prints the board to the terminal
     */
    public void printboard(){
        System.out.println("    0   1   2   3   4   5   6   7   8   9   10   11   12   13   14   15");
        System.out.println("------------------------------------------------------------------------");
        for (int i = 0; i < 15; i++){
            System.out.print(i + " | ");
        for (int j = 0; j < 15; j++){
            if (board[i][j] == null){
                System.out.print(" " + " | ");
            }
            else{
                System.out.print(board[i][j] + " | ");
            }
        }
        System.out.println();
        System.out.println("-----------------------------------");
    }
    }
 
}