import java.util.ArrayList;
public class Deck {
    private final int DeckSize = 52;
    private final int SHAPE_SIZE = 13;
    private final int NUM_OF_SHUFFLE = 50;
    ArrayList <Card> deck = new ArrayList<Card>();


    public Deck (boolean DeckBuilder) {
        if(DeckBuilder) {
            int num=0;
            num = Deck_Orginize(num,Shape.Spades);
            num = Deck_Orginize(num,Shape.Diamond);
            num = Deck_Orginize(num,Shape.Clubs);
            num = Deck_Orginize(num,Shape.Hearts);
            }

        }

    public int Deck_Orginize(int num,Shape shape)
    {
        for (int i = 0; i < SHAPE_SIZE; i++) {
            Card card = new Card(i,shape);
            deck.add(num++,card);
        }
        return num;
    }
    public void addCard (Card card)
    {
        deck.add(deck.size(),card);
    }

    public Card removeTopCard(){
       return deck.remove(deck.size());

    }
    public boolean isEmpty(){
        return (deck.isEmpty());
    }
    public void shuffle()
    {
        int CurrentSize = deck.size();
        int firstCard,secondCard;
        Card holderOne,holderTwo;
        for (int i = 0; i < NUM_OF_SHUFFLE ; i++) {
            firstCard = Main.rnd.nextInt(CurrentSize);
            secondCard = Main.rnd.nextInt(CurrentSize);
            holderOne = deck.get(firstCard);
            holderTwo = deck.get(secondCard);
            deck.set(firstCard,holderTwo);
            deck.set(secondCard,holderOne);
        }
    }
    }

