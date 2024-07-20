import java.util.Scanner;

public class gameactual extends computer {

    String userresponse;

    void gameactual() {
        System.out.println("Welcome to Blackjack!");
        while (userresponse != "exit") {

            System.out
                    .println("Would you like to play?(Enter exit to leave the game. If you want to play, enter play)");
            Scanner scan = new Scanner(System.in);

            userresponse = scan.nextLine();

            if (userresponse.equalsIgnoreCase("play")) {
                computer gameboi = new computer();
                gameboi.firsttwo();
                gameboi.userhit();
                gameboi.computerturn();
                gameboi.game();
            } else if (userresponse.equalsIgnoreCase("exit")) {
                System.out.println("Thank you for playing. Have a good day!");
                break;
            } else {
                System.out.println("Invalid response. Please try again.");
            }

        }
    }

}
