package jp.ac.uryukyu.e225744;

public class Suit {
    public Suit(Mark mark){
        this.mark = mark;
    }
    private Mark mark;
    public Mark getMark() {
        return mark;
    }
    public void setMark(Mark mark) {
        this.mark = mark;
    }

    public enum Mark {
        SPADE("♠️"),HEART("❤︎"),DIAMOND("♦︎"),CLUB("♣️");
        private final String mark2;
        Mark(String mark2){
            this.mark2 = mark2;
        }
        public String getMark2() {
            return mark2;
        }
    }
}
