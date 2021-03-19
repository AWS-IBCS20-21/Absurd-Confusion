import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;

public class TodayTracker {

public TodayTracker(){

}

public static ArrayList<Double> macrosLeft(double BMRCarbsT, double BMRProteinT, double BMRFatT,
double carbsD, double proteinD, double fatD){
  ArrayList<Double> macrosLeft = new ArrayList<Double>();
  macrosLeft.add(BMRCarbsT - carbsD);
  macrosLeft.add(BMRProteinT - proteinD);
  macrosLeft.add(BMRFatT - fatD);

  return macrosLeft;
}

public static ArrayList<Double> macrosTotal(double BMRCarbsS, double BMRProteinS, double BMRFatS,
double carbsD, double proteinD, double fatD){
  ArrayList<Double> macrosTotal = new ArrayList<Double>();
  macrosTotal.add(BMRCarbsS + carbsD);
  macrosTotal.add(BMRProteinS + proteinD);
  macrosTotal.add(BMRFatS + fatD);

  return macrosTotal;
}





}
