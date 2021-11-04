package com.jitterted.ebp.blackjack;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class WalletTest {
    // Given, When, Then
    // Arrange, Act, Assert
    // Setup, Execute, Verify

    @Test
    public void newWalletIsEmpty() throws Exception {
        // Given a wallet, When it's new
        Wallet wallet = new Wallet();

        // Then we expect it to be Empty
        assertThat(wallet.isEmpty())
                .isTrue();
    }

    @Test
    public void newWalletAddMoneyThenIsNotEmpty() throws Exception {
        Wallet wallet = new Wallet();

        wallet.addMoney(1);

        assertThat(wallet.isEmpty())
                .isFalse();
    }
    
    @Test
    public void newWalletThenBalanceIsZero() throws Exception {
        Wallet wallet = new Wallet();

        assertThat(wallet.balance())
                .isZero();
    }
    
}
