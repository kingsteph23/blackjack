
Titile(Asking User if they would like to play or not)
![Screenshot 2024-07-21 001958](https://github.com/user-attachments/assets/0ddc62ee-1ce3-43a5-bdc4-7a8237187a5b)


User Hits or Stand:
![Screenshot 2024-07-21 002010](https://github.com/user-attachments/assets/59163eeb-3d5f-4423-80eb-c3fea64b7c4a)


If the user wins/loses. If the user decides to exit:
![Screenshot 2024-07-21 002021](https://github.com/user-attachments/assets/33746062-5785-4d54-8f8f-e1cb1ca73735)


Classes explanation:
Main Class-
Displays the title and consists of the object gameboi, calling the gameactual function in the game actual class

Player class-
Displays deck/specialty cards(kings,queens,jack, aces)
Card is randomized,
Displays first two cards

Conditions:
if first two cards are an ace or 10/king/queen/jack, player wins by automatic blackjack
if user hits, some random value/card will be added to the total amount
if user has an ace, they will have the option to make the card a 1 or 11

if any special card is acquired, it will be announced
if the total > 21 after the user hits or stand, the user has busted
if the total == 21 after the user hits or stand, the user has aquired blackjack

Computer Class:

first two computer cards are randomized
first card is shown, second card is shown after user stands/hits blackjack/or busts


conditions:
if computers first two cards == 21, automatic blackjack for the computer

if computers total >= 17, computer stands. If computer's total < 17, computer keeps on adding cards until >= 17.


Game outcomes:
if both the computer and player bust, they both lose
if both the computer and player have the same total, they tie
if computer total >  player total and the computer <= 21 or the player total is greater than 21, computer wins
if players total > computer total and the player total <= 21 or the computer total is greater than 21, player wins


gameactual class:
game is continued as long as the user does not input exit. Try/catch exception if user inputs invalid answer.
