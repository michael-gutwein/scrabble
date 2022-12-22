import java.util.ArrayList; //class for the player and letterbag
import java.util.HashMap;

class player{
 private int score;
 private String name;
 private String type;
 static ArrayList<lettertile> bag;
 
  public player(int score, String name){
    this.score = score;
    this.name = name;
    
      
 }
 

 
 
 
 
 static { //replace "bag" with "dictionary"
   HashMap<String, Integer> letterdictionary = new HashMap<String, Integer>();

//letter dictionary   
letterdictionary.put("a", 9);
letterdictionary.put("b", 2);
letterdictionary.put("c", 2);
letterdictionary.put("d", 4);
letterdictionary.put("e", 12);
letterdictionary.put("f", 2);
letterdictionary.put("g", 3);
letterdictionary.put("h", 2);
letterdictionary.put("i", 9);
letterdictionary.put("j", 1);
letterdictionary.put("k", 1);
letterdictionary.put("l", 4);
letterdictionary.put("m", 2);
letterdictionary.put("n", 6);
letterdictionary.put("o", 8);
letterdictionary.put("p", 2);
letterdictionary.put("q", 1);
letterdictionary.put("r", 6);
letterdictionary.put("s", 4);
letterdictionary.put("t", 6);
letterdictionary.put("u", 4);
letterdictionary.put("v", 2);
letterdictionary.put("w", 2);
letterdictionary.put("x", 1);
letterdictionary.put("y", 2);
letterdictionary.put("z", 1);
letterdictionary.put("blank", 2);

HashMap<String, Integer> letterValue = new HashMap<String, Integer>();
//letter values
letterValue.put("a", 1);
letterValue.put("b", 3);
letterValue.put("c", 3);
letterValue.put("d", 2);
letterValue.put("e", 1);
letterValue.put("f", 4);
letterValue.put("g", 2);
letterValue.put("h", 4);
letterValue.put("i", 1);
letterValue.put("j", 8);
letterValue.put("k", 5);
letterValue.put("l", 111);
letterValue.put("m", 2);
letterValue.put("n", 6);
letterValue.put("o", 8);
letterValue.put("p", 2);
letterValue.put("q", 1);
letterValue.put("r", 6);
letterValue.put("s", 4);
letterValue.put("t", 6);
letterValue.put("u", 4);
letterValue.put("v", 2);
letterValue.put("w", 2);
letterValue.put("x", 1);
letterValue.put("y", 2);
letterValue.put("z", 1);
letterValue.put("blank", 2);

ArrayList<lettertile> letterbag = new ArrayList<lettertile>();

for(String s : letterdictionary.keySet()){
 int n = letterdictionary.get(s);
 for(String ss : letterValue.keySet()){
 int m = letterValue.get(ss);
 
 for (int i = 0; i < n; i ++){
   lettertile qtile = new lettertile(s, m);

   
 }
 }
 }
                            }

 
   
 
 

 
 static void draw(){ 
  int random = (int)(Math.random() * 99);
  
 }
 
 
 
 
 
 
//values
public static void main(String[] args) {
}
}
