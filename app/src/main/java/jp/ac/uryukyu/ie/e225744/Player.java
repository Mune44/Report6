package jp.ac.uryukyu.ie.e225744;
import java.util.ArrayList;
import java.util.Random;

public abstract class Player {
    private ArrayList<Card> cards = new ArrayList<>();
    private Random random = new Random();
    private static int BORDER_SCORE = 21;
    boolean isBust = false;
    boolean isBrackJack = false;
    
    public void draw(ArrayList<Card> deck) {
        int r = random.nextInt(52);
        cards.add(deck.get(r));
        deck.remove(r);
    }

    public abstract void act(ArrayList<Card> deck);

    public void showCards() {
        for(Card c: cards) {
            System.out.println(c.getCard());
        }
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public int getScore(){
        int score = 0;
        int aceCardCound = 0;
        for(Card c : cards){
            int card_num = c.getNumber();
            if(card_num >= 10){
                card_num = 10;
            }else if(card_num == 1){
                aceCardCound += 1;
            }
            score += card_num;
        }

        for(int i=0;i<aceCardCound;i++) {
            if(i == 0 && score + 11 <= BORDER_SCORE) {
                score += 11;
            }else{
                score += 1;
            }
        }
        return score;
    }
}
