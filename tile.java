class tile{ //class for constructing actual tiles
    private int x;
    private int y;
    private String letter;
    private String multi;

  
    public tile(int x, int y, String letter, String multi){
        this.x = x;
        this.y = y;
        this.letter = letter;
        this.multi = multi;

    }
    
   
    public tile(tile p){
        this.x = p.x;
        this.y = p.y;
        this.letter = p.letter;
        this.multi = p.multi;
    }
    
    public tile(int x, int y, String multi) {
      
      this.x = x;
      this.y = y;
      this.multi = multi;
      this.letter = null;
     
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getLetter() {
        return letter;
    }
    
    public void setLetter(String letter) {
        this.letter = letter;
    }
    public String getMulti() {
      return multi;
    }
    public void setMulti(String multi) {
        this.multi = multi;    
    }   
        
    public String toString(){
    
      if (this.letter == "a") {
        return "a";
      }
      else if (this.letter == "b") {
        return "b";
      }
      else if (this.letter == "c") {
        return "c";
      }
      else if (this.letter == "d") {
        return "d";
      }

      else if (this.letter == "e") {
        return "e";
      }

      else if (this.letter == "f") {
        return "f";
      }
      
      else if (this.letter == "g") {
        return "g";
      }

      else if (this.letter == "h") {
        return "h";
      }

      else if (this.letter == "i") {
        return "i";
      }

      else if (this.letter == "j") {
        return "j";
      }

      else if (this.letter == "k") {
        return "k";
      }

      else if (this.letter == "l") {
        return "l";
      }
      else if (this.letter == "m") {
        return "m";
      }
      else if (this.letter == "n") {
        return "n";
      }
      else if (this.letter == "o") {
        return "o";
      }
      else if (this.letter == "p") {
        return "";
      }
      else if (this.letter == "q") {
        return "q";
      }
      else if (this.letter == "r") {
        return "r";
      }
      else if (this.letter == "s") {
        return "s";
      }
      else if (this.letter == "t") {
        return "t";
      }
      else if (this.letter == "u") {
        return "u";
      }
      else if (this.letter == "v") {
        return "v";
      }
      else if (this.letter == "w") {
        return "w";
      }
      else if (this.letter == "x") {
        return "x";
      }
      else if (this.letter == "y") {
        return "y";
      }
      else if (this.letter == "z") {
        return "z";
      }
      else if (this.letter == "blank") {
        return "|";
      }
      else{
     return this.multi;
}
      
    }

  
  
  
  
}