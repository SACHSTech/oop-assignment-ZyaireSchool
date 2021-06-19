package Cos1co_Shopping;
import Cos1co_Shopping.*;
import java.io.*;
import java.util.ArrayList;

public class ShoppingCart{
  // Instance variables
  // Creating array list for the future items
  private ArrayList<Computer> computers;
  private ArrayList<Cooker> cookers;
  private ArrayList<Clothing> clothings;

  public ShoppingCart(){
    computers = new ArrayList<Computer>();
    cookers = new ArrayList<Cooker>();
    clothings = new ArrayList<Clothing>();
  }

  public void addComputer(Computer newCom){
    computers.add(newCom);
  }

  public void addCooker(Cooker newCok){
    cookers.add(newCok);
  }
  
  //
  public void addClothing(Clothing newClo){
    clothings.add(newClo);
  }

  /**
  * Getter method for computers amount
  * @return the amount of the computers
  */
  public int getAmtCom(){
    return computers.size();
  }

  /**
  * Getter method for clothings amount
  * @return the amount of the clothings
  */
  public int getAmtClo(){
    return clothings.size();
  }

  /**
  * Getter method for cookers amount
  * @return the amount of the cookers
  */
  public int getAmtCok(){
    return cookers.size();
  }

  public double getClothingfPrice(){
    double fPrice = 0.00;
    for(int i = 0; i < getAmtClo(); i++){
      fPrice = fPrice + clothings.get(i).getPrice() * clothings.get(i).getAmount();
    }
    return fPrice;
  }
  public double getComputerfPrice(){
    double fPrice = 0.00;
    for(int i = 0; i < getAmtCom(); i++){
      fPrice = fPrice + computers.get(i).getPrice() * computers.get(i).getAmount();
    }
    return fPrice;
  }
  public double getCookerfPrice(){
    double fPrice = 0.00;
    for(int i = 0; i < getAmtCok(); i++){
      fPrice = fPrice + cookers.get(i).getPrice() * cookers.get(i).getAmount();
    }
    return fPrice;
  }
}