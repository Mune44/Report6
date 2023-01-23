package jp.ac.uryukyu.ie.e225744;
import java.beans.BeanProperty;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * プレイヤーの行動
 */
public class User extends Player {
    Scanner sc = new Scanner(System.in);

    @Override
    public void act(ArrayList<Card> deck) {
        draw(deck);
        draw(deck);
        showCards();
        System.out.println("スコア:" + getScore());
        /*
         * ブラックジャックかどうかの判断
         */
        if (getScore() == 21){
            setBrackJack(true);
            return;
        }

        while(true){
            System.out.println("もう一度引きますか？(y/n)");
            String imput = sc.nextLine();

            /*
             * もう一度引くかどうかの入力後の処理
             */
            if(imput.equals("y")){
                draw(deck);
                showCards();
                System.out.println("スコア:" + getScore());
                if(getScore() > 21){
                    setBust(true);
                    break;
                }
            }else{
                break;
            }   
        } 
    }
}
