import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;


public class IntoArrayLists {

  public IntoArrayLists(){

  }

  public static ArrayList<String> nameIndex(){
    ArrayList <String> nameIndex = new ArrayList<String>();

      try{
        File nutritionalInfo = new File("nutritionalInfo.txt");
        BufferedReader scan = new BufferedReader(new FileReader (nutritionalInfo));
        String tempString;

        while((tempString = scan.readLine()) != null){

          String[] single = tempString.split(":");
          nameIndex.add(single[0]);

        }

      }catch(Exception e){
        e.printStackTrace();
      }

      return nameIndex;
  }

  public static ArrayList<String> nutrientsG() {
    ArrayList <String> nutrientsG = new ArrayList<String>();

      try{
        File nutritionalInfo = new File("nutritionalInfo.txt");
        BufferedReader scan = new BufferedReader(new FileReader (nutritionalInfo));
        String tempString;

        while((tempString = scan.readLine()) != null){

          String[] single = tempString.split(":");
          nutrientsG.add(single[1]);

        }

      }catch(Exception e){
        e.printStackTrace();
      }

      return nutrientsG;

  }

  public static ArrayList<String> nutrientsC() {
    ArrayList <String> nutrientsC = new ArrayList<String>();

      try{
        File nutritionalInfo = new File("nutritionalInfo.txt");
        BufferedReader scan = new BufferedReader(new FileReader (nutritionalInfo));
        String tempString;

        while((tempString = scan.readLine()) != null){

          String[] single = tempString.split(":");
          nutrientsC.add(single[2]);

        }

      }catch(Exception e){
        e.printStackTrace();
      }

      return nutrientsC;

  }

  public static ArrayList<String> nutrientsP() {
    ArrayList <String> nutrientsP = new ArrayList<String>();

      try{
        File nutritionalInfo = new File("nutritionalInfo.txt");
        BufferedReader scan = new BufferedReader(new FileReader (nutritionalInfo));
        String tempString;

        while((tempString = scan.readLine()) != null){

          String[] single = tempString.split(":");
          nutrientsP.add(single[3]);

        }

      }catch(Exception e){
        e.printStackTrace();
      }

      return nutrientsP;

  }

  public static ArrayList<String> nutrientsF() {
    ArrayList <String> nutrientsF = new ArrayList<String>();

      try{
        File nutritionalInfo = new File("nutritionalInfo.txt");
        BufferedReader scan = new BufferedReader(new FileReader (nutritionalInfo));
        String tempString;

        while((tempString = scan.readLine()) != null){

          String[] single = tempString.split(":");
          nutrientsF.add(single[4]);

        }

      }catch(Exception e){
        e.printStackTrace();
      }

      return nutrientsF;

  }


}
