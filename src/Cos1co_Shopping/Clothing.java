package Cos1co_Shopping;
import Cos1co_Shopping.*;

public class Clothing extends Items {
  private String color;
  private String size;

  public Clothing(String name, String brand, double price, boolean warranty, int amount, String theColor, String theSize){
    super(name, brand, price, warranty, amount);
    this.color = theColor;
    this.size = theSize;
  } 
  public String color(){
    return this.color;
  }
  public String size(){
    return this.size;
  }

  public String toString(){
    return "add" + this.color;
  }
}