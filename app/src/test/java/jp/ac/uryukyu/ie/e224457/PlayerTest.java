package jp.ac.uryukyu.ie.e224457;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import jp.ac.uryukyu.ie.e225744.*;

class PlayerTest {
    @Test
    void getScoreTest() {
        Player testPlayer = new User();
        ArrayList<Card> cards = new ArrayList<>();
        cards.add(new Card(1,"❤︎"));
        cards.add(new Card(9,"♠️"));
        testPlayer.setCards(cards);
        int actual_score= testPlayer.getScore();
        int expect_score = 20;

        assertEquals(expect_score, actual_score);
    }    
}
