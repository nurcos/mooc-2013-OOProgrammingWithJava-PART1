
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }
    
    public Money plus(Money added){
        int newEuros = this.euros + added.euros;
        int newCents = this.cents + added.cents;
        
        Money newMoney = new Money(newEuros, newCents);
        
        return newMoney;
    }
    
    public Money minus(Money decremented){
        int newEuros = this.euros - decremented.euros;
        int newCents = this.cents - decremented.cents;
        
        int helper = newCents;
        
        if (newCents != 0){
            newEuros -= 1;
            newCents = newCents - newCents + 100 + helper;
        }
        
        if (newEuros < 0 || newCents < 0){
            newEuros = 0;
            newCents = 0;
        }
        
        Money newMoney = new Money(newEuros, newCents);
        
        return newMoney;        
    }
    
    public boolean less(Money compared){
        int objectTotal = (this.euros * 100) + this.cents;
        int comparedTotal = (compared.euros * 100) + compared.cents;
        
        if (objectTotal < comparedTotal){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

}
