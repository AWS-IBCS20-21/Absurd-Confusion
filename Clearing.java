import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Clearing{

public Clearing(){

}

public static void clearLogFood(JTextField searchBarTextField, JTextArea matchTextArea, JComboBox portionSizeComboBox, JTextField customPortionSizeTextField, JTextArea nutritionalInfo){
  searchBarTextField.setText("");
  matchTextArea.setText("");
  portionSizeComboBox.removeAllItems();
  customPortionSizeTextField.setText("");
  nutritionalInfo.setText("");
}

public static void clearEnterInfo(JTextField weightTextField, JTextField heightTextField, JTextField ageTextField, JComboBox activityLevelComboBox){
  weightTextField.setText("");
  heightTextField.setText("");
  ageTextField.setText("");
  activityLevelComboBox.setSelectedIndex(0);
  try {
    FileWriter logWriter = new FileWriter("BMRStorage.txt", false);
    PrintWriter logFlush = new PrintWriter(logWriter, false);
    logFlush.flush();
    logFlush.close();
    logWriter.write("0");
    logWriter.close();
  } catch (IOException e) {
    e.printStackTrace();
  }

  try {
    FileWriter logWriter = new FileWriter("weightStorage.txt", false);
    PrintWriter logFlush = new PrintWriter(logWriter, false);
    logFlush.flush();
    logFlush.close();
    logWriter.close();
  } catch (IOException e) {
    e.printStackTrace();
  }

  try {
    FileWriter logWriter = new FileWriter("heightStorage.txt", false);
    PrintWriter logFlush = new PrintWriter(logWriter, false);
    logFlush.flush();
    logFlush.close();
    logWriter.close();
  } catch (IOException e) {
    e.printStackTrace();
  }

  try {
    FileWriter logWriter = new FileWriter("ageStorage.txt", false);
    PrintWriter logFlush = new PrintWriter(logWriter, false);
    logFlush.flush();
    logFlush.close();
    logWriter.close();
  } catch (IOException e) {
    e.printStackTrace();
  }
  try {
    FileWriter logWriter = new FileWriter("activityLevelStorage.txt", false);
    PrintWriter logFlush = new PrintWriter(logWriter, false);
    logFlush.flush();
    logFlush.close();
    logWriter.write("0");
    logWriter.close();
  } catch (IOException e) {
    e.printStackTrace();
  }

}

public static void clearMacrosInfo(JComboBox fitnessGoalsComboBox, JTextArea carbsTextArea, JTextArea proteinTextArea, JTextArea fatTextArea, JTextArea remainingTodayTextArea){
  fitnessGoalsComboBox.setSelectedIndex(0);
  carbsTextArea.setText("");
  proteinTextArea.setText("");
  fatTextArea.setText("");
  remainingTodayTextArea.setText("0g carbohydrates" +"\n" + "0g protein" + "\n" + "0g fat");
  try {
    FileWriter logWriter = new FileWriter("macrosStorageCarbs.txt", false);
    PrintWriter logFlush = new PrintWriter(logWriter, false);
    logFlush.flush();
    logFlush.close();
    logWriter.close();
  } catch (IOException e) {
    e.printStackTrace();
  }
  try {
    FileWriter logWriter = new FileWriter("macrosStorageProtein.txt", false);
    PrintWriter logFlush = new PrintWriter(logWriter, false);
    logFlush.flush();
    logFlush.close();
    logWriter.close();
  } catch (IOException e) {
    e.printStackTrace();
  }
  try {
    FileWriter logWriter = new FileWriter("macrosStorageFat.txt", false);
    PrintWriter logFlush = new PrintWriter(logWriter, false);
    logFlush.flush();
    logFlush.close();
    logWriter.close();
  } catch (IOException e) {
    e.printStackTrace();
  }
}

public static void clearDailyLog(double BMRCarbs, double BMRProtein, double BMRFat, JTextArea loggedTodayTextArea,
JTextArea remainingTodayTextArea, JTextArea totalTextArea){
  loggedTodayTextArea.setText("");
  remainingTodayTextArea.setText("");
  totalTextArea.setText("");
  try {
    FileWriter logWriter = new FileWriter("dailyStorage.txt", false);
    PrintWriter logFlush = new PrintWriter(logWriter, false);
    logFlush.flush();
    logFlush.close();
    logWriter.close();
  } catch (IOException e) {
    e.printStackTrace();
  }
  try {
    FileWriter logWriter = new FileWriter("remainingStorage.txt", false);
    PrintWriter logFlush = new PrintWriter(logWriter, false);
    logFlush.flush();
    logFlush.close();
    logWriter.close();
  } catch (IOException e) {
    e.printStackTrace();
  }
  try {
    FileWriter logWriter = new FileWriter("remainingStorage.txt");
    logWriter.write(BMRCarbs +"\n" + BMRProtein + "\n" + BMRFat);
    logWriter.close();
  } catch (IOException e) {
    e.printStackTrace();
  }

  try {
    FileWriter logWriter = new FileWriter("totalStorage.txt", false);
    PrintWriter logFlush = new PrintWriter(logWriter, false);
    logFlush.flush();
    logFlush.close();
    logWriter.close();
  } catch (IOException e) {
    e.printStackTrace();
  }
  try {
    FileWriter logWriter = new FileWriter("totalStorage.txt");
    logWriter.write("0\n0\n0");
    logWriter.close();
  } catch (IOException e) {
    e.printStackTrace();
  }
}


}
