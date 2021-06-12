package Cos1co_Shopping;
import Cos1co_Shopping.*;

public class Items{
  private String name;
  private String brand;
  private double price;
  private boolean warranty;
  private int amount;

  public Items(String theName, String theBrand, double thePrice, boolean theWarranty, int theAmount){
    name = theName;
    brand = theBrand;
    price = thePrice;
    warranty = theWarranty;
    amount = theAmount
  }

  public String getName(){
    return name;
  }
  public String getBrand(){
    return brand;
  }
  public double getPrice(){
    return price;
  }
  public boolean getWarranty(){
    return warranty;
  }
  public int getAmount(){
    return amount;
  }
}