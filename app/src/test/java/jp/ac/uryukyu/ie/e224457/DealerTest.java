package jp.ac.uryukyu.ie.e224457;

import org.checkerframework.checker.units.qual.A;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import jp.ac.uryukyu.ie.e225744.*;

class DealerTest {
    @Test
    void actTest() {
        Player testDealer = new Dealer();
        ArrayList<Card> deck = new ArrayList<>();
        deck.add(new Card(1,"❤︎"));
        deck.add(new Card(10,"♠️"));
        testDealer.act(deck);
        boolean actual = testDealer.isBrackJack();
        boolean expect = true;

        assertEquals(expect, actual);
    }    
}
