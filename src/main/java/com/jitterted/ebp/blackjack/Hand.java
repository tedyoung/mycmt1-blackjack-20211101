package com.jitterted.ebp.blackjack;

import java.util.ArrayList;
import java.util.List;

public class Hand {
    private final List<Card> cards = new ArrayList<>();

    // temporary: remove this when done with refactor
    @Deprecated
    public List<Card> getCards() {
        return cards;
    }

    int value() {
        List<Card> hand1 = getCards();
        int handValue = hand1
                .stream()
                .mapToInt(Card::rankValue)
                .sum();
        // does the hand contain at least 1 Ace?
        boolean hasAce = hand1
                .stream()
                .anyMatch(card -> card.rankValue() == 1);

        // if the total hand value <= 11, then count the Ace as 11 by adding 10
        if (hasAce && handValue < 11) {
            handValue += 10;
        }
        return handValue;
    }
}
