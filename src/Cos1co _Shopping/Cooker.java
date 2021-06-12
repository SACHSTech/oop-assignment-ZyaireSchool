package Cos1co_Shopping;
import Cos1co_Shopping.*;

public class Cooker extends Items {
  private String texture;
  private String category;

  public Cooker(double price, String brand, String name, boolean warranty, String theTexture, String theCategory, int amount){
    super(price, brand, name, warranty, amount);
    texture = theTexture;
    category = theCategory;
  } 
  public String texture(){
    return texture;
  }
  public String category(){
    return category;
  }

  public String toString(){
    System.out.println("You added a " + texture() +  );
    return "";
  }
}