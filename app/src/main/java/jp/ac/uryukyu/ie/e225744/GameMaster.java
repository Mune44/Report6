package jp.ac.uryukyu.ie.e225744;
import java.util.ArrayList;
import java.util.Random;

public class GameMaster {
    Random random = new Random();
    ArrayList<Card> deck =  new ArrayList<>();

    public GameMaster() {
        String[] suits = {"♠︎","❤︎","♣️","♦︎"};
        for(String suit: suits) {
            for(int i=1; i<14; i++) {
                deck.add(new Card(i, suit));
            }
        }
    }

    public ArrayList<Card> getDeck() {
        return deck;
    }

    public static void main(String[] args) {
        GameMaster gm = new GameMaster();
        int count = 0;
        for(Card c: gm.getDeck()){
            System.out.println(c.getCard());
            count += 1;
        }

        System.out.println(count);

    }
}