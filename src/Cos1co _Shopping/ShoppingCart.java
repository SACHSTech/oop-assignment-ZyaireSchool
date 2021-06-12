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

  public void addComputer(Cooker newCok){
    cookers.add(newCok);
  }

  public void addComputer(Clothing newClo){
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

  public getClothingfPrice(){
    int fPrice = 0;
    for(int i = 0; i < getAmtClo; i++){
      fPrice = fPrice + clothings.get(i).getPrice();
    }
    return fPrice;
  }
  public getComputerfPrice(){
    int fPrice = 0;
    for(int i = 0; i < getAmtCom; i++){
      fPrice = fPrice + computers.get(i).getPrice();
    }
    return fPrice;
  }
  public getCookerfPrice(){
    int fPrice = 0;
    for(int i = 0; i < getAmtCok; i++){
      fPrice = fPrice + cookers.get(i).getPrice();
    }
    return fPrice;
  }
}