package Cos1co_Shopping;
import Cos1co_Shopping.*;

public class Cooker extends Items {
  private String texture;
  private String category;

  public Cooker(String name, String brand, double price, boolean warranty, int amount, String theTexture, String theCategory){
    super(name, brand, price, warranty, amount);
    this.texture = theTexture;
    this.category = theCategory;
  } 
  public String texture(){
    return this.texture;
  }
  public String category(){
    return this.category;
  }

  public String toString(){
    return "";
  }
}