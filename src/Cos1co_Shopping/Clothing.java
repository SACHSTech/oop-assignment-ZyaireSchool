package Cos1co_Shopping;
import Cos1co_Shopping.*;

public class Clothing extends Items {
  private String color;
  private String size;

  public Clothing(String name, String brand, double price, boolean warranty, int amount, String theColor, String theSize){
    super(name, brand, price, warranty, amount);
    color = theColor;
    size = theSize;
  } 
  public String color(){
    return color;
  }
  public String size(){
    return size;
  }

  public String toString(){
    return "";
  }
}