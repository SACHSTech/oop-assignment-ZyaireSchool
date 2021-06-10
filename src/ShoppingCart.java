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
}