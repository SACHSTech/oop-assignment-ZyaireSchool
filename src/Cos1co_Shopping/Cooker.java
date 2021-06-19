package Cos1co_Shopping;
import Cos1co_Shopping.*;

public class Cooker extends Items {
  // instance vars
  private String texture;
  private String category;

  /**
  * Constructor - creates a new Cooker instance
  * @param name - the item name
  * @param brand - the item brand
  * @param price - the item price
  * @param warranty - the item warranty
  * @param amount - the item amount
  * @param theTexture - tthe item texture
  * @param theCategory - the item category
  */
  public Cooker(String name, String brand, double price, boolean warranty, int amount, String theTexture, String theCategory){
    // Triggers a parent constructor in Items class
    super(name, brand, price, warranty, amount);
    this.texture = theTexture;
    this.category = theCategory;
  }

  /**
  * Get the texture that the costomer chose
  * @return the texture
  */ 
  public String texture(){
    return this.texture;
  }

  /**
  * Get the category that the costomer chose
  * @return the category
  */
  public String category(){
    return this.category;
  }

  /**
  * String to get all of the details and show the costomers
  * @return all the details of the item
  */
  public String toString(){
    return "Successfully added" + " " + getName() + ", category: " + this.category +  ", Amount: " + getAmount() + ", Brand: " + getBrand() + ", Texture: " + this.texture + ", price: $" + getPrice() + ", warranty: " + getWarranty();
  }
}