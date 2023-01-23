package jp.ac.uryukyu.ie.e225744;
import java.util.ArrayList;

public class Dealer extends Player{
    /*
     * ディーラーの行動
     */
    @Override
    public void act(ArrayList<Card> deck) {
        draw(deck);
        draw(deck);
        showCards();
        if (getScore() == 21){
            setBrackJack(true);
            return;
        }
        /*
         * スコアが17以上になるまで退き続ける
         */
        while(getScore() < 17){
            draw(deck);
            showCards();
            if(getScore()>21){
                setBust(true);
            }
        }
    }
}
