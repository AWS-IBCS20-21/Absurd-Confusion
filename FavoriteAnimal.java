import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;

class FavoriteAnimal {

String species;
int length;
int weight;
String predatorPrey;
String habitat;
String nativeTo;
String funFact;

public FavoriteAnimal() {
  species = "Fennec Fox";
  height = 16;
  weight = 3;
  predatorPrey = "Predator";
  habitat = "Its habitat consists of desert climates: dry, sandy, with desert grass and shrubs for vegetation."
  nativeTo = "It is native to North Africa."
  funFact = "It is the smallest species of fox. It is nocturnal. It has very large ears in order to release heat and keep it cool."

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




}
