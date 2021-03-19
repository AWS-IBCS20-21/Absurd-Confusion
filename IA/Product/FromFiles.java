import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;

public class FromFiles {

public FromFiles() {

}

public static double getWeightStorage(){
  double filedWeight = 0;
try{
  File weightStorage = new File("weightStorage.txt");
  BufferedReader scan = new BufferedReader(new FileReader (weightStorage));
  String tempString;


  while((tempString = scan.readLine()) != null){

    filedWeight = Double.parseDouble(tempString);

  }

}catch(Exception e){
  e.printStackTrace();
}

return filedWeight;
}

public static double getHeightStorage(){
  double filedHeight = 0;
try{
  File heightStorage = new File("heightStorage.txt");
  BufferedReader scan = new BufferedReader(new FileReader (heightStorage));
  String tempString;


  while((tempString = scan.readLine()) != null){

    filedHeight = Double.parseDouble(tempString);

  }

}catch(Exception e){
  e.printStackTrace();
}

return filedHeight;
}

public static int getAgeStorage(){
  int filedAge = 0;
try{
  File ageStorage = new File("ageStorage.txt");
  BufferedReader scan = new BufferedReader(new FileReader (ageStorage));
  String tempString;


  while((tempString = scan.readLine()) != null){

    filedAge = Integer.parseInt(tempString);

  }

}catch(Exception e){
  e.printStackTrace();
}

return filedAge;
}

public static int getActivityLevelStorage(){
  int filedActivityLevel = 0;
try{
  File activityLevelStorage = new File("activityLevelStorage.txt");
  BufferedReader scan = new BufferedReader(new FileReader (activityLevelStorage));
  String tempString;


  while((tempString = scan.readLine()) != null){

    filedActivityLevel = Integer.parseInt(tempString);

  }

}catch(Exception e){
  e.printStackTrace();
}

return filedActivityLevel;
}

public static double getBMRStorage() {
    double filedBMR = 0;
  try{
    File BMRStorage = new File("BMRStorage.txt");
    BufferedReader scan = new BufferedReader(new FileReader (BMRStorage));
    String tempString;


    while((tempString = scan.readLine()) != null){

      filedBMR = Double.parseDouble(tempString);

    }

  }catch(Exception e){
    e.printStackTrace();
  }

  return filedBMR;
}

public static Double getMacrosStorageCarbs(){
  double filedCarbs = 0;

try{
  File macrosStorageCarbs = new File("macrosStorageCarbs.txt");
  BufferedReader scan = new BufferedReader(new FileReader (macrosStorageCarbs));
  String tempString;


  while((tempString = scan.readLine()) != null){

    filedCarbs = Double.parseDouble(tempString);

  }

}catch(Exception e){
  e.printStackTrace();
}


return filedCarbs;
}

public static Double getMacrosStorageProtein(){
  double filedProtein = 0;

try{
  File macrosStorageProtein = new File("macrosStorageProtein.txt");
  BufferedReader scan = new BufferedReader(new FileReader (macrosStorageProtein));
  String tempString;


  while((tempString = scan.readLine()) != null){

    filedProtein = Double.parseDouble(tempString);

  }

}catch(Exception e){
  e.printStackTrace();
}


return filedProtein;
}

public static Double getMacrosStorageFat(){
  double filedFat = 0;

try{
  File macrosStorageFat = new File("macrosStorageFat.txt");
  BufferedReader scan = new BufferedReader(new FileReader (macrosStorageFat));
  String tempString;


  while((tempString = scan.readLine()) != null){

    filedFat = Double.parseDouble(tempString);

  }

}catch(Exception e){
  e.printStackTrace();
}


return filedFat;
}

public static int getFitnessGoalStorage(){
  int filedFitnessGoal = 0;
try{
  File fitnessGoalStorage = new File("fitnessGoalStorage.txt");
  BufferedReader scan = new BufferedReader(new FileReader (fitnessGoalStorage));
  String tempString;


  while((tempString = scan.readLine()) != null){

    filedFitnessGoal = Integer.parseInt(tempString);

  }

}catch(Exception e){
  e.printStackTrace();
}

return filedFitnessGoal;
}


public static String getDailyStorage() {
    String filedDaily = "";
  try{
    File dailyStorage = new File("dailyStorage.txt");
    BufferedReader scan = new BufferedReader(new FileReader (dailyStorage));
    String tempString;


    while((tempString = scan.readLine()) != null){

      filedDaily = filedDaily + tempString + "\n";

    }

  }catch(Exception e){
    e.printStackTrace();
  }

  return filedDaily;
}

public static ArrayList<Double> getRemainingStorage(){
  ArrayList<Double> filedRemaining = new ArrayList<Double>();

try{
  File remainingStorage = new File("remainingStorage.txt");
  BufferedReader scan = new BufferedReader(new FileReader (remainingStorage));
  String tempString;


  while((tempString = scan.readLine()) != null){

  filedRemaining.add(Double.parseDouble(tempString));

  }

}catch(Exception e){
  e.printStackTrace();
}


return filedRemaining;
}

public static ArrayList<Double> getTotalStorage(){
  ArrayList<Double> filedTotal = new ArrayList<Double>();

try{
  File totalStorage = new File("totalStorage.txt");
  BufferedReader scan = new BufferedReader(new FileReader (totalStorage));
  String tempString;


  while((tempString = scan.readLine()) != null){

  filedTotal.add(Double.parseDouble(tempString));

  }

}catch(Exception e){
  e.printStackTrace();
}


return filedTotal;
}



}
