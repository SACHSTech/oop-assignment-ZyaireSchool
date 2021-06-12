package Cos1co_Shopping;
import Cos1co_Shopping.*;

public class Computer extends Items {
  private String type;
  private String OS;

  public Computer(double price, String brand, String name, boolean warranty, String theOS, String theType, int amount){
    super(price, brand, name, warranty, amount);
    OS = theOS;
    type = theType;
  } 
  public String OS(){
    return os;
  }
  public String type(){
    return type;
  }

  public String toString(){
    System.out.println("");
    return "";
  }
}