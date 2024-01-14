class customer {
  int amount = 10000;

  synchronized void withdraw(int amount) {
    System.out.println("going to withdraw..");
    if (this.amount < amount) {
      System.out.println("less balance, waiting for deposite..");
      try {
        wait();
      } catch (Exception e) {
      }
      this.amount -= amount;
      System.out.println("completed withdraw..");
    }
  }

  synchronized void deposite(int amount) {
    System.out.println("going to deposite");
    this.amount += amount;
    System.out.println(" completed deposite..");
    notify();
  }
}

class innerthread12 {
  public static void main(String args[]) {

    final customer c = new customer();
    new Thread() {
      public void run() {
        c.withdraw(15000);
      }
    }.start();
    new Thread() {
      public void run() {
        c.deposite(15000);
      }
    }.start();

  }
}