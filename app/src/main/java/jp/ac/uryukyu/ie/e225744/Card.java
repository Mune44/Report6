package jp.ac.uryukyu.ie.e225744;

public class Card {
    private int number;
    private String suit;

    public Card(int number, String suit) {
        this.number = number;
        this.suit = suit;
    }

    public int getNumber() {
        return number;
    }
    public String getSuit() {
        return suit;
    }

    public String getCard() {
        String num;
        /*
         * 1,11,12,13をトランプのマークに変換する
         */
        switch (this.number){
            case 1:
                num = "A";
                break;
            case 11:
                num = "J";
                break;
            case 12:
                num = "Q";
                break;
            case 13:
                num = "K";
                break;
            default:
                num = String.valueOf(this.number);
        }
        /*
         * マーク＋数で表記する
         */
        return suit + num;
    }
}