/**
   Clyde "Thluffy" Sinclair
   APCS pd0
   HW18 -- building a more meaningful class
   2021-10-18
   instance variables for storing...
   account holder's full name
   account password
   4-digit PIN
   9-digit account number
   account balance
   and methods for...
   setting each attribute
   printing out all of an account’s info at once
   depositing money
   withdrawing money
**/

public class BankAccount {

  //instance variables
  private String name;
  private String passwd;
  private short pin;
  private int acctNum;
  private double balance;
  //---------------------------------------------


  //mutators
  public String setName( String newName ) {
    String oldName = name;
    name = newName;
    return oldName;
  }

  public String setPasswd( String newPasswd ) {
    String oldPasswd = passwd;
    passwd = newPasswd;
    return oldPasswd;
  }

  public short setPin( short newPin ) {
    short oldPin = pin;
     if (newPin >= 1000 && newPin < 9999) {
        pin = newPin;
     } else (
        pin = 9999;
        System.out.println("ERROR! Pin is invalid!");
        }
    return oldPin;
  }

  public int setAcctNum( int newAcctNum ) {
    int oldAcctNum = acctNum;
    if (newAcctNum >= 100000000 && newAcctNum < 999999999) {
       acctNum = newAcctNum;
    } else {
       acctNum = 999999999;
       System.out.println("ERROR! Account number invalid!");
    }
    return oldAcctNum;
  }

  public double setBalance( double newBalance ) {
    double oldBalance = balance;
    balance = newBalance;
    return oldBalance;
  }
  //---------------------------------------------


  public void deposit( double depositAmount ) {
    balance = balance + depositAmount;
  }

  public boolean withdraw( double withdrawAmount ) {
    if (balance - withdrawAmount >= 0) {
    balance = balance - withdrawAmount;
    } else {
       System.out.println("ERROR! Not enough Money!");
       return false; 
    }
  }
        
  public boolean authenticate(int givenAccNum, String givenPassword) {
     if (acctNum == givenAccNum && passwd == givenPassword) {
        return true
     } else {
        return false
     }
  }


  //overwritten toString()
  public String toString() {
    String retStr = "\nAccount info:\n=======================";
    retStr = retStr + "\nName: " + name;
    retStr = retStr + "\nPassword: " + passwd;
    retStr = retStr + "\nPIN: " + pin;
    retStr = retStr + "\nAccount Number: " + acctNum;
    retStr = retStr + "\nBalance: " + balance;
    retStr = retStr + "\n=======================";
    return retStr;
  }

//main method for testing  
  public static void main( String[] args ) {  
    // INSERT YOUR METHOD CALLS FOR TESTING HERE  
    BankAccount ba = new BankAccount();  
    ba.setName("Geese");  
    ba.setPasswd("qwertyuiop1234mydogiscalledsnowball");  
    short pin = 1234;  
    ba.setPin(pin);  
    ba.setAcctNum(100000012);  
    ba.setBalance(100);  
    System.out.println(ba.toString());  
    System.out.println("\ndeposited 40 dollars:");  
    ba.deposit(40);  
    System.out.println(ba.toString());  
    System.out.println("\nwithdrew 50 dollars:");  
    ba.withdraw(50);  
    System.out.println(ba.toString());  
  }//end main()

}//end class BankAccount


