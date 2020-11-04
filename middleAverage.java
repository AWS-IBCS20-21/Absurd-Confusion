import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;

public class middleAverage{

public static void main(String[] args) {
  int [] array = {1,4,5,7,8,3,9};
  double sum = 0;
  int start = (array.length/4);
  int end = (array.length * 3)/4;
  if (array.length % 2 != 0)  {
    end = end + 1;
  }
  System.out.println("The starting item is item " + start + ".");
  System.out.println("The ending item is item " + end + ".");


  for (int i = start; i < end; i++) {
    sum = sum + array[i];
  }

  System.out.println("The middle average is " sum/(end-start) ".");



}

}
