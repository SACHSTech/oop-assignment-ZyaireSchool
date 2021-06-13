package Cos1co_Shopping;
import Cos1co_Shopping.*;
import java.io.*;
import java.util.ArrayList;

public class ShoppingCart{
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

  public void addClothing(Clothing newClo){
    clothings.add(newClo);
  }

  public int getAmtCom(){
    return computers.size();
  }

  public int getAmtClo(){
    return clothings.size();
  }

  public int getAmtCok(){
    return cookers.size();
  }

  public double getClothingfPrice(){
    double fPrice = 0.00;
    for(int i = 0; i < getAmtClo(); i++){
      fPrice = fPrice + clothings.get(i).getPrice();
    }
    return fPrice;
  }
  public double getComputerfPrice(){
    double fPrice = 0.00;
    for(int i = 0; i < getAmtCom(); i++){
      fPrice = fPrice + computers.get(i).getPrice();
    }
    return fPrice;
  }
  public double getCookerfPrice(){
    double fPrice = 0.00;
    for(int i = 0; i < getAmtCok(); i++){
      fPrice = fPrice + cookers.get(i).getPrice();
    }
    return fPrice;
  }
}