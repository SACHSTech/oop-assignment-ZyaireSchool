package Cos1co_Shopping;
import Cos1co_Shopping.*;

public class Computer extends Items {
  private String type;
  private String OS;

  public Computer(String name, String brand, double price, boolean warranty, int amount, String theType, String theOS){
    super(name, brand, price, warranty, amount);
    OS = theOS;
    type = theType;
  } 
  public String OS(){
    return OS;
  }
  public String type(){
    return type;
  }

  public String toString(){
    return "";
  }
}