package Cos1co_Shopping;
import Cos1co_Shopping.*;

public class Items{
  private String name;
  private String brand;
  private double price;
  private boolean warranty;
  private int amount;

  public Items(String theName, String theBrand, double thePrice, boolean theWarranty, int theAmount){
    this.name = theName;
    this.brand = theBrand;
    this.price = thePrice;
    this.warranty = theWarranty;
    this.amount = theAmount;
  }

  public String getName(){
    return this.name;
  }
  public String getBrand(){
    return this.brand;
  }
  public double getPrice(){
    return this.price;
  }
  public boolean getWarranty(){
    return this.warranty;
  }
  public int getAmount(){
    return this.amount;
  }
}