package Cos1co_Shopping;
import Cos1co_Shopping.*;
import java.io.*;
import java.util.ArrayList;
import java.text.NumberFormat;

public class Main{
  public static void main(String[] args) throws IOException{
    //record the user input
    int userInput = 0;

    //vars for clothings
    int clothAmount = 0;
    double clothPrice = 25.99;
    String clothName = "";
    String clothColor = "";
    String clothSize = "";
    String clothBrand = "";

    //vars for computers
    String compOS = "";
    String compBrand = "";
    String compType = "";
    String compName = "";
    double compPrice = 799.99;
    int compAmount = 0;

    //vars for cookers
    String cookTexture = "";
    String cookBrand = "";
    String cookCategory = "";
    String cookName = "";
    double cookPrice = 799.99;
    int cookAmount = 0;

    //initial shopping cart
    ShoppingCart cart = new ShoppingCart();

    System.out.println("Welcome to Cos1co Shopping System! We provide Clothings, Computers and Cookers. Enjoy your purchase!");
    BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
    NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();

    while(true){
      System.out.println("What would you like to buy?");
      System.out.println("Press 1 to get nice clothings.");
      System.out.println("Press 2 to get cool computers.");
      System.out.println("Press 3 to get some cookers.");
      System.out.println("Press 4 to see the shopping cart.");
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

          System.out.println("Your final price for clothings (exclude tax) is: $" + cart.getClothingfPrice());
          break;
        }

      }else if(userInput == 2){
        while(true){
          System.out.println("Which OS do you prefer to use?");
          compOS = keyboard.readLine();

          System.out.println("What type of computer do you want?");
          compType = keyboard.readLine();

          System.out.println("How many do you want?");
          compAmount = Integer.parseInt(keyboard.readLine());

          System.out.println("Is there a specific name? If there is no answer, please type 'None'");
          compName = keyboard.readLine();

          System.out.println("Which brand would you like?");
          compBrand = keyboard.readLine();

          Computer newComputer = new Computer(compName, compBrand, compPrice, false, compAmount, compType, compOS);
          System.out.println(newComputer);
          cart.addComputer(newComputer);

          System.out.println("Your final price for computers (exclude tax) is: $" + cart.getComputerfPrice());
          break;
        }
      }else if(userInput == 3){
        while(true){
          System.out.println("Which OS do you prefer to use?");
          compOS = keyboard.readLine();

          System.out.println("What type of computer do you want?");
          compType = keyboard.readLine();

          System.out.println("How many do you want?");
          compAmount = Integer.parseInt(keyboard.readLine());

          System.out.println("Is there a specific name? If there is no answer, please type 'None'");
          compName = keyboard.readLine();

          System.out.println("Which brand would you like?");
          compBrand = keyboard.readLine();

          Computer newComputer = new Computer(compName, compBrand, compPrice, false, compAmount, compType, compOS);
          System.out.println(newComputer);
          cart.addComputer(newComputer);

          System.out.println("Your final price for computers (exclude tax) is: $" + cart.getComputerfPrice());
          break;
        }

      }else if(userInput == 4){
        System.out.println("u pressed 4");
        break;
      }else{
        System.out.println("invalid");
      }
    }
  }
}