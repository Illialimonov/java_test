package useless_classes;
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {
        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    public String toString() {
        String zero = "";
        if (cents <= 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

    public Money add(Money addedMoney) {
        int newEuros = this.euros + addedMoney.euros;
        int newCents = this.cents + addedMoney.cents;

        if (newCents>=100) {
            newCents -= 100;
            newEuros++;
        }
        
        return new Money(newEuros, newCents);
    }

    public boolean lessThan(Money compared_Money) {
        return this.euros*100 + this.cents < compared_Money.euros*100 + compared_Money.cents;
    }
}