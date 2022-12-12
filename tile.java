class tile{
    private int x;
    private int y;
    private String letter;


  
    public tile(int x, int y, String letter){
        this.x = x;
        this.y = y;
        this.letter = letter;

    }
    
   
    public tile(tile p){
        this.x = p.x;
        this.y = p.y;
        this.letter = p.letter;
    }

  
    public String toString(){
    
  return null;
      
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

  
  
  
  
}