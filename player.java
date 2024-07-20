import java.util.Random;
import java.util.Scanner;

public class player {
    // special card values(kings,queens,jacks,aces)
    int king = 10;
    int queen = 10;
    int jack = 10;
    int ace1 = 1;
    int ace11 = 11;
    // deck of cards. Will be randomized
    int[] deck = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, king, queen, jack, ace1, ace11 };

    // first two cards
    int card1 = deck[new Random().nextInt(deck.length)];
    int card2 = deck[new Random().nextInt(deck.length)];
    int randomnumber;
    // random number when user wants to hit
    // inital total of user decks after two cards
    int total = card1 + card2;
    String userinput;// user input
    // while the user hasn't input stand, the game will continue

    Scanner scan = new Scanner(System.in);

    // game function while user hits
    void userhit() {
        // displaying first cards
        System.out.println("Your first card is " + card1 + " Your second card is " + card2);
        System.out.println("Your current total is " + total);
        System.out.println();

        // hit or stand algorithm
        while (true) {
            // random values from deck;
            randomnumber = deck[new Random().nextInt(deck.length)];
            // asking user to hit or stand
            System.out.println();
            System.out.println("Do you want to hit or stand?");
            userinput = scan.nextLine();
            // if response is hit

            if (userinput.equals("hit")) {
                // if there are any special cards dealt to the player
                // ace
                // add up to ace
                if (randomnumber == ace1 || randomnumber == ace11) {
                    System.out.println();
                    // user hits an ace
                    System.out.println("You hit an ace.");
                    // user choice to make ace 1 or 11
                    System.out.println("Would you like to make this ace a 1 or 11?");
                    int aceinput = scan.nextInt();
                    // if user chooses 1
                    if (aceinput == 1) {
                        randomnumber = ace1;
                        // if user chooses 11
                    } else if (aceinput == 11) {
                        randomnumber = ace11;

                    }
                    // king
                } else if (randomnumber == king) {
                    System.out.println();
                    System.out.println("You hit a king");
                    // queen
                } else if (randomnumber == queen) {
                    System.out.println();
                    System.out.println("You hit a queen");
                    // jack
                } else if (randomnumber == jack) {
                    System.out.println();
                    System.out.println("You hit a jack");
                }
                // adding to total
                total += randomnumber;
                System.out.println("You hit " + randomnumber); // value of added card
                System.out.println("Your total is " + total); // overall deck total
                // if user says stand
            } else if (userinput.equals("stand")) {
                System.out.println("Your total is " + total);
                break;
            }
            // value is greater than 21, user busts
            if (total > 21) {
                System.out.println("BUST");
                break;
            }
            // automatic blackjack if user hits an ace and king/queen/jack/tens
            // fix automatic blackjack*
            // if user hits a blackjack
            if (total == 21) {
                System.out.println("BLACKJACK");
                break;
            }

        }

    }

}
