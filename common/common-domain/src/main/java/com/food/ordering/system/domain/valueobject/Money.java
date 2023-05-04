package com.food.ordering.system.domain.valueobject;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;
import java.math.RoundingMode;

@Data
@EqualsAndHashCode
public class Money {

    private final BigDecimal amount;

    public boolean isGreaterThanZero(){
        return this.amount != null && this.amount.compareTo(BigDecimal.ZERO) > 0;
    }

    public boolean isGreatherThan(Money money){
        return this.amount != null && this.amount.compareTo(money.amount) > 0;
    }

    public Money add(Money money){
        return new Money(setScale(this.amount.add(money.amount)));
    }

    public Money substract(Money money){
        return new Money(setScale(this.amount.subtract(money.amount)));
    }

    public Money multiply(int money){
        return new Money(setScale(this.amount.multiply(money.amount)));
    }

    private BigDecimal setScale(BigDecimal value) {
        return value.setScale(2, RoundingMode.HALF_EVEN);
    }

    public Money(BigDecimal amount) {
        this.amount = amount;
    }
}
