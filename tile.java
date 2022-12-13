class tile{
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
    
    public String getMulti() {
      return multi;
    }
    
    

  
  
  
  
}