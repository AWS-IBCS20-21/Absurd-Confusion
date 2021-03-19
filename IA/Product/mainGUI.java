import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.FileWriter;

public class mainGUI {

  private JFrame mainFrame;
  private JLabel headerLabel;
  private JLabel statusLabel;

  private JPanel enterInfo;
  private JTextField weightTextField;
  private JTextField heightTextField;
  private JTextField ageTextField;
  private JTextField activityLevelTextField;
  private JLabel personalInfoLabel;
  private JButton enterPersonalInfoButton;
  private double BMRValue;
  private double weight;
  private double height;
  private int age;
  private int activityLevel;
  private JLabel weightLabel;
  private JLabel heightLabel;
  private JLabel ageLabel;
  private JLabel weightLabelS;
  private JLabel heightLabelS;
  private JLabel ageLabelS;
  private JLabel activityLevelLabelS;
  private static final String activityLevelList[] = {"1: Sedentary", "2: Lightly active",
  "3: Moderately active", "4: Very active"};
	private JComboBox activityLevelComboBox;
  private JButton clearEnterInfoButton;
  private double filedBMR;
  private int filedActivityLevel;

  private JPanel macrosInfo;
  private JButton fitnessGoalsButton;
  private JTextArea carbsTextArea;
  private JTextArea proteinTextArea;
  private JTextArea fatTextArea;
  private static final String fitnessGoalsList[] = {"1: Maintain", "2: Lose fat and gain muscle",
  "3: Lost fat and lose muscle"};
  private JComboBox fitnessGoalsComboBox;
  private JLabel macrosInfoLabel;
  private JButton clearMacrosInfoButton;
  private double BMRCarbs;
  private double BMRProtein;
  private double BMRFat;
  private double BMRCarbsT;
  private double BMRProteinT;
  private double BMRFatT;
  private double BMRCarbsS;
  private double BMRProteinS;
  private double BMRFatS;
  private int filedFitnessGoal;
  private double filedCarbs;
  private double filedProtein;
  private double filedFat;


  private JPanel logFood;
  private JTextField searchBarTextField;
  private JButton enterFoodButton;
  private JLabel logFoodLabel;
  private JTextArea matchTextArea;
  private JButton logFoodButton;
  private int selectionIndex;
  private JButton confirmMatch;
  private JComboBox portionSizeComboBox;
  private JTextField customPortionSizeTextField;
  private JLabel  customPortionSizeLabel;
  private JLabel enterCustomPortionLabel;
  private double portionSize;
  private JTextArea nutritionalInfo;
  private ArrayList<String> nameIndex;
  private ArrayList<String> nutrientsG;
  private ArrayList<String> nutrientsC;
  private ArrayList<String> nutrientsP;
  private ArrayList<String> nutrientsF;
  private ArrayList<Double> tempDefaults;
  private ArrayList<String> today;
  private JButton confirmPortionButton;
  private String name;
  private String grams;
  private String carbs;
  private String protein;
  private String fat;
  private JButton clearLogFoodButton;
  private double carbsD;
  private double proteinD;
  private double fatD;
  private ArrayList<Double> retrieveInfo;
  private String keyword;


  private JPanel dailyLog;
  private JLabel dailyLogLabel;
  private JLabel loggedTodayLabel;
  private JTextArea loggedTodayTextArea;
  private JLabel remainingTodayLabel;
  private JTextArea remainingTodayTextArea;
  private JButton clearDailyLogButton;
  private int i = -1;
  private JTextArea totalTextArea;
  private JLabel totalLabel;
  private String filedDaily;
  private ArrayList<Double> filedRemaining;
  private ArrayList<Double> filedTotal;
  private ArrayList<String> filedRemainingAndTotal;
  private JPanel remainingAndTotalLog;
  private String currentlyLogged;
  private Boolean check;
  private Boolean checkB;
  private Boolean checkK;







  public mainGUI(){
     setUpGUI();
  }
  public static void main(String[] args){
     mainGUI mainGUI = new mainGUI();
     mainGUI.runIA();
  }
  private void setUpGUI(){
     mainFrame = new JFrame("Nutrition Assistant");
     mainFrame.setSize(800,1600);
     mainFrame.setLayout(new GridLayout(2, 2));


    headerLabel = new JLabel("",JLabel.CENTER );


     mainFrame.addWindowListener(new WindowAdapter() {
        public void windowClosing(WindowEvent windowEvent){
           System.exit(0);
        }
     });

     enterInfo = new JPanel();
     enterInfo.setLayout(new FlowLayout());
     macrosInfo = new JPanel();
     macrosInfo.setLayout(new FlowLayout());
     logFood = new JPanel();
     logFood.setLayout(new FlowLayout());
     dailyLog = new JPanel();
     dailyLog.setLayout(new FlowLayout());
     remainingAndTotalLog = new JPanel();
     remainingAndTotalLog.setLayout(new FlowLayout());

     mainFrame.add(headerLabel);
     mainFrame.add(enterInfo);
     mainFrame.add(macrosInfo);
     mainFrame.add(logFood);
     mainFrame.add(dailyLog);
     mainFrame.add(remainingAndTotalLog);

     mainFrame.setVisible(true);
  }
  private void runIA(){
     headerLabel.setText("Welcome to Nutrition Assistant");

     //enterInfo
     personalInfoLabel = new JLabel("Please enter personal information:");
     weightLabelS = new JLabel("Weight:");
     weightTextField = new JTextField(3);
     weight = FromFiles.getWeightStorage();
     weightTextField.setText(String.format("%.0f", weight));
     weightLabel = new JLabel("lbs  ");
     heightLabelS = new JLabel("Height:");
     height = FromFiles.getHeightStorage();
     heightTextField = new JTextField(3);
     heightTextField.setText(String.format("%.0f", height));
     heightLabel = new JLabel("inches  ");
     ageLabelS = new JLabel("Age:");
     ageTextField = new JTextField(3);
     age = FromFiles.getAgeStorage();
     String tempAge = Integer.toString(age);
     ageTextField.setText(tempAge);
     ageLabel = new JLabel("years  ");
     activityLevelLabelS = new JLabel("Activity level:");
     activityLevelComboBox = new JComboBox(activityLevelList);
     filedActivityLevel = FromFiles.getActivityLevelStorage();
     activityLevelComboBox.setSelectedIndex(filedActivityLevel);
     filedBMR = FromFiles.getBMRStorage();
     BMRValue = filedBMR;
     enterPersonalInfoButton = new JButton("Enter information");
     enterPersonalInfoButton.setActionCommand("Calculate BMR");
     enterPersonalInfoButton.addActionListener(new guiActionListener());
     clearEnterInfoButton = new JButton("Reset");
     clearEnterInfoButton.setActionCommand("Clear enterInfo");
     clearEnterInfoButton.addActionListener(new guiActionListener());


     //macrosInfo
     macrosInfoLabel = new JLabel("Please specify your fitness goals:");
     fitnessGoalsComboBox = new JComboBox(fitnessGoalsList);
     filedFitnessGoal = FromFiles.getFitnessGoalStorage();
     fitnessGoalsComboBox.setSelectedIndex(filedFitnessGoal);
     fitnessGoalsButton = new JButton("Calculate macronutrients");
     fitnessGoalsButton.setActionCommand("Calculate macronutrients");
     fitnessGoalsButton.addActionListener(new guiActionListener());
     carbsTextArea = new JTextArea(1, 5);
     carbsTextArea.setEditable(false);
     filedCarbs = FromFiles.getMacrosStorageCarbs();
     carbsTextArea.setText(String.format("%.0fg carbohydrates", filedCarbs));
     proteinTextArea = new JTextArea(1, 5);
     proteinTextArea.setEditable(false);
     filedProtein = FromFiles.getMacrosStorageProtein();
     proteinTextArea.setText(String.format("%.0fg protein", filedProtein));
     fatTextArea = new JTextArea(1, 5);
     fatTextArea.setEditable(false);
     filedFat = FromFiles.getMacrosStorageFat();
     fatTextArea.setText(String.format("%.0fg fat", filedFat));
     clearMacrosInfoButton = new JButton("Reset");
     macrosInfo.add(clearMacrosInfoButton);
     clearMacrosInfoButton.setActionCommand("Clear macrosInfo");
     clearMacrosInfoButton.addActionListener(new guiActionListener());
     clearMacrosInfoButton.addActionListener(new guiActionListener());


     //logFood
     logFoodLabel = new JLabel("Log a food");
     searchBarTextField = new JTextField(20);
     enterFoodButton = new JButton("Enter");
     enterFoodButton.setActionCommand("Enter food");
     enterFoodButton.addActionListener(new guiActionListener());
     matchTextArea = new JTextArea(1, 7);
     matchTextArea.setEditable(false);
     confirmMatch = new JButton("Confirm match");
     confirmMatch.setActionCommand("Confirm match");
     confirmMatch.addActionListener(new guiActionListener());
     portionSizeComboBox = new JComboBox();
     customPortionSizeTextField = new JTextField(3);
     customPortionSizeLabel = new JLabel("g");
     confirmPortionButton = new JButton("Confirm portion size");
     confirmPortionButton.setActionCommand("Confirm portion size");
     confirmPortionButton.addActionListener(new guiActionListener());
     enterCustomPortionLabel = new JLabel("Enter custom value here:");
     nutritionalInfo = new JTextArea(5, 10);
     nutritionalInfo.setEditable(false);
     logFoodButton = new JButton("Log this");
     logFoodButton.setActionCommand("Log this");
     logFoodButton.addActionListener(new guiActionListener());

     clearLogFoodButton = new JButton("Reset");
     clearLogFoodButton.setActionCommand("Clear logFood");
     clearLogFoodButton.addActionListener(new guiActionListener());

     //dailyLog
     dailyLogLabel = new JLabel("                      Daily log                      ");
     loggedTodayLabel = new JLabel("Logged today:");
     loggedTodayTextArea = new JTextArea(6, 10);
     filedDaily = FromFiles.getDailyStorage();
     loggedTodayTextArea.setEditable(false);
     loggedTodayTextArea.setText(filedDaily);
     remainingTodayLabel = new JLabel("Remaining macronutrients today:");
     remainingTodayTextArea = new JTextArea(3, 10);
     remainingTodayTextArea.setEditable(false);
     filedRemaining = FromFiles.getRemainingStorage();
     BMRCarbsT = filedRemaining.get(0);
     BMRProteinT = filedRemaining.get(1);
     BMRFatT = filedRemaining.get(2);
     remainingTodayTextArea.setText(String.format("%.0fg carbohydrates", filedRemaining.get(0)) + "\n" +
     String.format("%.0fg protein", filedRemaining.get(1)) + "\n" + String.format("%.0fg fat", filedRemaining.get(2)));
     clearDailyLogButton = new JButton("Reset");
     clearDailyLogButton.setActionCommand("Clear dailyLog and remainingAndTotalLog");
     clearDailyLogButton.addActionListener(new guiActionListener());
     totalTextArea = new JTextArea(3, 10);
     totalTextArea.setEditable(false);
     filedTotal = FromFiles.getTotalStorage();
     BMRCarbsS = filedTotal.get(0);
     BMRProteinS = filedTotal.get(1);
     BMRFatS = filedTotal.get(2);
     totalTextArea.setText(String.format("%.0fg carbohydrates", filedTotal.get(0)) + "\n" +
     String.format("%.0fg protein", filedTotal.get(1)) + "\n" + String.format("%.0fg fat", filedTotal.get(2)));
     totalLabel = new JLabel("Total macronutrients today:");


     enterInfo.add(personalInfoLabel);
     enterInfo.add(weightLabelS);
     enterInfo.add(weightTextField);
     enterInfo.add(weightLabel);
     enterInfo.add(heightLabelS);
     enterInfo.add(heightTextField);
     enterInfo.add(heightLabel);
     enterInfo.add(ageLabelS);
     enterInfo.add(ageTextField);
     enterInfo.add(ageLabel);
     enterInfo.add(activityLevelLabelS);
     enterInfo.add(activityLevelComboBox);
     enterInfo.add(enterPersonalInfoButton);
     enterInfo.add(clearEnterInfoButton);


     macrosInfo.add(macrosInfoLabel);
     macrosInfo.add(fitnessGoalsComboBox);
     macrosInfo.add(fitnessGoalsButton);
     macrosInfo.add(carbsTextArea);
     macrosInfo.add(proteinTextArea);
     macrosInfo.add(fatTextArea);
     macrosInfo.add(clearMacrosInfoButton);

     logFood.add(logFoodLabel);
     logFood.add(searchBarTextField);
     logFood.add(enterFoodButton);
     logFood.add(matchTextArea);
     logFood.add(confirmMatch);
     logFood.add(portionSizeComboBox);
     logFood.add(enterCustomPortionLabel);
     logFood.add(customPortionSizeTextField);
     logFood.add(customPortionSizeLabel);
     logFood.add(confirmPortionButton);
     logFood.add(nutritionalInfo);
     logFood.add(logFoodButton);
     logFood.add(clearLogFoodButton);

     dailyLog.add(dailyLogLabel);
     dailyLog.add(loggedTodayLabel);
     dailyLog.add(loggedTodayTextArea);

     remainingAndTotalLog.add(remainingTodayLabel);
     remainingAndTotalLog.add(remainingTodayTextArea);
     remainingAndTotalLog.add(totalLabel);
     remainingAndTotalLog.add(totalTextArea);
     remainingAndTotalLog.add(clearDailyLogButton);







     mainFrame.setVisible(true);


  }

  private class guiActionListener implements ActionListener{
     public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if(command.equals("Enter food"))  {
          check = true;
          int k = 0;
          if (searchBarTextField.getText().isEmpty()){
            matchTextArea.setText("No match found.");
          } else
          {
          keyword = searchBarTextField.getText();
          char[] keywordArr = keyword.toCharArray();
          for (int g = 0; g < keywordArr.length; g++){
            char c = keywordArr[g];
            if(!Character.isAlphabetic(c)){
              check = false;
              k = 1;
              keyword = "";
              searchBarTextField.setText("Error");
            }
          }

        }
         if (k == 0){

           nameIndex = IntoArrayLists.nameIndex();
           selectionIndex = NutritionSearch.searchMatches(keyword, nameIndex);
           if (selectionIndex >= 0){
            matchTextArea.setText("Match found: " + nameIndex.get(selectionIndex));
         }
           else {
            matchTextArea.setText("No match found.");
          }
           }
         }


        else if(command.equals("Calculate BMR")){
          checkB = true;
          int c = 0;
           if (weightTextField.getText().isEmpty() || heightTextField.getText().isEmpty() || ageTextField.getText().isEmpty()){
             weightTextField.setText("Error");
             heightTextField.setText("Error");
             ageTextField.setText("Error");
             checkB = false;
             c = 1;
             try {
               FileWriter logWriter = new FileWriter("BMRStorage.txt", false);
               PrintWriter logFlush = new PrintWriter(logWriter, false);
               logFlush.flush();
               logFlush.close();
               logWriter.write("0");
               logWriter.close();
             } catch (IOException p) {
               p.printStackTrace();
             }
           }
           else {
             try{
           weight = Double.parseDouble(weightTextField.getText());
           height = Double.parseDouble(heightTextField.getText());
           age = Integer.parseInt(ageTextField.getText());
            checkB = true;
            c = 0;
           if (weight < 0 || height < 0 || age < 0){
             weightTextField.setText("Error");
             heightTextField.setText("Error");
             ageTextField.setText("Error");
             checkB = false;
             c = 1;
             try {
               FileWriter logWriter = new FileWriter("BMRStorage.txt", false);
               PrintWriter logFlush = new PrintWriter(logWriter, false);
               logFlush.flush();
               logFlush.close();
               logWriter.write("0");
               logWriter.close();
             } catch (IOException l) {
               l.printStackTrace();
             }
           }
         } catch (NumberFormatException f) {
           weightTextField.setText("Error");
           heightTextField.setText("Error");
           ageTextField.setText("Error");
           checkB = false;
           c = 1;
           try {
             FileWriter logWriter = new FileWriter("BMRStorage.txt", false);
             PrintWriter logFlush = new PrintWriter(logWriter, false);
             logFlush.flush();
             logFlush.close();
             logWriter.write("0");
             logWriter.close();
           } catch (IOException o) {
             o.printStackTrace();
           }
         }
}
 if (c == 0){
   String tempac = (String)activityLevelComboBox.getSelectedItem();
   int ac = Integer.parseInt(tempac.substring(0,1));
   BMRValue = NutritionalCalculator.BMRCalculator(weight, height, age, ac);
   activityLevel = activityLevelComboBox.getSelectedIndex();
   FileLogged.fileBMR(BMRValue);
   FileLogged.fileWeight(weight);
   FileLogged.fileHeight(height);
   FileLogged.fileAge(age);
   FileLogged.fileActivityLevel(activityLevel);
 }
           }



        else if (command.equals("Calculate macronutrients")) {
          String tempfg = (String)fitnessGoalsComboBox.getSelectedItem();
          ArrayList<Double> m = NutritionalCalculator.macrosCalculator(BMRValue, Integer.parseInt(tempfg.substring(0,1)));
          BMRCarbs = m.get(0);
          BMRProtein = m.get(1);
          BMRFat = m.get(2);
          carbsTextArea.setText(String.format("%.0f", BMRCarbs) + "g carbohydrates");
          proteinTextArea.setText(String.format("%.0f", BMRProtein) + "g protein");
          fatTextArea.setText(String.format("%.0f", BMRFat) + "g fat");
          FileLogged.fileFitnessGoal(Integer.parseInt(tempfg.substring(0,1)));
          FileLogged.fileMacrosCarbs(BMRCarbs);
          FileLogged.fileMacrosProtein(BMRProtein);
          FileLogged.fileMacrosFat(BMRFat);
          FileLogged.fileRemaining(BMRCarbs, BMRProtein, BMRFat);
          filedRemaining = FromFiles.getRemainingStorage();
          filedTotal = FromFiles.getTotalStorage();
          BMRCarbsT = filedRemaining.get(0);
          BMRProteinT = filedRemaining.get(1);
          BMRFatT = filedRemaining.get(2);
          remainingTodayTextArea.setText(String.format("%.0f", BMRCarbs) + "g carbohydrates" + "\n" +
          String.format("%.0f", BMRProtein) + "g protein" + "\n" + String.format("%.0f", BMRFat) + "g fat");

        }
        else if (command.equals("Confirm match")) {
          nutrientsG = IntoArrayLists.nutrientsG();
          tempDefaults = NutritionSearch.defaultPortions(selectionIndex, nutrientsG);
          portionSizeComboBox.insertItemAt("Small: " + String.format("%.0f", tempDefaults.get(0)) + "g", 0);
          portionSizeComboBox.insertItemAt("Standard: " + String.format("%.0f", tempDefaults.get(1)) + "g", 1);
          portionSizeComboBox.insertItemAt("Large: " + String.format("%.0f", tempDefaults.get(2)) + "g", 2);
          portionSizeComboBox.insertItemAt("Custom", 3);
        }

        else if (command.equals("Confirm portion size")) {
          String tempPortion = (String)portionSizeComboBox.getSelectedItem();
          int b = 0;
          if (tempPortion.equals("Custom")) {
            if(customPortionSizeTextField.getText().isEmpty()){
              checkK = false;
              b = 1;
              customPortionSizeTextField.setText("Error");
            } else {
            try {
            portionSize = Double.parseDouble(customPortionSizeTextField.getText());
            checkK = true;
            b = 0;
          } catch (NumberFormatException g) {
            checkK = false;
            b = 1;
            customPortionSizeTextField.setText("Error");
          }
        }
          }
          else {
            portionSize = tempDefaults.get(portionSizeComboBox.getSelectedIndex());
          }
          if (portionSize < 0){
            customPortionSizeTextField.setText("Error");
            checkK = false;
            b = 1;
          }
          if (b == 0) {
          double factor = portionSize/Double.parseDouble(nutrientsG.get(selectionIndex));
          nutrientsC = IntoArrayLists.nutrientsC();
          nutrientsP = IntoArrayLists.nutrientsP();
          nutrientsF = IntoArrayLists.nutrientsF();
          retrieveInfo = NutritionSearch.retrieveInfo(factor, selectionIndex, nutrientsC, nutrientsP, nutrientsF);
          name = nameIndex.get(selectionIndex);
          grams = String.format("%.0f g total", portionSize);
          carbsD = retrieveInfo.get(0);
          proteinD = retrieveInfo.get(1);
          fatD = retrieveInfo.get(2);
          carbs = String.format("%.0f g carbohydrates", carbsD);
          protein = String.format("%.0f g protein", proteinD);
          fat = String.format("%.0f g fat", fatD);
          nutritionalInfo.setText(name + "\n" + grams + "\n" + carbs + "\n" + protein + "\n" + fat);
        }

        }
        else if (command.equals("Log this")){
           loggedTodayTextArea.append(name + " -\n" + grams + "\n" + carbs + "\n" + protein + "\n" + fat +"\n");
           currentlyLogged = loggedTodayTextArea.getText();
           FileLogged.fileDaily(currentlyLogged);

           filedRemaining = FromFiles.getRemainingStorage();
           BMRCarbsT = filedRemaining.get(0);
           BMRProteinT = filedRemaining.get(1);
           BMRFatT = filedRemaining.get(2);
           ArrayList<Double> temp = TodayTracker.macrosLeft(BMRCarbsT, BMRProteinT, BMRFatT, carbsD, proteinD, fatD);
           BMRCarbsT = temp.get(0);
           BMRProteinT = temp.get(1);
           BMRFatT = temp.get(2);
           remainingTodayTextArea.setText(String.format("%.0fg carbohydrates", BMRCarbsT) + "\n"
           + String.format("%.0fg protein", BMRProteinT) + "\n" + String.format("%.0fg fat", BMRFatT));
           FileLogged.fileRemaining(BMRCarbsT, BMRProteinT, BMRFatT);
           filedTotal = FromFiles.getTotalStorage();
           BMRCarbsS = filedTotal.get(0);
           BMRProteinS = filedTotal.get(1);
           BMRFatS = filedTotal.get(2);
           ArrayList<Double> temp2 = TodayTracker.macrosTotal(BMRCarbsS, BMRProteinS, BMRFatS, carbsD, proteinD, fatD);
           BMRCarbsS = temp2.get(0);
           BMRProteinS = temp2.get(1);
           BMRFatS = temp2.get(2);
           totalTextArea.setText(String.format("%.0fg carbohydrates", BMRCarbsS) + "\n"
           + String.format("%.0fg protein", BMRProteinS) + "\n" + String.format("%.0fg fat", BMRFatS));
           FileLogged.fileTotal(BMRCarbsS, BMRProteinS, BMRFatS);
        }

        else if (command.equals("Clear logFood")){
        Clearing.clearLogFood(searchBarTextField, matchTextArea, portionSizeComboBox, customPortionSizeTextField, nutritionalInfo);
        }
        else if (command.equals("Clear enterInfo")) {
          Clearing.clearEnterInfo(weightTextField, heightTextField, ageTextField, activityLevelComboBox);
        }
        else if (command.equals("Clear macrosInfo")) {
          Clearing.clearMacrosInfo(fitnessGoalsComboBox, carbsTextArea, proteinTextArea, fatTextArea, remainingTodayTextArea);
        }
        else if(command.equals("Clear dailyLog and remainingAndTotalLog")) {
          Clearing.clearDailyLog(BMRCarbs, BMRProtein, BMRFat, loggedTodayTextArea, remainingTodayTextArea, totalTextArea);
        }
     }
  }


}
