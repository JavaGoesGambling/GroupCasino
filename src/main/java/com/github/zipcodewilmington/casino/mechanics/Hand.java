package com.github.zipcodewilmington.casino.mechanics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Hand {
    // List to store cards in the hand
    private List<Card> cards;

    // Default constructor
    public Hand() {
        this.cards = new ArrayList<>();
    }

    // Constructor that accepts multiple cards
    public Hand(Card... cards) {
        this.cards = new ArrayList<>(Arrays.asList(cards));
    }

    // Check if the hand contains a specific rank
    public boolean containsRank(Card.Rank val) {
        for (Card card : cards) {
            if (card.getRank() == val) { // Use == for comparison
                return true;
            }
        }
        return false;
    }

    // Add a card to the hand
    public boolean addCard(Card card) {
        if (card != null) {
            return cards.add(card);
        }
        return false;
    }

    // Remove a specific card from the hand
    public boolean removeCard(Card card) {
        if (card != null) {
            return cards.remove(card);
        }
        return false;
    }

    // Get the list of cards in the hand (for display or other purposes)
    public List<Card> getCards() {
        return cards;
    }

    // Return the number of cards in the hand
    public int size() {
        return cards.size();
    }

    // Optionally, a method to check if the hand is empty
    public boolean isEmpty() {
        return cards.isEmpty();
    }
}
