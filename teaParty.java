import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;

class teaParty{

public static void main(String[] args) {
  int rating = 0;
  String ratingWord = "";

  Scanner userInput = new Scanner(System.in);
  System.out.println("On a scale of 1-15, how would you rate the tea at this tea party?");
  int teaRate = userInput.nextInt();
  System.out.println("And how would you rate the candy at this tea party on the same scale?");
  int candyRate = userInput.nextInt();
  if (teaRate < 5 || candyRate < 5) {
    if (rating == 0) {
      ratingWord = "bad";
    }
    if (rating == 1) {
      ratingWord = "good";
    }
    if (rating == 2) {
      ratingWord = "great";
    }
    System.out.println("This tea party gets an overall score of " + rating + ", which is a " + ratingWord + " score.");
  }
  if (teaRate > 4 && candyRate > 4) {
    if (teaRate > (2*candyRate) || candyRate > (2*teaRate)) {
      rating = rating + 2;
      if (rating == 0) {
        ratingWord = "bad";
      }
      if (rating == 1) {
        ratingWord = "good";
      }
      if (rating == 2) {
        ratingWord = "great";
      }
        System.out.println("This tea party gets an overall score of " + rating + ", which is a " + ratingWord + " score.");
    }
    else {
      rating = rating + 1;
      if (rating == 0) {
        ratingWord = "bad";
      }
      if (rating == 1) {
        ratingWord = "good";
      }
      if (rating == 2) {
        ratingWord = "great";
      }
        System.out.println("This tea party gets an overall score of " + rating + ", which is a " + ratingWord + " score.");
    }
  }
}

}
