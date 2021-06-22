public class Card {
    private final int num;
    private final Shape shape;

    public Card(int num, Shape shape) {
        this.num = num;
        this.shape = shape;
    }

    public int getNum() {
        return num;
    }

    public Shape getShape() {
        return shape;
    }

    @Override
    public String toString() {
        String number = "";
        if(num==1)
            number = "A";
        else if(num<=10)
            number = String.valueOf(num);
        else if(num==11)
            number = "J";

        return number + shape.toString();
    }
    int compare (Card other)
    {
        if(this.num==other.num)
            return 0;
        else if(this.num>other.num)
            return 1;
        else
            return -1;
    }
}
