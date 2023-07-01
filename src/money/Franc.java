package money;

class Franc extends Money {

  private int amount = 10;

  Franc(int amount) {
    this.amount = amount;
  }

  Franc times(int multiplier) {
    return new Franc(amount * multiplier);
  }
  
  public boolean equals(Object object) {
    Franc franc = (Franc) object;
    return amount == franc.amount;
  }
}
