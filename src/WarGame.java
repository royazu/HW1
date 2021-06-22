import java.util.ArrayList;

public class WarGame {
    public String player1, player2;

    public WarGame(String player1,String player2){
        this.player1 = player1;
        this.player2 = player2;
    }

    public String getPlayer1() {
        return player1;
    }

    public String getPlayer2() {
        return player2;
    }
    boolean warflag = false;
    Player playerfirst;
    Player playersecond;
    Card topCard1, topCard2;
    ArrayList<Card> Pile = new ArrayList<Card>();
    public void initializeGame() {
        System.out.println("Initializing the game...");

        if (player1.compareTo(player2) < 0) {
            playerfirst = new Player(player1);
            playersecond = new Player(player2);
        } else {
            playerfirst = new Player(player2);
            playersecond = new Player(player1);
        }
        Deck mainDeck = new Deck(true);
        while (!(mainDeck.isEmpty())) {
            topCard1 = mainDeck.removeTopCard();
            topCard2 = mainDeck.removeTopCard();
            playerfirst.addCardtoMain(topCard1);// draw card p1
            playersecond.addCardtoMain(topCard2);//draw card p2
        }
    }
        public String start()
        {
            topCard1 = playerfirst.drawCard();//draw a card from the deck and put it on the main stock
            topCard2 = playersecond.drawCard();
            if (topCard1.compare(topCard2) == 1) {//player 1 wins the round
                playerfirst.addCardtoBank(Pile);
            } else if (topCard1.compare(topCard2) == -1) {//player 2 wins the round
                playersecond.addCardtoBank(Pile);
            } else {
                while (!warflag) {
                    for (int i = 0; i < 2; i++) {
                        Pile.add(playerfirst.mainDeck.removeTopCard());
                        Pile.add(playersecond.mainDeck.removeTopCard());
                    }

                }
            }

        }
    }

}
