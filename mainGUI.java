import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;

public class mainGUI {

  private JFrame mainFrame;

  private JPanel enterInfo;
  private JLabel welcomeLabel;
  private JTextField weightTextField;
  private JTextField heightTextField;
  private JTextField ageTextField;
  private JTextField activityLevelTextField;
  private JLabel personalInfoLabel;
  private JButton enterPersonalInfoButton;
  private double BMRValue = 0;
  private JLabel weightLabel;
  private JLabel heightLabel;
  private JLabel ageLabel;
  private JLabel weightLabelS;
  private JLabel heightLabelS;
  private JLabel ageLabelS;
  private JLabel activityLevelLabelS;
  private static final String activityLevelList[] = {"1: Sedentary", "2: Lightly active", "3: Moderately active", "4: Very active"};
	private JComboBox activityLevelComboBox;
  private JButton clearEnterInfoButton;

  private JPanel macrosInfo;
  private JButton fitnessGoalsButton;
  private JTextArea carbsTextArea;
  private JTextArea proteinTextArea;
  private JTextArea fatTextArea;
  private static final String fitnessGoalsList[] = {"1: Maintain", "2: Lose fat and gain muscle", "3: Lost fat and lose muscle"};
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


  private JPanel dailyLog;
  private JLabel dailyLogLabel;
  private JLabel remainingTodayLabel;
  private JTextArea remainingTodayTextArea;
  private JButton clearDailyLogButton;
  private int i = -1;
  private JTextArea totalTextArea;
  private JLabel totalLabel;

  private JPanel todayTracked;
  private JLabel loggedTodayLabel;
  private JTextArea loggedTodayTextArea;

  private JPanel progressLog1;
  private JPanel progressLog2;
  private JPanel progressLog3;
  private double weightss;
  private double bodyFatPercentagess;
  private double Hipsss;
  private double Waistss;
  private double LArmss;
  private double RArmss;
  private double RThighss;
  private double LThighss;
  private double RCalfss;
  private double LCalfss;
  private double Shouldersss;
  private double Chestss;
  private double weightcc;
  private double bodyFatPercentagecc;
  private double Hipscc;
  private double Waistcc;
  private double LArmcc;
  private double RArmcc;
  private double RThighcc;
  private double LThighcc;
  private double RCalfcc;
  private double LCalfcc;
  private double Shoulderscc;
  private double Chestcc;
  private JLabel sweighto;
  private JLabel sbodyFatPercentageo;
  private JLabel sHipso;
  private JLabel sWaisto;
  private JLabel sLArmo;
  private JLabel sRArmo;
  private JLabel sRThigho;
  private JLabel sLThigho;
  private JLabel sRCalfo;
  private JLabel sLCalfo;
  private JLabel sShoulderso;
  private JLabel sChesto;
  private JTextArea sweight;
  private JTextArea sbodyFatPercentage;
  private JTextArea sHips;
  private JTextArea sWaist;
  private JTextArea sLArm;
  private JTextArea sRArm;
  private JTextArea sRThigh;
  private JTextArea sLThigh;
  private JTextArea sRCalf;
  private JTextArea sLCalf;
  private JTextArea sShoulders;
  private JTextArea sChest;
  private JLabel sweightu;
  private JLabel sbodyFatPercentageu;
  private JLabel sHipsu;
  private JLabel sWaistu;
  private JLabel sLArmu;
  private JLabel sRArmu;
  private JLabel sRThighu;
  private JLabel sLThighu;
  private JLabel sRCalfu;
  private JLabel sLCalfu;
  private JLabel sShouldersu;
  private JLabel sChestu;
  private JLabel cweighto;
  private JLabel cbodyFatPercentageo;
  private JLabel cHipso;
  private JLabel cWaisto;
  private JLabel cLArmo;
  private JLabel cRArmo;
  private JLabel cRThigho;
  private JLabel cLThigho;
  private JLabel cRCalfo;
  private JLabel cLCalfo;
  private JLabel cShoulderso;
  private JLabel cChesto;
  private JTextArea cweight;
  private JTextArea cbodyFatPercentage;
  private JTextArea cHips;
  private JTextArea cWaist;
  private JTextArea cLArm;
  private JTextArea cRArm;
  private JTextArea cRThigh;
  private JTextArea cLThigh;
  private JTextArea cRCalf;
  private JTextArea cLCalf;
  private JTextArea cShoulders;
  private JTextArea cChest;
  private JLabel cweightu;
  private JLabel cbodyFatPercentageu;
  private JLabel cHipsu;
  private JLabel cWaistu;
  private JLabel cLArmu;
  private JLabel cRArmu;
  private JLabel cRThighu;
  private JLabel cLThighu;
  private JLabel cRCalfu;
  private JLabel cLCalfu;
  private JLabel cShouldersu;
  private JLabel cChestu;
  private JLabel dweight;
  private JLabel dbodyFatPercentage;
  private JLabel dHips;
  private JLabel dWaist;
  private JLabel dLArm;
  private JLabel dRArm;
  private JLabel dRThigh;
  private JLabel dLThigh;
  private JLabel dRCalf;
  private JLabel dLCalf;
  private JLabel dShoulders;
  private JLabel dChest;
  private JLabel enterStartLabel;
  private JButton enterStartButton;
  private JButton updateStartButton;







  public mainGUI(){
     prepareGUI();
  }
  public static void main(String[] args){
     mainGUI mainGUI = new mainGUI();
     mainGUI.showEventDemo();
  }
  private void prepareGUI(){
     mainFrame = new JFrame("IA");
     mainFrame.setSize(900,600);
     mainFrame.setLayout(new GridLayout(2, 2));



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
     todayTracked = new JPanel();
     todayTracked.setLayout(new FlowLayout());
     progressLog1 = new JPanel();
     progressLog1.setLayout(new FlowLayout());
     progressLog2 = new JPanel();
     progressLog2.setLayout(new FlowLayout());
     progressLog3 = new JPanel();
     progressLog3.setLayout(new FlowLayout());

     mainFrame.add(enterInfo);
     mainFrame.add(macrosInfo);
     mainFrame.add(logFood);
     mainFrame.add(dailyLog);
     mainFrame.add(todayTracked);
     mainFrame.add(progressLog1);
     mainFrame.add(progressLog2);
     mainFrame.add(progressLog3);
     mainFrame.setVisible(true);
  }
  private void showEventDemo(){

     //enterInfo
     welcomeLabel = new JLabel("Welcome to Nutrition Assistant! \n");
     personalInfoLabel = new JLabel("Please enter personal information:");
     weightLabelS = new JLabel("Weight:");
     weightTextField = new JTextField(3);
     weightLabel = new JLabel("lbs  ");
     heightLabelS = new JLabel("Height:");
     heightTextField = new JTextField(3);
     heightLabel = new JLabel("inches  ");
     ageLabelS = new JLabel("Age:");
     ageTextField = new JTextField(3);
     ageLabel = new JLabel("years  ");
     activityLevelLabelS = new JLabel("Activity level:");
     activityLevelComboBox = new JComboBox(activityLevelList);
     enterPersonalInfoButton = new JButton("Enter information");
     enterPersonalInfoButton.setActionCommand("Calculate BMR");
     enterPersonalInfoButton.addActionListener(new ButtonClickListener());
     clearEnterInfoButton = new JButton("Reset");
     clearEnterInfoButton.setActionCommand("Clear enterInfo");
     clearEnterInfoButton.addActionListener(new ButtonClickListener());

     //macrosInfo
     macrosInfoLabel = new JLabel("Please specify your fitness goals:");
     fitnessGoalsComboBox = new JComboBox(fitnessGoalsList);
     fitnessGoalsButton = new JButton("Calculate macronutrients");
     fitnessGoalsButton.setActionCommand("Calculate macronutrients");
     fitnessGoalsButton.addActionListener(new ButtonClickListener());
     carbsTextArea = new JTextArea(1, 5);
     carbsTextArea.setEditable(false);
     proteinTextArea = new JTextArea(1, 5);
     proteinTextArea.setEditable(false);
     fatTextArea = new JTextArea(1, 5);
     fatTextArea.setEditable(false);
     clearMacrosInfoButton = new JButton("Reset");
     clearMacrosInfoButton.setActionCommand("Clear macrosInfo");
     clearMacrosInfoButton.addActionListener(new ButtonClickListener());

     //logFood
     logFoodLabel = new JLabel("Log a food");
     searchBarTextField = new JTextField(20);
     enterFoodButton = new JButton("Enter");
     enterFoodButton.setActionCommand("Enter food");
     enterFoodButton.addActionListener(new ButtonClickListener());
     matchTextArea = new JTextArea(1, 7);
     matchTextArea.setEditable(false);
     confirmMatch = new JButton("Confirm match");
     confirmMatch.setActionCommand("Confirm match");
     confirmMatch.addActionListener(new ButtonClickListener());
     portionSizeComboBox = new JComboBox();
     customPortionSizeTextField = new JTextField(3);
     customPortionSizeLabel = new JLabel("g");
     confirmPortionButton = new JButton("Confirm portion size");
     confirmPortionButton.setActionCommand("Confirm portion size");
     confirmPortionButton.addActionListener(new ButtonClickListener());
     enterCustomPortionLabel = new JLabel("Enter custom value here:");
     nutritionalInfo = new JTextArea(5, 10);
     nutritionalInfo.setEditable(false);
     logFoodButton = new JButton("Log this");
     logFoodButton.setActionCommand("Log this");
     logFoodButton.addActionListener(new ButtonClickListener());
     clearLogFoodButton = new JButton("Reset");
     clearLogFoodButton.setActionCommand("Clear logFood");
     clearLogFoodButton.addActionListener(new ButtonClickListener());

     //dailyLog
     dailyLogLabel = new JLabel("                      Daily log                      ");
     remainingTodayLabel = new JLabel("Remaining macronutrients today:");
     remainingTodayTextArea = new JTextArea(3, 10);
     clearDailyLogButton = new JButton("Reset");
     clearDailyLogButton.setActionCommand("Clear dailyLog");
     clearDailyLogButton.addActionListener(new ButtonClickListener());
     totalTextArea = new JTextArea(3, 10);
     totalLabel = new JLabel("Total macronutrients today:");

     //todayTracked
     loggedTodayLabel = new JLabel("Logged today:");
     loggedTodayTextArea = new JTextArea(6, 10);

     //progressLog1
     sweighto = new JLabel("Weight:");
     sbodyFatPercentageo = new JLabel("Body fat percentage:");
     sHipso = new JLabel("Hips:");
     sWaisto = new JLabel("Waist");
     sLArmo = new JLabel("Left arm:");
     sRArmo = new JLabel("Right arm:");
     sRThigho = new JLabel("Right thigh:");
     sLThigho = new JLabel("Left thigh:");
     sRCalfo = new JLabel("Right calf:");
     sLCalfo = new JLabel("Left calf:");
     sShoulderso = new JLabel("Shoulders:");
     sChesto = new JLabel("Chest:");
     sweightu = new JLabel("lbs");
     sbodyFatPercentageu = new JLabel("%");
     sHipsu = new JLabel("in");
     sWaistu = new JLabel("in");
     sLArmu = new JLabel("in");
     sRArmu = new JLabel("in");
     sRThighu = new JLabel("in");
     sLThighu = new JLabel("in");
     sRCalfu = new JLabel("in");
     sLCalfu = new JLabel("in");
     sShouldersu = new JLabel("in");
     sChestu = new JLabel("in");
     sweighto = new JLabel("Weight:");
     sbodyFatPercentageo = new JLabel("Body fat percentage:");
     sHips = new JTextArea(1,3);
     sHips.setEditable(false);
     sWaist = new JTextArea(1,3);
     sWaist.setEditable(false);
     sLArm = new JTextArea(1,3);
     sLArm.setEditable(false);
     sRArm = new JTextArea(1,3);
     sRArm.setEditable(false);
     sRThigh = new JTextArea(1,3);
     sRThigh.setEditable(false);
     sLThigh = new JTextArea(1,3);
     sLThigh.setEditable(false);
     sRCalf = new JTextArea(1,3);
     sRCalf.setEditable(false);
     sLCalf = new JTextArea(1,3);
     sLCalf.setEditable(false);
     sShoulders = new JTextArea(1,3);
     sShoulders.setEditable(false);
     sChest = new JTextArea(1,3);
     sChest.setEditable(false);
     enterStartLabel = new JLabel("Starting measurements:");
     enterStartButton = new JButton("Edit");
     enterStartButton.setActionCommand("Edit start");
     enterStartButton.addActionListener(new ButtonClickListener());
     updateStartButton = new JButton("Update measurements");
     updateStartButton.setActionCommand("Update start");
     updateStartButton.addActionListener(new ButtonClickListener());



     enterInfo.add(welcomeLabel);
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
     dailyLog.add(remainingTodayLabel);
     dailyLog.add(remainingTodayTextArea);
     dailyLog.add(totalLabel);
     dailyLog.add(totalTextArea);
     dailyLog.add(clearDailyLogButton);

     todayTracked.add(loggedTodayLabel);
     todayTracked.add(loggedTodayTextArea);

     progressLog1.add(enterStartLabel);
     progressLog1.add(enterStartButton);
      progressLog1.add(sweighto);
     progressLog1.add(sweight);
     progressLog1.add(sweightu);
     progressLog1.add(sbodyFatPercentageo);
     progressLog1.add(sbodyFatPercentage);
     progressLog1.add(sbodyFatPercentageu);
     progressLog1.add(sWaisto);
     progressLog1.add(sWaist);
     progressLog1.add(sWaistu);
     progressLog1.add(sHipso);
     progressLog1.add(sHips);
     progressLog1.add(sHipsu);
     progressLog1.add(sChesto);
     progressLog1.add(sChest);
     progressLog1.add(sChestu);
     progressLog1.add(sShoulderso);
     progressLog1.add(sShoulders);
     progressLog1.add(sShouldersu);
     progressLog1.add(sRArmo);
     progressLog1.add(sRArm);
     progressLog1.add(sRArmu);
     progressLog1.add(sLArmo);
     progressLog1.add(sLArm);
     progressLog1.add(sLArmu);
     progressLog1.add(sRThigho);
     progressLog1.add(sRThigh);
     progressLog1.add(sRThighu);
     progressLog1.add(sLThigho);
     progressLog1.add(sLThigh);
     progressLog1.add(sLThighu);
     progressLog1.add(sRCalfo);
     progressLog1.add(sRCalf);
     progressLog1.add(sRCalfu);
     progressLog1.add(sLCalfo);
     progressLog1.add(sLCalf);
     progressLog1.add(sLCalfu);
     progressLog1.add(updateStartButton);




     mainFrame.setVisible(true);


  }
  private class ButtonClickListener implements ActionListener{
     public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if(command.equals("Enter food"))  {
          if (searchBarTextField.getText().isEmpty()){
            matchTextArea.setText("No match found.");
          }
          else {
           String keyword = searchBarTextField.getText();
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
           if (weightTextField.getText().isEmpty() || heightTextField.getText().isEmpty() || ageTextField.getText().isEmpty()){
             BMRValue = 0;
           }
           else {
           int w = Integer.parseInt(weightTextField.getText());
           int h = Integer.parseInt(heightTextField.getText());
           int a = Integer.parseInt(ageTextField.getText());
           String tempac = (String)activityLevelComboBox.getSelectedItem();
           int ac = Integer.parseInt(tempac.substring(0,1));
           BMRValue = NutritionalCalculator.BMRCalculator(w, h, a, ac);
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
          BMRCarbsT = BMRCarbs;
          BMRProteinT = BMRProtein;
          BMRFatT = BMRFat;
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
          if (tempPortion.equals("Custom")) {
            portionSize = Double.parseDouble(customPortionSizeTextField.getText());
          }
          else {
            portionSize = tempDefaults.get(portionSizeComboBox.getSelectedIndex());
          }
          double factor = portionSize/Double.parseDouble(nutrientsG.get(selectionIndex));
          nutrientsC = IntoArrayLists.nutrientsC();
          nutrientsP = IntoArrayLists.nutrientsP();
          nutrientsF = IntoArrayLists.nutrientsF();
          name = nameIndex.get(selectionIndex);
          grams = String.format("%.0f g total", portionSize);
          carbsD = Double.parseDouble(nutrientsC.get(selectionIndex)) * factor;
          proteinD = Double.parseDouble(nutrientsP.get(selectionIndex)) * factor;
          fatD = Double.parseDouble(nutrientsF.get(selectionIndex)) * factor;
          carbs = String.format("%.0f g carbohydrates", carbsD);
          protein = String.format("%.0f g protein", proteinD);
          fat = String.format("%.0f g fat", fatD);

          nutritionalInfo.setText(name + "\n" + grams + "\n" + carbs + "\n" + protein + "\n" + fat);

        }
        else if (command.equals("Log this")){
           loggedTodayTextArea.append(name + " - " + grams + ", " + carbs + ", " + protein + ", " + fat + "\n");

           ArrayList<Double> temp = DailyTracker.macrosLeft(BMRCarbsT, BMRProteinT, BMRFatT, carbsD, proteinD, fatD);
           BMRCarbsT = temp.get(0);
           BMRProteinT = temp.get(1);
           BMRFatT = temp.get(2);
           remainingTodayTextArea.setText(String.format("%.0fg carbohydrates", BMRCarbsT) + "\n"
           + String.format("%.0fg protein", BMRProteinT) + "\n" + String.format("%.0fg fat", BMRFatT));
           ArrayList<Double> temp2 = DailyTracker.macrosTotal(BMRCarbsS, BMRProteinS, BMRFatS, carbsD, proteinD, fatD);
           BMRCarbsS = temp2.get(0);
           BMRProteinS = temp2.get(1);
           BMRFatS = temp2.get(2);
           totalTextArea.setText(String.format("%.0fg carbohydrates", BMRCarbsS) + "\n"
           + String.format("%.0fg protein", BMRProteinS) + "\n" + String.format("%.0fg fat", BMRFatS));
        }
        else if (command.equals("Clear logFood")){
        Clearing.clearLogFood(searchBarTextField, matchTextArea, portionSizeComboBox, customPortionSizeTextField, nutritionalInfo);
        }
        else if (command.equals("Clear enterInfo")) {
          Clearing.clearEnterInfo(weightTextField, heightTextField, ageTextField, activityLevelComboBox);
        }
        else if (command.equals("Clear macrosInfo")) {
          Clearing.clearMacrosInfo(fitnessGoalsComboBox, carbsTextArea, proteinTextArea, fatTextArea);
        }
        else if(command.equals("Clear dailyLog")) {
          Clearing.clearDailyLog(loggedTodayTextArea, remainingTodayTextArea, totalTextArea);
        }
     }
  }


}
