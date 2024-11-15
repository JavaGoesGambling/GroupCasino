package com.github.zipcodewilmington.casino.mechanics;

import java.util.Collections;
import java.util.Stack;

public class Deck {

    private Stack<Card> cards;

    // Constructor
    public Deck() {
        cards = new Stack<>();
        initializeDeck();
        shuffle();
    }

    // Initialize the deck with all 52 cards
    private void initializeDeck() {
        // Add all 52 cards to the deck
        Card.Suit[] suits = Card.Suit.values();
        for (Card.Suit suit : suits) {
            Card.Rank[] ranks = Card.Rank.values();
            for (Card.Rank rank : ranks) {
                cards.push(new Card(suit, rank)); // Correct constructor call
            }
        }
    }

    // Shuffle the deck
    public void shuffle() {
        Collections.shuffle(cards);
    }

    // Deal a card from the deck
    public Card dealCard() {
        if (cards.isEmpty()) {
            return null; // Or throw an exception if you prefer
        }
        return cards.pop(); // Deal the top card
    }

    // Get the number of cards in the deck
    public int size() {
        return cards.size();
    }

    // Optionally, you could have a method to add a card to the deck
    public void addCard(Card card) {
        cards.push(card);
    }

    // Optionally, you could have a method to check if the deck is empty
    public boolean isEmpty() {
        return cards.isEmpty();
    }
}
