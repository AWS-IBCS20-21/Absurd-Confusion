import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;

class CoffeeShop{
public static void main(String[] args) {


System.out.println("Welcome to the Coffee Shop!");
System.out.println("What beverage would you like to order?");
Scanner order = new Scanner(System.in);
String beverageOrder = order.nextLine();
System.out.println("Alright, so one " + beverageOrder + ". Would you like to order a food item as well?");
String answer = order.nextLine();
if (answer.equals("yes")) {
  System.out.println("What food item would you like to order?");
  String foodOrder = order.nextLine();
  System.out.println("OK, one " + beverageOrder + " and one " + foodOrder + ". Would you like your order for here or to go?");
  String toGo = order.nextLine();
  if (toGo.equals("to go")) {
    System.out.println("So a " + beverageOrder + " and one " + foodOrder + " " + toGo + ".");
    System.out.println("Could I take your name for your order?");
    String name = order.nextLine();
    System.out.println("Here's your " + beverageOrder + " and " + foodOrder + " " + toGo + ", " + name + "!");
    System.out.println("Thanks for visiting our Coffee Shop!");
  }
  else {
    if (toGo.equals("for here")) {
      System.out.println("So a " + beverageOrder + " and one " + foodOrder + " " + toGo + ".");
      System.out.println("Could I take your name for your order?");
      String name = order.nextLine();
      System.out.println("Here's your " + beverageOrder + " and " + foodOrder + " " + toGo + ", " + name + "!");
      System.out.println("Thanks for visiting our Coffee Shop!");
    }
  }

}
else {
  if (answer.equals("no")) {
      System.out.println("Alright. Would you like your order for here or to go?");
      String toGo = order.nextLine();

      if (toGo.equals("to go")) {
        System.out.println("So a " + beverageOrder + " " + toGo + ".");
        System.out.println("Could I take your name for your order?");
        String name = order.nextLine();
        System.out.println("Here's your " + beverageOrder + toGo + ", " + name + "!");
        System.out.println("Thanks for visiting our Coffee Shop!");

      }
      else {
        if (toGo.equals("for here")) {
          System.out.println("So a " + beverageOrder + toGo + ".");
          System.out.println("Could I take your name for your order?");
          String name = order.nextLine();
          System.out.println("Here's your " + beverageOrder + " " + toGo + ", " + name + "!");
          System.out.println("Thanks for visiting our Coffee Shop!");
        }
    }

      }



}
}
}
