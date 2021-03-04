import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;

public class nutritionSearch {

  public nutritionSearch(){
    ArrayList <String> nameIndex = new ArrayList<String>();
    ArrayList <String> calories = new ArrayList<String>();
    ArrayList <String> nutrientsG = new ArrayList<String>();
    ArrayList <String> nutrientsC = new ArrayList<String>();
    ArrayList <String> nutrientsP = new ArrayList<String>();
    ArrayList <String> nutrientsF = new ArrayList<String>();
    try{
      File nutritionalInfo = new File("nutritionalInfo.txt");
      BufferedReader scan = new BufferedReader(new FileReader (nutritionalInfo));
      String tempString;

      while((tempString = scan.readLine()) != null){

        String[] single = tempString.split(":");
        nameIndex.add(single[1]);
        calories.add(single[2]);
        nutrientsG.add(single[3]);
        nutrientsC.add(single[4]);
        nutrientsP.add(single[5]);
        nutrientsF.add(single[6]);
      }

    }catch(Exception e){
      e.printStackTrace();
    }

  }

  public ArrayList <String> searchMatches(String keyword, ArrayList<String> nameIndex) {
    char[] keywordArr = keyword.toCharArray();
    int margin;
    String currentName;
    char[] temp;
    String keywordArrC;
    String tempC;
    ArrayList<String> matches;
    for(int i = 0; i < keywordArr.length; i++){
      if (Character.isLetter(keywordArr[i]) && Character.isUpperCase(keywordArr[i])) {
        keywordArr[i] = Character.toLowerCase(keywordArr[i]);
      }
    }
    for (int i = 0, i < nameIndex.size(); i++){
      currentName = nameIndex.get(i);
      temp = currentName.toCharArray();
      for(int k = 0; i < temp.length; k++){
        if (Character.isLetter(temp[k]) && Character.isUpperCase(temp[k])) {
          temp[k] = Character.toLowerCase(temp[k]);
        }
      }
      margin = 3;
      for (int j = 0; j < temp.length || keywordArr.length; j++){
        keywordArrC = keywordArr[j];
        tempC = temp[j]
        if (!keywordArrC.equals(tempC)) {
          margin --;
        }
        j++
      }
      if (margin >= 0){
        matches.add(currentName + ":" + i);
      }
      i++

    }
    return matches;
  }

  public ArrayList<String> defaultPortions(int selectionIndex, ArrayList <String> nutrientsG) {
    ArrayList<String> defaultPortions;
    double standard = nutrientsG.get(selectionIndex);
    defaultPortions.add(standard*0.6);
    defaultPortions.add(standard);
    defaultPortions.add(standard*1.4);

    return defaultPortions;

  }

  public ArrayList<String> retrieveInfo(double portionSize; String selection, int selectionIndex, ArrayList<String> calories, ArrayList<String> nutrients, Boolean displayCalories){

  }









}
