public enum Shape {
    Spades,
    Hearts,
    Diamond,
    Clubs;

    @Override
    public String toString() {
        switch(this) {
            case Spades:
                return "♠";
            case Hearts:
                return "♥";
            case Diamond:
                return "♦";
            case Clubs:
                return "♣";
            default:
                return "error";
        }

}
}

