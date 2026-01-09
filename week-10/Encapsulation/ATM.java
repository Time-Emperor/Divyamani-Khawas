package Encapsulation;
public class ATM
{
  private int pin = 1234;
  private int balance = 1000;
  // setter method for pin
  public void setPin(int pin){
      this.pin = pin;
  }
  //getter method for pin
  public int getPin(){
      return this.pin;
  }
  // setter method for balance
  public void setBalance(int balance){
      this.balance = balance;
  }
  // getter method for balance
  public int getBalance(){
      return this.balance;
  }
  public void deposit(int money){
      if(money > 0){
          this.balance= this.balance + money;
      }else{
           System.out.println("Invalid input..");   
      }
  }
  public void withdraw(int pin, int money){
      if(pin == this.pin){
          System.out.println("Set the Withdraw Amount :");{
              if(money > 0){
                  System.out.println("Checking the balance");{
                      if(money <= this.balance){
                          System.out.println("Withdrawn Sucessfull!");{
                              this.balance = this.balance - money;
                          }
                      }else{
                          System.out.println("Invalid Amount!");
                      }
                  }
              }else{
                  System.out.println("Invalid Input!");
              }
          }
      }else{
          System.out.println("Invalid Pin! Please Try Again!");
      }
  }
}