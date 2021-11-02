package com.jitterted.ebp.blackjack;

import java.util.List;

public enum Suit {
    SPADES("♠"),
    DIAMONDS("♦"),
    HEARTS("♥"),
    CLUBS("♣");

    static final List<String> SUITS = List.of(SPADES.symbol(),
                                              DIAMONDS.symbol(),
                                              HEARTS.symbol(),
                                              CLUBS.symbol());
    private final String symbol;

    Suit(String symbol) {
        this.symbol = symbol;
    }

    // SCAFFOLDING - temporary, eventually goes away
    public static Suit from(String symbol) {
        for (Suit suit : values()) {
            if (suit.symbol().equals(symbol)) {
                return suit;
            }
        }
        return null;
    }

    public String symbol() {
        return symbol;
    }
}
