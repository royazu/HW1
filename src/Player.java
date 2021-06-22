import java.util.ArrayList;

public class Player {
    private String name;
    Deck mainDeck, bank;

    public Player(String name)
    {
        this.name = name;
        mainDeck = new Deck(false);
        bank = new Deck(false);
    }
    public String getName(){return name;}
    public void setName(String name){this.name = name;}


    void addCardtoMain(Card card)
    {
        mainDeck.addCard(card);
    }

    void addCardstoMain(ArrayList<Card> cards)
    {
        while(!(cards.isEmpty()))
            mainDeck.addCard(cards.remove(0));
    }

    void addCardtoBank(ArrayList<Card> pile)
    {
        while(!(pile.isEmpty())) {
            bank.addCard(pile.remove(0));
        }
    }
    public Card drawCard() {

    }


}
