class board{
    tile[][] board;
  //  int whiteCounter = 12;
  //  int blackCounter = 12;


    /**
     * Constructor for board
     */
    public board(){
        board = new tile[15][15];
        initialization();

    }
    


    /**
     * @return int which represents the value of the player. 1 will represent black win. 
     * 2 will represent white win.
     */
  //  public int endGame(){
   //     if (whiteCounter <= 0){
 //           return 1;
 //       }
  //      else if (blackCounter <= 0){
//            return 2;
 //       }
  //      return 0;
//    }
    


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
     * Putting the multipliers onto the board.
     */ 
    public void initialization(){
        for (int i = 1; i < 8; i += 2){ //row one done
            board[0][0] = new tile(0, 0, "@");
            board[0][3] = new tile(0, 0, "&");
            board[0][7] = new tile(0, 0, "@");
            board[0][11] = new tile(0, 0, "&");
            board[0][14] = new tile(1, 1, "@");
            board[1][1] = new tile(1, 1, "%");
            board[1][5] = new tile(1, 1, "#");
            board[1][9] = new tile(1, 1, "#");
            board[1][13] = new tile(1, 13, "%");
            board[2][2] = new tile(1, 1, "%");
            board[2][6] = new tile(1, 1, "&");
            board[2][8] = new tile(1, 1, "&");
            board[2][12] = new tile(1, 1, "%");
            board[3][3] = new tile(1, 1, "%");
            board[3][0] = new tile(1, 1, "&");
            board[3][7] = new tile(1, 1, "&");
            board[3][11] = new tile(1, 1, "%");
            board[3][14] = new tile(1, 1, "&");
            board[4][4] = new tile(1, 1, "%");
            board[4][10] = new tile(1, 1, "%");
            board[5][5] = new tile(1, 1, "#");
            board[5][1] = new tile(1, 1, "#");
            board[5][9] = new tile(1, 1, "#");
            board[5][13] = new tile(1, 1, "#");
            board[6][6] = new tile(1, 1, "&");
            board[6][2] = new tile(1, 1, "&");
            board[6][8] = new tile(1, 1, "&");
            board[6][12] = new tile(1, 1, "&");
            board[7][0] = new tile(1, 1, "@");
            board[7][3] = new tile(1, 1, "&");
            board[7][7] = new tile(1, 1, "*");
            board[7][11] = new tile(1, 1, "&");
            board[7][14] = new tile(1, 1, "@");
            board[8][2] = new tile(1, 1, "&");
            board[8][8] = new tile(1, 1, "&");
            board[8][6] = new tile(1, 1, "&");
            board[8][12] = new tile(1, 1, "&");
            board[9][1] = new tile(1, 1, "#");
            board[9][5] = new tile(1, 1, "#");
            board[9][9] = new tile(1, 1, "#");
            board[9][13] = new tile(1, 1, "#");
            board[10][4] = new tile(1, 1, "%");
            board[10][10] = new tile(1, 1, "%");
            board[11][0] = new tile(1, 1, "&");
            board[11][3] = new tile(1, 1, "%");
            board[11][7] = new tile(1, 1, "&");
            board[11][11] = new tile(1, 1, "%");
            board[11][14] = new tile(1, 1, "&");
            board[12][2] = new tile(1, 1, "%");
            board[12][6] = new tile(1, 1, "&");
            board[12][8] = new tile(1, 1, "&");
            board[12][12] = new tile(1, 1, "%");
            board[13][1] = new tile(1, 1, "%");
            board[13][5] = new tile(1, 1, "#");
            board[13][9] = new tile(1, 1, "#");
            board[13][13] = new tile(1, 1, "%");
            board[14][14] = new tile(1, 1, "@");
            board[14][0] = new tile(1, 1, "&");
            board[14][3] = new tile(1, 1, "@");
            board[14][7] = new tile(1, 1, "@");
            board[14][12] = new tile(1, 1, "%");
        }
    }

     

    /**
     * prints the board to the terminal
     */
    public void printboard(){
        System.out.println("*= center");
        System.out.println("& = dl");
        System.out.println("% = dw");
        System.out.println("# = tl");
        System.out.println("@ = tw");
        
        System.out.println("    0   1   2   3   4   5   6   7   8   9  10  11  12  13  14");
       
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
        System.out.println("-----------------------------------------------------------------");
    }
    }
 
}