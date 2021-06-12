package Cos1co_Shopping;
import Cos1co_Shopping.*;

public class Clothing extends Items {
  private String color;
  private String size;

  public Clothing(double price, String brand, String name, boolean warranty, String theColor, String theSize, int amount){
    super(price, brand, name, warranty, amount);
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
    System.out.println("");
    return "";
  }
}