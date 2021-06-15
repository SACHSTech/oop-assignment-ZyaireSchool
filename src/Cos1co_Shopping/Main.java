package Cos1co_Shopping;
import Cos1co_Shopping.*;
import java.io.*;
import java.util.ArrayList;
import java.text.NumberFormat;

public class Main{
  public static void main(String[] args) throws IOException{
    int userInput = 0;
    String cloCol

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
        System.out.println("What color do you want?");
        userInput = keyboard.readLine();
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