package jp.ac.uryukyu.ie.e225744;
import java.util.ArrayList;

public class Dealer extends Player{
    @Override
    public void act(ArrayList<Card> deck) {
        draw(deck);
        draw(deck);
        if (getScore() == 21){
            isBrackJack = true;
            return;
        }
        while(getScore() < 17){
            draw(deck);
        }
    }
}
