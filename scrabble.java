import java.util.Scanner; //main
 
class scrabble{
  
 public static int[] getInput(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter row(left side):");
        int placeX = input.nextInt();
        System.out.println("Enter column(top):");
        int placeY = input.nextInt();
        int[] inputArray = {placeX, placeY};
        return inputArray;
 }
 
 
        

 
        
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
  System.out.println("Welcome to Scrabble!");
  System.out.println("How many players will be playing?");
        board g = new board();
       int count = input.nextInt();
       System.out.println(count);
       if(count == 2){
        player a = new player (0, "a");
        player b = new player (0, "b");
       }
       else if(count == 3) {
        player a = new player (0, "a");
        player b = new player (0, "b");
        player c = new player (0, "c");
       }
       else if(count == 4) {
        player a = new player (0, "a");
        player b = new player (0, "b");
        player c = new player (0, "c");
        player d = new player (0, "d");
       }
       else{
         throw new IllegalArgumentException();
       }
       boolean gamestart; 
       while(gamestart = true){
         
         
         
         
         
                 
       }
       
       g.printboard();
       

        
        
}
}