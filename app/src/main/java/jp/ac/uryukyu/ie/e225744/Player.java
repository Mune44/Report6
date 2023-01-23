package jp.ac.uryukyu.ie.e225744;
import java.util.ArrayList;
import java.util.Random;

public abstract class Player {
    private ArrayList<Card> cards = new ArrayList<>();
    private Random random = new Random();
    private static int BORDER_SCORE = 21;
    private boolean isBust = false;
    private boolean isBrackJack = false;
    
    /*
     * デッキの生成
     */
    public void draw(ArrayList<Card> deck) {
        int r = random.nextInt(deck.size());
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

    /*
     * 引いたカードのスコアを表示
     */
    public int getScore(){
        int score = 0;
        int aceCardCount = 0;
        for(Card c : cards){
            int card_num = c.getNumber();
            if(card_num >= 10){
                card_num = 10;
            }else if(card_num == 1){
                aceCardCount += 1;
                card_num = 0;
            }
            score += card_num;
        }

        for(int i=0;i<aceCardCount;i++) {
            if(score + 11 <= BORDER_SCORE) {
                score += 11;
            }else{
                score += 1;
            }
        }
        return score;
    }
    public boolean isBrackJack() {
        return isBrackJack;
    }
    public boolean isBust() {
        return isBust;
    }
    public void setBrackJack(boolean isBrackJack) {
        this.isBrackJack = isBrackJack;
    }
    public void setBust(boolean isBust) {
        this.isBust = isBust;
    }
}
