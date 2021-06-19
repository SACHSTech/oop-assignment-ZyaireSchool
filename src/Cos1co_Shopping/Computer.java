package Cos1co_Shopping;
import Cos1co_Shopping.*;

public class Computer extends Items {
  // instance vars
  private String type;
  private String OS;

  /**
  * Constructor - creates a new Computer instance
  * @param name - the item name
  * @param brand - the item brand
  * @param price - the item price
  * @param warranty - the item warranty
  * @param amount - the item amount
  * @param theType - tthe item type
  * @param theOS - the item OS
  */
  public Computer(String name, String brand, double price, boolean warranty, int amount, String theType, String theOS){
    // Triggers a parent constructor in Items class
    super(name, brand, price, warranty, amount);
    this.OS = theOS;
    this.type = theType;
  } 

  /**
  * Get the OS that the costomer chose
  * @return the OS
  */
  public String OS(){
    return this.OS;
  }

  /**
  * Get the type that the costomer chose
  * @return the type
  */
  public String type(){
    return this.type;
  }

  /**
  * String to get all of the details and show the costomers
  * @return all the details of the item
  */
  public String toString(){
    return "Successfully added" + " " + this.type + ", Amount: " + getAmount() + ", Name: " + getName() +  ", Brand: " + getBrand() + ", Operating System: " + this.OS + ", price: $" + getPrice() + ", warranty: " + getWarranty();
  }
}