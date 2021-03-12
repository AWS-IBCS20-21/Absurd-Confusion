import java.io.FileWriter;
import java.io.IOException;

public class FileLogged {

  public FileLogged(){

  }

  public static void fileWeight(double weight){
    String temp = Double.toString(weight);
    try {
      FileWriter logWriter = new FileWriter("weightStorage.txt");
      logWriter.write(temp);
      logWriter.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
}


  public static void fileHeight(double height){
    String temp = Double.toString(height);
    try {
      FileWriter logWriter = new FileWriter("heightStorage.txt");
      logWriter.write(temp);
      logWriter.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
}


  public static void fileAge(int age){
    String temp = Integer.toString(age);
    try {
      FileWriter logWriter = new FileWriter("ageStorage.txt");
      logWriter.write(temp);
      logWriter.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
}

public static void fileActivityLevel(int activityLevel){
  String temp = Integer.toString(activityLevel);
  try {
    FileWriter logWriter = new FileWriter("activityLevelStorage.txt");
    logWriter.write(temp);
    logWriter.close();
  } catch (IOException e) {
    e.printStackTrace();
  }
}


  public static void fileBMR(double BMRValue){
    String temp = Double.toString(BMRValue);
      try {
        FileWriter logWriter = new FileWriter("BMRStorage.txt");
        logWriter.write(temp);
        logWriter.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
  }

  public static void fileFitnessGoal(int fitnessGoal){
    String temp = Integer.toString(fitnessGoal);
    try {
      FileWriter logWriter = new FileWriter("fitnessGoalStorage.txt");
      logWriter.write(temp);
      logWriter.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
  public static void fileMacrosCarbs(double BMRCarbs){
      try {
        FileWriter logWriter = new FileWriter("macrosStorageCarbs.txt");
        logWriter.write(Double.toString(BMRCarbs));
        logWriter.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
  }

  public static void fileMacrosProtein(double BMRProtein){
      try {
        FileWriter logWriter = new FileWriter("macrosStorageProtein.txt");
        logWriter.write(Double.toString(BMRProtein));
        logWriter.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
  }

  public static void fileMacrosFat(double BMRFat){
      try {
        FileWriter logWriter = new FileWriter("macrosStorageFat.txt");
        logWriter.write(Double.toString(BMRFat));
        logWriter.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
  }

  public static void fileDaily(String currentlyLogged) {
    try {
      FileWriter logWriter = new FileWriter("dailyStorage.txt");
      logWriter.write(currentlyLogged);
      logWriter.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
 }

 public static void fileRemaining(double BMRCarbsT, double BMRProteinT,
 double BMRFatT){
     try {
       FileWriter logWriter = new FileWriter("remainingStorage.txt");
       logWriter.write(Double.toString(BMRCarbsT) + "\n"
       + Double.toString(BMRProteinT) + "\n" + Double.toString(BMRFatT));
       logWriter.close();
     } catch (IOException e) {
       e.printStackTrace();
     }
 }

 public static void fileTotal(double BMRCarbsS, double BMRProteinS,
 double BMRFatS){
     try {
       FileWriter logWriter = new FileWriter("totalStorage.txt");
       logWriter.write(Double.toString(BMRCarbsS) + "\n"
       + Double.toString(BMRProteinS) + "\n" + Double.toString(BMRFatS));
       logWriter.close();
     } catch (IOException e) {
       e.printStackTrace();
     }
 }


}
