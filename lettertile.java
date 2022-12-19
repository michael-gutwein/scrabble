class lettertile{  //class for tiles in a player's inventory 

private String letter;
private int value;



    public lettertile(String letter, int value){
    
    this.letter = letter;
    this.value = value;
  
  
    }
public String getLetter() {
        return letter;
    }
    
    public void setLetter(String letter) {
        this.letter = letter;
    }
    
    public int getValue() {
     return value; 
    }
    
    public void setValue(int value) {
     this.value = value; 
    }
    
    
}