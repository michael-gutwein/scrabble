//testing stuff //class for logic
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
class logic {
 public static void main(String[] args) {
 try {
 File file = new File("words.txt");
 Scanner input = new Scanner(file);
 while (input.hasNextLine()) {
 String line = input.nextLine();
 System.out.println(line);
 }
 input.close();
 }
 catch (FileNotFoundException e) {
 System.out.println("File does not exist.");
 }
 }
}

//check if

//word is not on list ==> use .contains
//word is connected ==> need to work on the foundations first
//lettersin the word can be made at all
//state of the board is valid