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
    double clothPrice = 0.00;
    String clothName = "";
    String clothColor = "";
    String clothSize = "";
    String clothBrand = "";

    //vars for computers
    String compOS = "";
    String compBrand = "";
    String compType = "";
    String compName = "";
    double compPrice = 0.00;
    int compAmount = 0;

    //vars for cookers
    String cookTexture = "";
    String cookBrand = "";
    String cookCategory = "";
    String cookName = "";
    double cookPrice = 0.00;
    double cookTempPrice = 0.00;
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
          System.out.println("Press 1 for shorts.");
          System.out.println("Press 2 for dresses.");
          System.out.println("Press 3 for shirts");
          userInput = Integer.parseInt(keyboard.readLine());
          switch(userInput){
            case 1:
              clothName = "Short";
              clothPrice = 19.00;
              break;
            case 2:
              clothName = "Dress";
              clothPrice = 25.00;
              break;
            case 3: 
              clothName = "Shirt";
              clothPrice = 9.99;
              break;
          }
          System.out.println("What color do you want?");
          System.out.println("Press 1 - Pink.");
          System.out.println("Press 2 - Black.");
          System.out.println("Press 3 - White.");
          userInput = Integer.parseInt(keyboard.readLine());
          switch(userInput){
            case 1:
              clothColor = "pink";
              break;
            case 2:
              clothColor = "black";
              break;
            case 3: 
              clothColor = "white";
              break;
          }

          System.out.println("How many do you want?");
          clothAmount = Integer.parseInt(keyboard.readLine());

          System.out.println("What size do you wear?");
          System.out.println("We have XXXL, XXL, XL, L, M, S, XS.");
          clothSize = keyboard.readLine();

          System.out.println("Which brand would you like?");
          clothBrand = keyboard.readLine();

          Clothing newClothing = new Clothing(clothName, clothBrand, clothPrice, true, clothAmount, clothColor, clothSize);
          System.out.println(newClothing);
          cart.addClothing(newClothing);
          System.out.println(" ");

          System.out.println("Your final price for clothings (exclude tax) is: $" + cart.getClothingfPrice());
          System.out.println("-------------------------------------------------------------------------------");
          break;
        }

      }else if(userInput == 2){
        while(true){
          System.out.println("Which OS do you prefer to use?");
          System.out.println("Press 1 - Linux.");
          System.out.println("Press 2 - Windows.");
          System.out.println("Press 3 - Mac.");
          userInput = Integer.parseInt(keyboard.readLine());
          switch(userInput){
            case 1:
              compOS = "Linux";
              break;
            case 2:
              compOS = "Windows";
              break;
            case 3: 
              compOS = "Mac";
              break;
          }

          System.out.println("What type of computer do you want?");
          System.out.println("Press 1 - Tablet.");
          System.out.println("Press 2 - PC");
          userInput = Integer.parseInt(keyboard.readLine());
          switch(userInput){
            case 1:
              compType = "Tablet";
              compPrice = 799.99;
              break;
            case 2:
              compType = "PC";
              compPrice = 2514.00;
              break;
          }
          System.out.println("How many would you like to buy?");
          compAmount = Integer.parseInt(keyboard.readLine());

          System.out.println("Is there a specific name? If there is no answer, please type 'None'");
          compName = keyboard.readLine();

          System.out.println("Which brand would you like?");
          compBrand = keyboard.readLine();

          Computer newComputer = new Computer(compName, compBrand, compPrice, false, compAmount, compType, compOS);
          System.out.println(newComputer);
          cart.addComputer(newComputer);
          System.out.println(" ");

          System.out.println("Your final price for computers (exclude tax) is: $" + cart.getComputerfPrice());
          System.out.println("-------------------------------------------------------------------------------");
          break;
        }
      }else if(userInput == 3){
        while(true){
          System.out.println("What texutre do you prefer?");
          System.out.println("Press 1 - Iron.");
          System.out.println("Press 2 - Wood.");
          System.out.println("Press 3 - Silica.");
          userInput = Integer.parseInt(keyboard.readLine());
          switch(userInput){
            case 1:
              cookTexture = "Iron";
              cookTempPrice = 20.00;
              break;
            case 2:
              cookTexture = "Wood";
              cookTempPrice = 15.00;
              break;
            case 3: 
              cookTexture = "Silica";
              cookTempPrice = 30.00;
              break;
          }
          System.out.println("Which category of cookers do you want to buy?");
          System.out.println("Press 1 - Pot and cooking shovel.");
          System.out.println("Press 2 - Bowl and tabelwares.");
          System.out.println("Press 3 - Cooking machines.");
          userInput = Integer.parseInt(keyboard.readLine());
          switch(userInput){
            case 1:
              cookCategory = "Pot and cooking shovel.";
              cookPrice = 20.00 + cookTempPrice;
              break;
            case 2:
              cookCategory = "Bowl and tabelwares.";
              cookPrice = 30.00 + cookTempPrice;
              break;
            case 3: 
              cookCategory = "Bread machine and roaster.";
              cookPrice = 300.00 + cookTempPrice;
              break;
          }
          System.out.println("Which one would you like to buy? Choose one in the category. Your Choice: " + cookCategory);
          cookName = keyboard.readLine();

          System.out.println("How many do you want?");
          cookAmount = Integer.parseInt(keyboard.readLine());


          System.out.println("Which brand would you like?");
          cookBrand = keyboard.readLine();

          Cooker newCooker = new Cooker(cookName, cookBrand, cookPrice, false, cookAmount, cookTexture, cookCategory);
          System.out.println(newCooker);
          cart.addCooker(newCooker);
          System.out.println(" ");

          System.out.println("Your final price for computers (exclude tax) is: $" + cart.getCookerfPrice());
          System.out.println("-------------------------------------------------------------------------------");
          break;
        }
      }else if(userInput == 4){
        System.out.println("Items");
        System.out.println(cart.);
        break;
      }else{
        System.out.println("invalid");
      }
    }
  }
}