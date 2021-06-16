package Cos1co_Shopping;
import Cos1co_Shopping.*;
import java.io.*;
import java.util.ArrayList;
import java.text.NumberFormat;

public class Main{
  public static void main(String[] args) throws IOException{
    int userInput = 0;
    String clothName = "";
    String clothColor = "";
    int clothAmount = 0;
    String clothSize = "";
    double clothPrice = 25.99;
    String clothBrand = "";
    ShoppingCart cart = new ShoppingCart();

    System.out.println("Welcome to Cos1co Shopping System! We provide Clothings, Computers and Cookers. Enjoy your purchase!");
    BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
    NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();

    while(true){
      System.out.println("What would you like to buy?");
      System.out.println("Press 1 to get nice clothings.");
      System.out.println("Press 2 to get cool computers.");
      System.out.println("Press 3 to get some cookers.");
      userInput = Integer.parseInt(keyboard.readLine());

      if(userInput == 1){
        while(true){
          System.out.println("Which kind of clothing do you want?");
          clothName = keyboard.readLine();
          System.out.println("What color do you want?");
          clothColor = keyboard.readLine();
          System.out.println("How many do you want?");
          clothAmount = Integer.parseInt(keyboard.readLine());
          System.out.println("What size do you wear?");
          clothSize = keyboard.readLine();
          System.out.println("Which brand would you like?");
          clothBrand = keyboard.readLine();
          Clothing newClothing = new Clothing(clothName, clothBrand, clothPrice, true, clothAmount, clothColor, clothSize);
          System.out.println(newClothing);
          cart.addClothing(newClothing);
          System.out.println("Each one costs $25.99, your final price (exclude tax) is: $" + cart.getClothingfPrice());
          break;
        }
      }else if(userInput == 2){
        System.out.println("you pressed 2");
      }else if(userInput == 3){
        System.out.println("you pressed 3");
      }else{
        System.out.println("invalid");
      }
    }
  }
}