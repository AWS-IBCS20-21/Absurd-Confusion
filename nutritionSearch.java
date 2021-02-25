import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;

public class nutritionSearch {

  public nutritionSearch(){

  }

  public void /*ArrayList <String>*/ searchMatches(String keyword, ArrayList<String> nameIndex, ArrayList<String> calories, ArrayList<String> nutrients) {


  }

  public static void main(String[] args) {
    nutritionSearch n = new nutritionSearch();

    ArrayList <String> nameIndex = new ArrayList<String>();
    ArrayList <String> calories = new ArrayList<String>();
    ArrayList <String> nutrients = new ArrayList<String>();
      try{
          File nutritionalInfo = new File("nutritionalInfo.txt");
          BufferedReader scan = new BufferedReader(new FileReader (nutritionalInfo));
          String tempString;

          while((tempString = scan.readLine()) != null){

              String[] single = tempString.split(":");
             nameIndex.add(single[1]);
             calories.add(single[1]);
             nutrients.add(single[2]);
          }

      }catch(Exception e){
          e.printStackTrace();
      }

  }





}
