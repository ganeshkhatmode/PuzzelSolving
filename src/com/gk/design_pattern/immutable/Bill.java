package com.gk.design_pattern.immutable;

import java.time.LocalDate;

public final class Bill {
   private final int amount;
   private final LocalDate localDate;

    public Bill(int amount, LocalDate localDate) {
        this.amount = amount;
        this.localDate = localDate;
    }

    public int getAmount() {
        return amount;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "amount=" + amount +
                ", localDate=" + localDate +
                '}';
    }

    public Bill addAmount(int amount ) {
        if(this.amount == amount)
            return this;
        else
            return new Bill(amount, this.localDate);
    }
}
