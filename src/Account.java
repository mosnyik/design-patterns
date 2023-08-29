public class Account {
    // there are access modifiers namely PUBLIC and PRIVATE keywords
    private float balance;

    public void deposit(float amount ){
        if(amount > 0)
        balance += amount;
    }
    public void withdraw(float amount ){
        if(amount > 0)
            this.balance -= amount;
    }
    public float getBalance(){
        return balance;
    }
}
