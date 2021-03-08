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
  private JLabel headerLabel;
  private JLabel statusLabel;

  private JPanel enterInfo;
  private JTextField weightTextField;
  private JTextField heightTextField;
  private JTextField ageTextField;
  private JTextField activityLevelTextField;
  private JLabel personalInfoLabel;
  private JButton enterPersonalInfoButton;
  private JTextArea BMRTextArea;
  private double BMRValue = 1;
  private JLabel weightLabel;
  private JLabel heightLabel;
  private JLabel ageLabel;
  private JLabel weightLabelS;
  private JLabel heightLabelS;
  private JLabel ageLabelS;
  private JLabel activityLevelLabelS;
  private static final String activityLevelList[] = {"1: Sedentary", "2: Lightly active", "3: Moderately active", "4: Very active"};
	private JComboBox activityLevelComboBox;
  private int w = 1;
  private int h = 1;
  private int a = 1;

  private JPanel macrosInfo;
  private JButton fitnessGoalsButton;
  private JTextArea carbsTextArea;
  private JTextArea proteinTextArea;
  private JTextArea fatTextArea;
  private static final String fitnessGoalsList[] = {"1: Maintain", "2: Lose fat and gain muscle", "3: Lost fat and lose muscle"};
  private JComboBox fitnessGoalsComboBox;

  private JPanel logFood;
  private JTextField searchBarTextField;
  private JButton enterFoodButton;

  private JPanel dailyLog;

  private JPanel progressLog;





  public mainGUI(){
     prepareGUI();
  }
  public static void main(String[] args){
     mainGUI mainGUI = new mainGUI();
     mainGUI.showEventDemo();
  }
  private void prepareGUI(){
     mainFrame = new JFrame("IA");
     mainFrame.setSize(600,600);
     mainFrame.setLayout(new GridLayout(3, 0));

    headerLabel = new JLabel("",JLabel.CENTER );
     //statusLabel = new JLabel("",JLabel.CENTER);
     //statusLabel.setSize(40,100);

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
     progressLog = new JPanel();
     progressLog.setLayout(new FlowLayout());

     mainFrame.add(headerLabel);
     mainFrame.add(enterInfo);
     mainFrame.add(macrosInfo);
     mainFrame.add(logFood);
     mainFrame.add(dailyLog);
     mainFrame.add(progressLog);
     //mainFrame.add(statusLabel);
     mainFrame.setVisible(true);
  }
  private void showEventDemo(){
     headerLabel.setText("Welcome to Nutrition Assistant");

     personalInfoLabel = new JLabel("Please enter personal information");
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
     BMRTextArea = new JTextArea(1,4);

     
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

     enterFoodButton = new JButton("Enter");
     enterPersonalInfoButton = new JButton("Calculate BMR");
     enterPersonalInfoButton.setActionCommand("Calculate BMR");

     searchBarTextField = new JTextField(20);
     enterFoodButton.setActionCommand("Enter food");

     enterFoodButton.addActionListener(new ButtonClickListener());
     enterPersonalInfoButton.addActionListener(new ButtonClickListener());


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
     enterInfo.add(BMRTextArea);

     macrosInfo.add(fitnessGoalsComboBox);
     macrosInfo.add(fitnessGoalsButton);
     macrosInfo.add(carbsTextArea);
     macrosInfo.add(proteinTextArea);
     macrosInfo.add(fatTextArea);

     logFood.add(enterFoodButton);
     logFood.add(searchBarTextField);







     //textField.addActionListener(this);

     //textArea = new JTextArea(5, 20);
     //textArea.setEditable(false);
     //JScrollPane scrollPane = new JScrollPane(textArea);

     mainFrame.setVisible(true);


  }
  private class ButtonClickListener implements ActionListener{
     public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if(command.equals("Enter food"))  {
           statusLabel.setText("Entry: " + searchBarTextField.getText());
        }
        else if(command.equals("Calculate BMR")){
           w = Integer.parseInt(weightTextField.getText());
           h = Integer.parseInt(heightTextField.getText());
           a = Integer.parseInt(ageTextField.getText());
           String tempac = (String)activityLevelComboBox.getSelectedItem();
           int ac = Integer.parseInt(tempac.substring(0,1));
           BMRValue = NutritionalCalculator.BMRCalculator(w, h, a, ac);
           BMRTextArea.setText(String.format("%.0f", BMRValue + "calories"));
        }
        else if (command.equals("Calculate macronutrients")) {
          String tempfg = (String)fitnessGoalsComboBox.getSelectedItem();
          ArrayList<Double> m = NutritionalCalculator.macrosCalculator(BMRValue, Integer.parseInt(tempfg.substring(0,1)));
          carbsTextArea.setText(String.format("%.0f", m.get(0)) + "g carbohydrates");
          proteinTextArea.setText(String.format("%.0f", m.get(1)) + "g protein");
          fatTextArea.setText(String.format("%.0f", m.get(2)) + "g fat");
        }
     }
  }


}
