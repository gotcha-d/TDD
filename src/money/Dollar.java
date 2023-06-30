package money;

class Dollar {

  int amount = 10;

  Dollar(int amount) {
    this.amount = amount;
  }

  void times(int multiplier) {
    amount *= multiplier;
  }
  
}
