package com.jitterted.ebp.blackjack;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.fusesource.jansi.Ansi.ansi;

class CardTest {

    private static final Suit DUMMY_SUIT = Suit.HEARTS;

    @Test
    public void withNumberCardHasNumericValueOfTheNumber() throws Exception {
        Card card = createWithRankOf("7");

        assertThat(card.rankValue())
                .isEqualTo(7);
    }

    @Test
    public void withValueOfQueenHasNumericValueOf10() throws Exception {
        Card card = createWithRankOf("Q");

        assertThat(card.rankValue())
                .isEqualTo(10);
    }

    @Test
    public void withAceHasNumericValueOf1() throws Exception {
        Card card = createWithRankOf("A");

        assertThat(card.rankValue())
                .isEqualTo(1);
    }

    @Test
    public void suitOfHeartsOrDiamondsIsDisplayedInRed() throws Exception {
        // given a card with Hearts or Diamonds
        Card heartsCard = createWithSuitOf(Suit.HEARTS);
        Card diamondsCard = createWithSuitOf(Suit.DIAMONDS);

        // when we ask for its display representation
        String ansiRedString = ansi().fgRed().toString();

        // then we expect a red color ansi sequence
        assertThat(heartsCard.display())
                .contains(ansiRedString);
        assertThat(diamondsCard.display())
                .contains(ansiRedString);
    }

    @Test
    public void cardDisplaysSuitAsSymbol() throws Exception {
        Card spadesCard = createWithSuitOf(Suit.SPADES);

        assertThat(spadesCard.display())
                .contains("│    ♠    │");
    }

    private Card createWithRankOf(String rank) {
        return new Card(DUMMY_SUIT, rank);
    }

    private Card createWithSuitOf(Suit suit) {
        return new Card(suit, "9");
    }


}