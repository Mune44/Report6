package jp.ac.uryukyu.e225744;

import java.util.Set;

public class Card {
    private final Suit suit;
    private final int rank;
    public Card(Suit suit, int rank){
        this.suit = suit;
        this.rank = rank;
    }
    public Suit getSuit() {
        return suit;
    }
    public int getRank() {
        return rank;
    }
    private String toDisplayValue(){
        switch (this.rank){
            case 1:
                return "A";
            case 11:
                return "J";
            case 12:
                return "Q";
            case 13:
                return "K";
            default:
                return String.valueOf(this.rank);
        }
    }
    public int getPoint(){
        return this.rank > 10 ? 10 : this.rank;
    }
    @Override
    public String toString(){
        return this.suit.getMark() + "の" + this.toDisplayValue();
    }
}
