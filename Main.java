
public class Main {
    public static void main(String[] args) {

        player gameboi = new player();
        gameboi.userhit();
        /*
         * 
         * Basic rules:
         * 
         * Goal: close to 21 or hit 21 exactly
         * 
         * Kings: 10
         * Queens: 10
         * Jack's: 10
         * Aces: 1 or 11
         * Numbers are just numbers: (1-10)
         * 
         * computer starts with two cards.(one of the cards is hidden)
         * player starts with two cards.
         * player can hit or stand
         * Both are random numbers
         * 
         * if user hits an ace and king/queen/jack,tens, automatic blackjack
         * 
         * if user hits, gets random number untill user stays stand/bust
         * total is 16 or lower, they’re required to hit and
         * take another card. If the card is 17 or higher,
         * maybe do splits?
         * Reference: https://bicyclecards.com/how-to-play/blackjack
         * 
         * BLACKJACK game skeleton:
         * 
         * 
         * main function: title/run game
         * 
         * class player:
         * 
         * int array deck of cards{1-10, king/queen/jack/aces}
         * 
         * potential loop with randomzier
         * 
         * seperate loop that iterates adds up to first two cards(random)(+=)
         * ^
         * main loop
         * --------------
         * occurs within a while loop under the condition that the user doesn't input
         * stand
         * display is prompted if user hits or stands
         * if user hits, random number is added to total
         * else if user stands, total is displayed,
         * 
         * condtions:
         * display is prompted if user:
         * if users current total >21, BUST
         * if user hits an ace and king/queen/jack,tens, automatic blackjack
         * if user selects stand, total is displayed. Break out loop. Begin computer's
         * turn
         * ----------------
         * 
         * ALWAYS SHOW CURRENT TOTAL during each play through
         * 
         * 
         * class computer:
         * 
         * int array deck of cards{1-10, king/queen/jack/aces}
         * 
         * two loops:
         * randomizer for the first card
         * 
         * nothing occurs until user selects stand
         * when user selecting statnd is true, computer's turn begins
         * 
         * if the second card >= 17, computer stands
         * if the second card < 17, computer hits(might have to modify it to be a bit
         * more realistic)
         * if first card is a (king/quen/jack/ace) and second card is an ace, automatic
         * blackjack for computer
         * 
         * user is prompted again if they want to play again. If yes, game restarts. If
         * no, game ends.
         */

    }

}