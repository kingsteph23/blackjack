import java.util.Random;

public class computer extends player {

    // first two cards
    int compcard1 = deck[new Random().nextInt(deck.length)];
    int compcard2 = deck[new Random().nextInt(deck.length)];
    int comptotal = compcard1 + compcard2;

    // first two cards
    void firsttwo() {
        System.out.println();
        System.out.println("Computer's first card is " + compcard1);
        System.out.println("Computer's second card is hidden");
        System.out.println();

    }

    // computer turn after user stands
    void computerturn() {
        // random card in computer dec
        randomnumber = deck[new Random().nextInt(deck.length)];
        System.out.println();
        System.out.println("Computer's second card is " + compcard2);
        System.out.println("Computer's total after adding the second card: " + comptotal);

        // if computer has natural blackjack
        if (comptotal == 21) {
            System.out.println("Computer has hit Blackjack!");
        }

        System.out.println();
        // game loop
        // computer adds cards until it reaches 17 or more
        while (comptotal <= 17) {
            randomnumber = deck[new Random().nextInt(deck.length)];
            System.out.println("Computer's Added Card " + randomnumber);
            comptotal += randomnumber;
        }
        // com is 17 or higher, computer stands
        System.out.println("Computer's total after adding cards: " + comptotal);

        // if computer is less than 17, keeps on adding

        System.out.println();
    }

    // game potientnal outcomes
    void game() {
        // both computer and dealer loses
        if (total > 21 && comptotal > 21) {
            System.out.println("Both you and the computer busted!");
        }
        // if there is a tie
        else if (total == comptotal) {
            System.out.println("It's a tie!");
        }

        // if player wins
        else if ((total > comptotal && total <= 21) || (comptotal > 21)) {
            System.out.println("You have beaten the computer!");

        }
        // if computer loses
        else if ((comptotal > total && comptotal <= 21) || (total > 21)) {
            System.out.println("You lost to the computer!");

        }
        // both computer and dealer loses

    }

}
