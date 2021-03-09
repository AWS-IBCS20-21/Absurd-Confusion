import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;

public class NutritionSearch {

  public static int searchMatches(String keyword, ArrayList<String> nameIndex) {
    String currentName;
    int matchIndex = -1;
    keyword = keyword.toUpperCase();
    for (int i = 0; i < nameIndex.size(); i++){
      currentName = nameIndex.get(i);
      currentName = currentName.toUpperCase();
      if (currentName.equals(keyword)) {
       matchIndex = i;
      }

    }
    return matchIndex;
  }

  public static ArrayList<Double> defaultPortions(int selectionIndex, ArrayList <String> nutrientsG) {
    ArrayList<Double> defaultPortions = new ArrayList<Double>();
    double standard = Double.parseDouble(nutrientsG.get(selectionIndex));
    defaultPortions.add(standard*0.6);
    defaultPortions.add(standard);
    defaultPortions.add(standard*1.4);

    return defaultPortions;

  }

  public static ArrayList<Double> retrieveInfo(double portionSize, String selection, int selectionIndex,
ArrayList<String> nutrientsG, ArrayList<String> nutrientsP, ArrayList<String> nutrientsF, ArrayList<String> nutrientsC, Boolean displayCalories){
double adjustedG = portionSize*Double.parseDouble(nutrientsG.get(selectionIndex));
double adjustedP = portionSize*Double.parseDouble(nutrientsP.get(selectionIndex));
double adjustedF = portionSize*Double.parseDouble(nutrientsF.get(selectionIndex));
double adjustedC = portionSize*Double.parseDouble(nutrientsC.get(selectionIndex));
ArrayList<Double> adjustedNutrients = new ArrayList<Double>();
adjustedNutrients.add(adjustedG);
adjustedNutrients.add(adjustedC);
adjustedNutrients.add(adjustedP);
adjustedNutrients.add(adjustedF);
if (displayCalories == true) {
  adjustedNutrients.add((adjustedC*4) + (adjustedP*4) + (adjustedF*9));
}

return adjustedNutrients;
}









}
