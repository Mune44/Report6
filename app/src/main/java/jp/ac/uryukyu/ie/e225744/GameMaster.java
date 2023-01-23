package jp.ac.uryukyu.ie.e225744;
import java.util.ArrayList;
import java.util.Random;

public class GameMaster {
    Random random = new Random();
    ArrayList<Card> deck =  new ArrayList<>();

    private Player user;
    private Player dealer;
    /*
     * トランプの山札を作る
     * jockerは含めない
     */
    public GameMaster() {
        String[] suits = {"♠︎","❤︎","♣️","♦︎"};
        for(String suit: suits) {
            for(int i=1; i<14; i++) {
                deck.add(new Card(i, suit));
            }
        }

        user = new User();
        dealer = new Dealer();
    }

    public ArrayList<Card> getDeck() {
        return deck;
    } 

    public void start(){
        /*
         * ゲームの開始
         */
        System.out.println("ブラックジャックを開始します");
        
        System.out.println("プレイヤーのターンです");
        user.act(deck);

        System.out.println("ディーラーのターンです");
        dealer.act(deck);

        /*
         * 勝敗の判定
         */
        if(user.isBrackJack() == true){
            System.out.println("ブラックジャック");
            System.out.println("プレイヤーの勝ちです");

        }else if(user.isBust() == true){
            System.out.println("Bustしました");
            System.out.println("ディーラーの勝ちです");

        }else if(dealer.isBrackJack() == true){
            System.out.println("ブラックジャック");
            System.out.println("ディーラーの勝ちです");

        }else if(dealer.isBust() == true){
            System.out.println("Bustしました");
            System.out.println("プレイヤーの勝ちです");

        }else if(user.getScore() - dealer.getScore() > 0 ){
            System.out.println("プレイヤーの勝ちです");

        }else  if(user.getScore() - dealer.getScore() < 0 ){
            System.out.println("ディーラーの勝ちです");

        }else{
            System.out.println("引き分け");
        }
    }   
}