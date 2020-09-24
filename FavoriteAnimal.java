import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;

class FavoriteAnimal {

String species;
int height;
int weight;
String predatorPrey;
String habitat;
String nativeTo;
String funFact;

public FavoriteAnimal() {
  species = "Fennec Fox";
  height = 16;
  weight = 3;
  predatorPrey = "predator";
  habitat = "Its habitat consists of desert climates: dry, sandy, with desert grass and shrubs for vegetation.";
  nativeTo = "It is native to North Africa.";
  funFact = "It is the smallest species of fox. It is nocturnal. It has very large ears in order to release heat and keep it cool.";

}

public String returnSpecies() {
  return species;
}

public int returnHeight() {
  return height;
}

public int returnWeight() {
  return weight;
}

public String returnPredatorPrey() {
  return predatorPrey;
}


public String returnHabitat() {
  return habitat;
}

public String returnNativeTo() {
  return nativeTo;
}

public String returnFunFact() {
  return funFact;
}

public static void main(String[] args) {

  FavoriteAnimal n = new FavoriteAnimal();
  int x = 1;
while (x == 1) {
  System.out.println("Welcome to the virtual zoo.");
  System.out.println("What would you like to learn about the mystery animal?");
  System.out.println("1: What is its species?");
  System.out.println("2: What is its length?");
  System.out.println("3: What is its weight?");
  System.out.println("4: Is it a predator or prey?");
  System.out.println("5: What is its habitat?");
  System.out.println("6: Where it is native to?");
  System.out.println("7: What are some fun facts about it?");
  System.out.println("8: Exit exhibit.");

  Scanner userInput = new Scanner(System.in);
  int choice = userInput.nextInt();

  if (choice == 1) {
    System.out.println(n.returnSpecies());
  }

  if (choice == 2) {
System.out.println(n.returnHeight() + " inches." );
  }

  if (choice == 3) {
System.out.println(n.returnWeight() + " pounds.");
  }

  if (choice == 4) {
System.out.println("It is a " + n.returnPredatorPrey() + ".");
  }

  if (choice == 5) {
System.out.println(n.returnHabitat());
  }

  if (choice == 6) {
System.out.println(n.returnNativeTo());
  }

  if (choice == 7) {
System.out.println(n.returnFunFact());
  }

  if (choice == 8) {
x = 0;
  }
}
}




}
