import java.util.*;
import java.util.Random;

class binarySearch {


  public static void main(String[] args) {
    Scanner userIn = new Scanner(System.in);
    //Introductions
    System.out.println("Welcome to Bubble Sort!");
    System.out.println("How long would you like your random list to be?");
    int listSize = userIn.nextInt();
    //Setting a limit on what numbers can be generated
    int min = 1;
    int max = 1000;
    Random ran = new Random();

    ArrayList <Integer> ArraySearch = new ArrayList<Integer>();
    System.out.println("Here is the unsorted list:");
    System.out.print("[ ");
    //Populating the ArrayList
    for (int i = 0; i < listSize; i ++) {
      ArraySearch.add(ran.nextInt((max - min) + 1) + min);
      System.out.print(ArraySearch.get(i) + " ");
    }
    System.out.println("]");
    //Start time
  //  double start = System.nanoTime();
    //Sorting time!
    for (int i = listSize-1; i > -1; i--){ //Starts at the highest term, ends at 0, it looks clunky written like this but it works
      for (int ii = 0; ii < i; ii++) {  //a single iteration through the ArrayList, which decreases each time (the highest/next highest value is set in place with each iteration)
        int comp1 = letsSort.get(ii);
        int comp2 = letsSort.get(ii+1);
        if (comp1 > comp2){//comparing the two values and swapping them
          ArraySearch.set(ii, comp2);
          ArraySeacrh.set(ii+1, comp1);
        }
      }
    }
    //End time
  //  double finish = System.nanoTime();
  //  double t = (finish - start) / 1000000000;

    System.out.println("Here is the sorted list:");
    System.out.print("[ ");
    for (int i = 0; i < listSize; i++){
      System.out.print(ArraySearch.get(i) + " ");
    }
    System.out.println("]");
  //  System.out.println("Sorted in " + t + " seconds.");

  System.out.println("What would you like to search for?");
  int key = userIn.next();

  //Dividing it in half and comparing
  int midPosition = listsize/2;
  if (listsize.get(midPosition) == key) {
    System.out.println(key + " was found at position " + midposition + ".");
  }


  }
}
