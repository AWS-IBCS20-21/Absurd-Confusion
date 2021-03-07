import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;

public class progressTracker {

public progressTracker(){

}

public ArrayList<String> saveAsStart(double weight, double bodyFatPercentage, double Hips, double Waist, double LArm, double RArm, double RThigh, double LThigh, double RCalf, double LCalf, double Neck, double Shoulders, double Chest) {
  ArrayList<String> startingPoint;
  startingPoint.add(weight);
  startingPoint.add(bodyFatPercentage);
  startingPoint.add(Neck);
  startingPoint.add(Shoulders);
  startingPoint.add(Chest);
  startingPoint.add(Hips);
  startingPoint.add(Waist);
  startingPoint.add(RArm);
  startingPoint.add(LArm);
  startingPoint.add(RThigh);
  startingPoint.add(LThigh);
  startingPoint.add(RCalf);
  startingPoint.add(LCalf);

  return startingPoint;

}

public ArrayList<String> update(double weight, double bodyFatPercentage, double Hips, double Waist, double LArm, double RArm, double RThigh, double LThigh, double RCalf, double LCalf, double Neck, double Shoulders, double Chest){
ArrayList<String> currentMeasurements;
currentMeasurements.add(weight);
currentMeasurements.add(bodyFatPercentage);
currentMeasurements.add(Neck);
currentMeasurements.add(Shoulders);
currentMeasurements.add(Chest);
currentMeasurements.add(Hips);
currentMeasurements.add(Waist);
currentMeasurements.add(RArm);
currentMeasurements.add(LArm);
currentMeasurements.add(RThigh);
currentMeasurements.add(LThigh);
currentMeasurements.add(RCalf);
currentMeasurements.add(LCalf);

return currentMeasurements;

}

public ArrayList<String> generateReport(ArrayList<String> currentMeasurements, ArrayList<String> startingPoint) {
  ArrayList<String> report;
  double startp;
  double currentp;
  double diff;
  for (int i = 0; i < currentMeasurements.size(); i++){
    startp = startingPoint.get(i);
    currentp = currentMeasurements.get(i);
    diff = startp - currentp;
    report.add(startp + ":" + currentp + ":" + difference);
  }

  return report;
}
