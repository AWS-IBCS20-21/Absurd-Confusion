import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;

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

}

public static void clearMacrosInfo(JComboBox fitnessGoalsComboBox, JTextArea carbsTextArea, JTextArea proteinTextArea, JTextArea fatTextArea){
  fitnessGoalsComboBox.setSelectedIndex(0);
  carbsTextArea.setText("");
  proteinTextArea.setText("");
  fatTextArea.setText("");
}

public static void clearDailyLog(JTextArea loggedTodayTextArea, JTextArea remainingTodayTextArea, JTextArea totalTextArea){
  loggedTodayTextArea.setText("");
  remainingTodayTextArea.setText("");
  totalTextArea.setText("");
}
}
