package jp.ac.uryukyu.ie.e225744;
import java.beans.BeanProperty;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class User extends Player {
    Scanner sc = new Scanner(System.in);

    @Override
    public void act(ArrayList<Card> deck) {
        draw(deck);
        draw(deck);
        if (getScore() == 21){
            isBrackJack = true;
        }

        while(true){
            System.out.println("もう一度退きますか？(yes/no)");
            String imput = sc.nextLine();

            if(imput.equals("yes")){
                draw(deck);
                if(getScore() > 21){
                    isBust = true;
                    break;
                }
            }else{
                break;
            }   
        } 
    }
}
