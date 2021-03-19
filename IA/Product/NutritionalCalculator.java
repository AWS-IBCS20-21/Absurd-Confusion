import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;

public class NutritionalCalculator {

  public NutritionalCalculator() {

  }

  public static double BMRCalculator(double weight, double height, int age, int activityLevel) {
    double BMR = 655 + (4.35*weight) + (4.7*height) - (4.7*age);
    double temp = 0;
    //1: sedentary
    //2: lightly active
    //3: moderately active
    //4: very active
    if (activityLevel == 1) {
      temp = BMR * 1.2;
    }
    if (activityLevel == 2) {
      temp = BMR * 1.375;
    }
    if (activityLevel == 3) {
      temp = BMR * 1.55;
    }
    if (activityLevel == 4) {
      temp = BMR * 1.725;
    }

    return temp;
  }

  public static ArrayList<Double> macrosCalculator(double BMRValue, int fitnessGoal) {
    //1: maintain
    //2: lose fat, gain muscle
    //3: lose fat and lose muscle
    ArrayList<Double> adjustedMacros = new ArrayList<Double>();

    if (fitnessGoal == 1) {
      adjustedMacros.add((BMRValue*0.4)/4);
      adjustedMacros.add((BMRValue*0.3)/4);
      adjustedMacros.add((BMRValue*0.3)/9);

    }

    if (fitnessGoal == 2) {
      adjustedMacros.add((BMRValue*0.3)/4);
      adjustedMacros.add((BMRValue*0.4)/4);
      adjustedMacros.add((BMRValue*0.3)/9);

    }

    if (fitnessGoal == 3) {
      adjustedMacros.add((BMRValue*0.45)/4);
      adjustedMacros.add((BMRValue*0.35)/4);
      adjustedMacros.add((BMRValue*0.2)/9);

    }

    return adjustedMacros;
  }




}
