import java.util.ArrayList;
import java.util.Scanner;

public class ArrayPractice {
    public static void main(String[] args) {
        //create an arraylist
        ArrayList<String> color  = new ArrayList<String>();

        //add some colors to the array
        color.add("yellow");
        color.add("blue");
        color.add("red");

        //print the values in the arrayList
        System.out.println(color);
        Scanner key = new Scanner(System.in);
        boolean play = true;
        while(play) {

            System.out.println("Please enter a color: ");
            color.add(key.nextLine());

            System.out.println(color);

            //continue to ask the user for a color
            System.out.println("Would you like to add another color: Yes(Y) or Quit(Q): ");
            String answer = key.nextLine();
            System.out.println(answer);
            if (answer.equalsIgnoreCase("q")) {
                play = false;
                System.out.println("OK. Good Bye!");
            }//end-if

        }//end while loop


    }//end - main method
}//end-main class
