import java.util.HashMap;

class player{
 private int score;
 private String name;
 private String type;
 
 public player(int score, String name){
    this.score = score;
    this.name = name;
      
 }
 

 
 
 static void draw(){
   
   //random 
   
 }
 
 
 
 
 
 
//bag 
public static void main(String[] args) {
HashMap<String, Integer> letterbag = new HashMap<String, Integer>();

letterbag.put("a", 9);
letterbag.put("b", 2);
letterbag.put("c", 2);
letterbag.put("d", 4);
letterbag.put("e", 12);
letterbag.put("f", 2);
letterbag.put("g", 3);
letterbag.put("h", 2);
letterbag.put("i", 9);
letterbag.put("j", 1);
letterbag.put("k", 1);
letterbag.put("l", 4);
letterbag.put("m", 2);
letterbag.put("n", 6);
letterbag.put("o", 8);
letterbag.put("p", 2);
letterbag.put("q", 1);
letterbag.put("r", 6);
letterbag.put("s", 4);
letterbag.put("t", 6);
letterbag.put("u", 4);
letterbag.put("v", 2);
letterbag.put("w", 2);
letterbag.put("x", 1);
letterbag.put("y", 2);
letterbag.put("z", 1);
letterbag.put("blank", 2);

System.out.println(letterbag);
}
 
  
  
  
  
  
  
}