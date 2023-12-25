package jjh.domain;

public class CardVO {
	private String rank;
    private String suit;

    public CardVO(String rank, String suit) {
        this.rank = rank; // 모양
        this.suit = suit; // 점수
    }

    public String getRank() {
        return rank;
    }

    public String getSuit() {
        return suit;
    }

    public boolean isFaceCard() { // J, Q, K인지 아닌지 여부를 리턴해주는 함수.
        return rank.equals("J") || rank.equals("Q") || rank.equals("K");
    }

    @Override
    public String toString() {
        return suit + " " + rank;
    }
}
