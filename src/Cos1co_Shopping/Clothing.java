package Cos1co_Shopping;
import Cos1co_Shopping.*;

public class Clothing extends Items {
  // instance vars
  private String color;
  private String size;

  /**
  * Constructor - creates a new Clothing instance
  * @param name - the item name
  * @param brand - the item brand
  * @param price - the item price
  * @param warranty - the item warranty
  * @param amount - the item amount
  * @param theColor - tthe item color
  * @param theSize - the item size
  */
  public Clothing(String name, String brand, double price, boolean warranty, int amount, String theColor, String theSize){
    // Triggers a parent constructor in Items class
    super(name, brand, price, warranty, amount);
    this.color = theColor;
    this.size = theSize;
  } 

  /**
  * Get the color that the costomer chose
  * @return the color
  */
  public String color(){
    return this.color;
  }

  /**
  * Get the size that the costomer chose
  * @return the size
  */
  public String size(){
    return this.size;
  }

  /**
  * String to get all of the details and show the costomers
  * @return all the details of the item
  */
  public String toString(){
    return "Successfully added" + " " + getName() + ", Amount: " + getAmount() + ", Color: " + this.color +  ", Brand: " + getBrand() + ", size: " + this.size + ", price: $" + getPrice() + ", warranty: " + getWarranty();
  }
}