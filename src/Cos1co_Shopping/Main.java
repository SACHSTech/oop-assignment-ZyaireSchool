package Cos1co_Shopping;
import Cos1co_Shopping.*;
import java.io.*;
import java.util.ArrayList;
import java.text.NumberFormat;

public class Main{
  public static void main(String[] args) throws IOException{
    //record the user input
    int userInput = 0;
    String userString = "";
    int temp = 100;

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

    //making arraylist for the final check out
    ArrayList<String> itemName = new ArrayList<String>();
    ArrayList<Integer> itemAmount = new ArrayList<Integer>();
    ArrayList<Double> itemPrice = new ArrayList<Double>();

    //Final price
    double fPrice = 0.00;
    double tax = 0.00;
    double priceIncludeTax = 0.00;

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
        while(temp > 3){
          System.out.println("Which kind of clothing do you want?");
          System.out.println("Press 1 for shorts.");
          System.out.println("Press 2 for dresses.");
          System.out.println("Press 3 for shirts");
          userInput = Integer.parseInt(keyboard.readLine());
          temp = userInput;
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
            default:
              System.out.println("Try Again!");
          }
        }
        temp = 100;
        while(temp > 3){
          System.out.println("What color do you want?");
          System.out.println("Press 1 - Pink.");
          System.out.println("Press 2 - Black.");
          System.out.println("Press 3 - White.");
          userInput = Integer.parseInt(keyboard.readLine());
          temp = userInput;
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
            default:
              System.out.println("Try Again!");
          }
        }
        System.out.println("How many do you want?");
        clothAmount = Integer.parseInt(keyboard.readLine());

        temp = 100; 
        while(temp > 7){
          System.out.println("What size do you wear?");
          System.out.println("Press 1 - XXXL");
          System.out.println("Press 2 - XXL");
          System.out.println("Press 3 - XL");
          System.out.println("Press 4 - L");
          System.out.println("Press 5 - M");
          System.out.println("Press 6 - S");
          System.out.println("Press 7 - XS");
          userInput = Integer.parseInt(keyboard.readLine());
          temp = userInput;
          switch(userInput){
            case 1:
              clothSize = "XXXL";
              break;
            case 2:
              clothSize = "XXL";
              break;
            case 3: 
              clothSize = "XL";
              break;
            case 4:
              clothSize = "L";
              break;
            case 5:
              clothSize = "M";
              break;
            case 6:
              clothSize = "S";
              break;
            case 7:
              clothSize = "XS";
              break;
            default:
              System.out.println("Try Again!");
          }
        }

        temp = 100; 
        while(temp > 7){
          System.out.println("Which brand would you like?");
          System.out.println("Press 1 - Adidas");
          System.out.println("Press 2 - Nike");
          System.out.println("Press 3 - Calvin Klein");
          System.out.println("Press 4 - Greg Norman");
          System.out.println("Press 5 - Orelia");
          System.out.println("Press 6 - Puma");
          System.out.println("Press 7 - Raid");
          userInput = Integer.parseInt(keyboard.readLine());
          temp = userInput;
          switch(userInput){
            case 1:
              clothSize = "Adidas";
              break;
            case 2:
              clothSize = "Nike";
              break;
            case 3: 
              clothSize = "Calvin Klein";
              break;
            case 4:
              clothSize = "Greg Norman";
              break;
            case 5:
              clothSize = "Orelia";
              break;
            case 6:
              clothSize = "Puma";
              break;
            case 7:
              clothSize = "Raid";
              break;
            default:
              System.out.println("Try Again!");
          }
        }
          Clothing newClothing = new Clothing(clothName, clothBrand, clothPrice, true, clothAmount, clothColor, clothSize);
          System.out.println(newClothing);
          cart.addClothing(newClothing);
          itemName.add(newClothing.getName());
          itemAmount.add(newClothing.getAmount());
          itemPrice.add(newClothing.getPrice());
          System.out.println(" ");

          System.out.println("Your final price for clothings (exclude tax) is: $" + cart.getClothingfPrice());
          System.out.println("-------------------------------------------------------------------------------");
          break;

      }else if(userInput == 2){
        temp = 100;
        while(temp > 3){
          System.out.println("Which OS do you prefer to use?");
          System.out.println("Press 1 - Linux.");
          System.out.println("Press 2 - Windows.");
          System.out.println("Press 3 - Mac.");
          userInput = Integer.parseInt(keyboard.readLine());
          temp = userInput;
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
            default:
              System.out.println("Try Again!");
          }
        }
          temp = 100;
        while(temp > 2){
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
            default:
              System.out.println("Try Again!");
          }
        }
          System.out.println("How many would you like to buy?");
          compAmount = Integer.parseInt(keyboard.readLine());

          System.out.println("Is there a specific name? If there is no answer, please type 'None'");
          compName = keyboard.readLine();
        
        temp = 100;
        while(temp > 6){
          System.out.println("Which brand would you like?");
          System.out.println("Press 1 - ASUS.");
          System.out.println("Press 2 - MSI");
          System.out.println("Press 3 - DEEL");
          System.out.println("Press 4 - Lenovo");
          System.out.println("Press 5 - Acer");
          System.out.println("Press 6 - Microsoft");
          userInput = Integer.parseInt(keyboard.readLine());
          switch(userInput){
            case 1:
              compBrand = "ASUS";
              break;
            case 2:
              compBrand = "MSI";
              break;
            case 3:
              compBrand = "DEEL";
              break;
            case 4:
              compBrand = "Lenovo";
              break;
            case 5:
              compBrand = "Acer";
              break;
            case 6:
              compBrand = "Microsoft";
              break;
            default:
              System.out.println("Try Again!");
          }
        }

          Computer newComputer = new Computer(compName, compBrand, compPrice, false, compAmount, compType, compOS);
          System.out.println(newComputer);
          cart.addComputer(newComputer);
          itemName.add(compType);
          itemAmount.add(newComputer.getAmount());
          itemPrice.add(newComputer.getPrice());
          System.out.println(" ");

          System.out.println("Your final price for computers (exclude tax) is: $" + cart.getComputerfPrice());
          System.out.println("-------------------------------------------------------------------------------");
          break;
      }else if(userInput == 3){
        temp = 100;
        while(temp > 3){
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
            default:
              System.out.println("Try Again!");
          }
        }

        temp = 100;
        while(temp > 3){
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
            default:
              System.out.println("Try Again!");
          }
        }
          System.out.println("Which one would you like to buy? Choose one in the category. Your Choice: " + cookCategory);
          cookName = keyboard.readLine();

          System.out.println("How many do you want?");
          cookAmount = Integer.parseInt(keyboard.readLine());
          
        temp = 100;
        while(temp > 6){  
          System.out.println("Which brand would you like?");
          System.out.println("Press 1 - Y YHY.");
          System.out.println("Press 2 - DOWAN");
          System.out.println("Press 3 - Creative Hobbies");
          System.out.println("Press 4 - Media");
          System.out.println("Press 5 - Tiger");
          System.out.println("Press 6 - Just Solutions!");
          userInput = Integer.parseInt(keyboard.readLine());
          switch(userInput){
            case 1:
              cookBrand = "Y YHY";
              break;
            case 2:
              cookBrand = "DOWAN";
              break;
            case 3:
              cookBrand = "Creative Hobbies";
              break;
            case 4:
              cookBrand = "Media";
              break;
            case 5:
              cookBrand = "Tiger";
              break;
            case 6:
              cookBrand = "Just Solutions!";
              break;
            default:
              System.out.println("Try Again!");
          }
        }
          Cooker newCooker = new Cooker(cookName, cookBrand, cookPrice, false, cookAmount, cookTexture, cookCategory);
          System.out.println(newCooker);
          cart.addCooker(newCooker);
          itemName.add(newCooker.getName());
          itemAmount.add(newCooker.getAmount());
          itemPrice.add(newCooker.getPrice());
          System.out.println(" ");

          System.out.println("Your final price for computers (exclude tax) is: $" + cart.getCookerfPrice());
          System.out.println("-------------------------------------------------------------------------------");
          break;
      }else if(userInput == 4){
        System.out.println("---------------------------------------------------------");
        System.out.println("                    Items detail below                   ");
        System.out.println("---------------------------------------------------------");
        for (int i = 0; i < itemName.size(); i++) {
          String name;
          int amount;
          double price;
          name = itemName.get(i);
          amount = itemAmount.get(i);
          price = itemPrice.get(i);
          System.out.println(name + " x " + amount + " " + price);
        }
        System.out.println("------------------------------------------");
        fPrice = cart.getCookerfPrice() + cart.getClothingfPrice() + cart.getComputerfPrice();
        tax = fPrice * 0.13;
        priceIncludeTax = fPrice + tax;
        System.out.println("Total: " + currencyFormat.format(fPrice));
        System.out.println("HST 13%: " + currencyFormat.format(tax));
        System.out.println("Total Price include tax: " + currencyFormat.format(priceIncludeTax));
        System.out.println(" ");
        System.out.println("How would you like to pay?");
        System.out.println("Press 1 - Debit Card");
        System.out.println("Press 2 - Credit Card");
        userInput = Integer.parseInt(keyboard.readLine());
          switch(userInput){
            case 1:
              System.out.println("Please enter your PIN");
              userString = keyboard.readLine();
              System.out.println("Approved, Thank you for your purchase!");
              break;
            case 2:
              System.out.println("Please sign your name");
              userString = keyboard.readLine();
              System.out.println("Approved, Thank you for your purchase!");
              break;
            default:
              System.out.println("Try Again!");
              break;  
          }
      }else{
        System.out.println("invalid");
      }
    }
  }
}