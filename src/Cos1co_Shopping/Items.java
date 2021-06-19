package Cos1co_Shopping;
import Cos1co_Shopping.*;

public class Items{
  // Instance vars
  private String name;
  private String brand;
  private double price;
  private boolean warranty;
  private int amount;
  
  /**
  * Constructor - creates a new Item instance
  * @param theName - the item name
  * @param theBrand - the item brand
  * @param thePrice - the item price
  * @param theWarranty - the item warranty
  * @param theAmount - the item amount
  */
  public Items(String theName, String theBrand, double thePrice, boolean theWarranty, int theAmount){
    this.name = theName;
    this.brand = theBrand;
    this.price = thePrice;
    this.warranty = theWarranty;
    this.amount = theAmount;
  }

  /**
  * Get the name that the costomer chose
  * @return the name
  */
  public String getName(){
    return this.name;
  }

  /**
  * Get the brand that the costomer chose
  * @return the brand
  */
  public String getBrand(){
    return this.brand;
  }

  /**
  * Get the price that the costomer chose
  * @return the price
  */
  public double getPrice(){
    return this.price;
  }

  /**
  * Get the warranty that the costomer chose
  * @return the warranty
  */
  public boolean getWarranty(){
    return this.warranty;
  }

  /**
  * Get the amount that the costomer chose
  * @return the amount
  */
  public int getAmount(){
    return this.amount;
  }
}