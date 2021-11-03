package com.jitterted.ebp.blackjack;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class HandTest {
    private static final Suit DUMMY_SUIT = Suit.DIAMONDS;

    @Test
    public void handWithValueOf21IsNotBusted() throws Exception {
        Hand hand = new Hand(List.of(new Card(DUMMY_SUIT, "10"),
                                     new Card(DUMMY_SUIT, "8"),
                                     new Card(DUMMY_SUIT, "3")));

        assertThat(hand.isBusted())
                .isFalse();
    }

    @Test
    public void handWithValueOf22IsBusted() throws Exception {
        Hand hand = new Hand(List.of(new Card(DUMMY_SUIT, "10"),
                                     new Card(DUMMY_SUIT, "8"),
                                     new Card(DUMMY_SUIT, "4")));

        assertThat(hand.isBusted())
                .isTrue();
    }
}
