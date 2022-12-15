import java.util.Scanner;
 
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
        board g = new board();
        Scanner input = new Scanner(System.in);
        g.printboard();
        
        
}
}