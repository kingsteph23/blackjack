import java.util.Scanner;

public class gameactual extends computer {
    // variable for user response
    String userresponse;
    Scanner scan = new Scanner(System.in);

    // function
    void game() {
        System.out.println();
        // title
        System.out.println("Welcome to Blackjack!");
        // loop for game as along as user doesn't decide to exit
        while (userresponse != "exit") {
            // asking for user input
            System.out.println();
            System.out
                    .println("Would you like to play?(Enter exit to leave the game. If you want to play, enter play)");

            userresponse = scan.nextLine();
            // if user chooses to play
            if (userresponse.equalsIgnoreCase("play")) {
                computer gameboi = new computer();
                gameboi.firsttwo();
                gameboi.userhit();
                gameboi.computerturn();
                gameboi.game();
                // if user chooses to exit
            } else if (userresponse.equalsIgnoreCase("exit")) {
                System.out.println("Thank you for playing. Have a good day!");
                break;
                // if user puts down a invalid response
            } else {
                System.out.println("Invalid response. Please try again.");
            }

        }
    }

}
