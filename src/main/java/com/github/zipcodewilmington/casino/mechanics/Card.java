package com.github.zipcodewilmington.casino.mechanics;

public class Card implements Comparable<Card> {

    public enum Rank {
        TWO(2),
        THREE(3),
        FOUR(4),
        FIVE(5),
        SIX(6),
        SEVEN(7),
        EIGHT(8),
        NINE(9),
        TEN(10),
        JACK(11),
        QUEEN(12),
        KING(13),
        ACE(14);

        private final int rank;

        Rank(int rank) {
            this.rank = rank;
        }

        public int getRank() {
            return rank;
        }
    }

    public enum Suit {
        HEARTS,
        SPADES,
        CLUBS,
        DIAMONDS;
    }

    private Suit suit;
    private Rank rank;

    // Constructor
    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    // Getter methods
    public Suit getSuit() {
        return suit;
    }

    public Rank getRank() {
        return rank;
    }

    // Setter methods
    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    @Override
    public int compareTo(Card other) {
        return (this.rank.ordinal() - other.rank.ordinal()) + ((this.suit.ordinal() - other.suit.ordinal()) * 13);
    }


    @Override
    public String toString() {
        return "Card{" +
                "suit=" + suit +
                ", rank=" + rank +
                '}';
    }
}
