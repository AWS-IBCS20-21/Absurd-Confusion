import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;

public class nutritionalCalculator {

  public nutritionalCalculator() {

  }

  public double BMRCalculator(double weight, double height, int activityLevel, double age) {
    double BMR = 655 + (4.35*weight) + (4.7*height) - (4.7*age);
    double temp = 0;
    if (activityLevel == 1) {
      temp = BMR * 1.2;
    }
    if (activityLevel == 2) {
      temp = BMR * 1.375;
    }
    if (activityLevel == 3) {
      temp = BMR * 1.55;
    }
    if (activityLevel == 5) {
      temp = BMR * 1.725;
    }

    return temp;
  }

  public static void main(String[] args) {
    nutritionalCalculator n = new nutritionalCalculator();
    double weight = 1;
    double height = 1;
    int activityLevel = 1;
    double age = 1;
  }


}
