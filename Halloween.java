import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;

class Halloween{

public static void main(String[] args) {

//Creating a random to generate the house ratings
Random randomNum = new Random();

//Creating the neighborhood matrix and giving it a dimension of 5x5
float[][] neighborhood = new float[5][5];

//Filling in the matrix with each house's respective rating
for (int i = 0; i < neighborhood.length; i++) { // i here is representative of each column, or the street number
  for (int b = 0; b < neighborhood.length; b++) { // b here is representative of each row, or the house number per the street
    neighborhood[i][b] = randomNum.nextFloat() * 10;
  }
}
System.out.println("");
System.out.println("Here are the ratings of quality of candy of each house in your neighborhood:");
System.out.println("");
char streetLet = ' ';
//Printing out the matrix
for (int bp = 0; bp < neighborhood.length; bp++) {
  //Assigning each int a letter value in order to label streets
  if (bp == 0) {streetLet = 'A';}
  if (bp == 1) {streetLet = 'B';}
  if (bp == 2) {streetLet = 'C';}
  if (bp == 3) {streetLet = 'D';}
  if (bp == 4) {streetLet = 'E';}
  System.out.println("Street " + streetLet + ": " );
  for (int ip = 0; ip < neighborhood.length; ip++) {
    System.out.print("House " + ip + ": " + neighborhood[ip][bp] + " ");
  }
  System.out.println("");
}

float rank1 = 0;
char rank1Let = ' ';
int rank1Num = 0;
//Comparing all the values in the matrix to find the highest rank
for (int i1 = 0; i1 < neighborhood.length; i1 ++){
  for (int b1 = 0; b1 < neighborhood.length; b1++){
    if (neighborhood[i1][b1] > rank1) {
      rank1 = neighborhood[i1][b1];
      //Assigning street letter to the row int
      if (b1 == 0) {rank1Let = 'A';}
      if (b1 == 1) {rank1Let = 'B';}
      if (b1 == 2) {rank1Let = 'C';}
      if (b1 == 3) {rank1Let = 'D';}
      if (b1 == 4) {rank1Let = 'E';}
      rank1Num = i1;
    }
  }
}

//Finding and replacing the highest with 0 so it doesn't interfere while I determine ranks 2, 3, 4, 5
for (int i1r = 0; i1r < neighborhood.length; i1r ++){
  for (int b1r = 0; b1r < neighborhood.length; b1r++){
    if (neighborhood[i1r][b1r] == rank1) {
      neighborhood[i1r][b1r] = 0;
    }
  }
}

float rank2 = 0;
char rank2Let = ' ';
int rank2Num = 0;
//Now finding rank 2
for (int i2 = 0; i2 < neighborhood.length; i2 ++){
  for (int b2 = 0; b2 < neighborhood.length; b2++){
    if (neighborhood[i2][b2] > rank2) {
      rank2 = neighborhood[i2][b2];
      if (b2 == 0) {rank2Let = 'A';}
      if (b2 == 1) {rank2Let = 'B';}
      if (b2 == 2) {rank2Let = 'C';}
      if (b2 == 3) {rank2Let = 'D';}
      if (b2 == 4) {rank2Let = 'E';}
      rank2Num = i2;
    }
  }
}

//Replacing it with 0
for (int i2r = 0; i2r < neighborhood.length; i2r ++){
  for (int b2r = 0; b2r < neighborhood.length; b2r++){
    if (neighborhood[i2r][b2r] == rank2) {
      neighborhood[i2r][b2r] = 0;
    }
  }
}

float rank3 = 0;
char rank3Let = ' ';
int rank3Num = 0;
//Now finding rank 3
for (int i3 = 0; i3 < neighborhood.length; i3 ++){
  for (int b3 = 0; b3 < neighborhood.length; b3++){
    if (neighborhood[i3][b3] > rank3) {
      rank3 = neighborhood[i3][b3];
      if (b3 == 0) {rank3Let = 'A';}
      if (b3 == 1) {rank3Let = 'B';}
      if (b3 == 2) {rank3Let = 'C';}
      if (b3 == 3) {rank3Let = 'D';}
      if (b3 == 4) {rank3Let = 'E';}
      rank3Num = i3;
    }
  }
}

//Replacing it with 0
for (int i3r = 0; i3r < neighborhood.length; i3r ++){
  for (int b3r = 0; b3r < neighborhood.length; b3r++){
    if (neighborhood[i3r][b3r] == rank3) {
      neighborhood[i3r][b3r] = 0;
    }
  }
}

float rank4 = 0;
char rank4Let = ' ';
int rank4Num = 0;
//Now finding rank 4
for (int i4 = 0; i4 < neighborhood.length; i4 ++){
  for (int b4 = 0; b4 < neighborhood.length; b4++){
    if (neighborhood[i4][b4] > rank4) {
      rank4 = neighborhood[i4][b4];
      if (b4 == 0) {rank4Let = 'A';}
      if (b4 == 1) {rank4Let = 'B';}
      if (b4 == 2) {rank4Let = 'C';}
      if (b4 == 3) {rank4Let = 'D';}
      if (b4 == 4) {rank4Let = 'E';}
      rank4Num = i4;
    }
  }
}

//Replacing it with 0
for (int i4r = 0; i4r < neighborhood.length; i4r ++){
  for (int b4r = 0; b4r < neighborhood.length; b4r++){
    if (neighborhood[i4r][b4r] == rank4) {
      neighborhood[i4r][b4r] = 0;
    }
  }
}

float rank5 = 0;
char rank5Let = ' ';
int rank5Num = 0;
//Lastly, finding rank 5
for (int i5 = 0; i5 < neighborhood.length; i5 ++){
  for (int b5 = 0; b5 < neighborhood.length; b5++){
    if (neighborhood[i5][b5] > rank5) {
      rank5 = neighborhood[i5][b5];
      if (b5 == 0) {rank5Let = 'A';}
      if (b5 == 1) {rank5Let = 'B';}
      if (b5 == 2) {rank5Let = 'C';}
      if (b5 == 3) {rank5Let = 'D';}
      if (b5 == 4) {rank5Let = 'E';}
      rank5Num = i5;
    }
  }
}
//Printing out the results
System.out.println("");
System.out.println("According to the ratings, here are the top 5 houses to trick or treat at:");
System.out.println("1st Place: House number " + rank1Num + " on Street " + rank1Let + ", with a score of " + rank1 + ".");
System.out.println("2nd Place: House number " + rank2Num + " on Street " + rank2Let + ", with a score of " + rank2 + ".");
System.out.println("3rd Place: House number " + rank3Num + " on Street " + rank3Let + ", with a score of " + rank3 + ".");
System.out.println("4th Place: House number " + rank4Num + " on Street " + rank4Let + ", with a score of " + rank4 + ".");
System.out.println("5th Place: House number " + rank5Num + " on Street " + rank5Let + ", with a score of " + rank5 + ".");
System.out.println("");
System.out.println("Happy Halloween!");





}

}
