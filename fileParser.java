import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;


class fileParser {


  public fileParser(){

  }
public int avgWordLength(ArrayList<String> text) {
  int sum = 0;//creating the sum
  for (int i = 0; i < text.size(); i++) {
    String word = text.get(i);
    int wordLength = word.length();
    sum = sum + wordLength;//with each iteration I add the length of each word to the total
  }

  return sum/(text.size());//divided by the total number of words, as an int
  }

  public String mostCommonWord(ArrayList<String> text) {
ArrayList <Integer> countArray = new ArrayList <Integer>();
ArrayList <String> corrWordArray = new ArrayList <String>();
String scanWord = "";
String compareWord = "";
int match = 0;
int scanLength = 0;
int compareLength = 0;
char scanChar = ' ';
char compareChar = ' ';
int inCount = 0;
for (int i = 0; i < text.size(); i++) {//moving along word  by word
  int count = 0; //resets count to 0 each iteration
  if (text.get(i).equals("")) {
  }
  else{

  scanWord=text.get(i);//sets the scan word the current element
  char[] scanWordArray = scanWord.toCharArray();//turns it into a charArray
  for(int ii = 0; ii < scanWordArray.length; ii++){//making all characters lowercase
    if (Character.isLetter(scanWordArray[ii]) && Character.isUpperCase(scanWordArray[ii])) {
      scanWordArray[ii] = Character.toLowerCase(scanWordArray[ii]);
    }
  }
  scanLength = scanWordArray.length;//variable for length of scan word array
  for (int g = i+1; g < text.size(); g++){//for loop within a loop: iterating through i and higher
    compareWord = text.get(g);//compare word is whatever word comes next
    char[] compareWordArray = compareWord.toCharArray();//turns it into a charArray
    for(int ii = 0; ii < compareWordArray.length; ii++){//making all characters lowercase
      if (Character.isLetter(compareWordArray[ii]) && Character.isUpperCase(compareWordArray[ii])) {
        compareWordArray[ii] = Character.toLowerCase(compareWordArray[ii]);
      }
    }
    compareLength = compareWordArray.length;//variable for length of compare word
    if (compareLength != scanLength){
      count = count;//nothing changes if the size doesn't even match up
    }
    else {
      for (int f = 0; f < compareLength; f++) {//another for loop iterating through the scan word array and compare word array
      scanChar = scanWordArray[f];//break down to the current char
      compareChar = compareWordArray[f];//""
      inCount = 0; //reseting inCount length each iteration
      if (scanChar == compareChar) {//if the two are equal
        inCount++;//add one to inCount
        text.set(i, "");//remove it
      }
    }
      if (inCount == scanLength) {//if every char matches, then the count increases
        count = count+1;
      }

    }
}
  }
  countArray.add(count);//add the respective count
  corrWordArray.add(scanWord);//add the corresponding word
}
int max = 0;
int numMark = 0;
for (int h = 0; h < countArray.size(); h++) {
  if (countArray.get(h) > max) {//looking for the highest value in the countArray
    max = countArray.get(h);
    numMark = h;//noting the marker
  }
}
String mostCommonWord = corrWordArray.get(numMark);
return mostCommonWord;
  }

  public String longestWordLength(ArrayList<String> text) {
    int max = 0;//creating a max
    int marker = 0;//creating a marker so I can find the value corresponding to the max
    for (int i = 0; i < text.size(); i++) {
      String word = text.get(i);
      int wordLength = word.length();//taking length of the given word
      if (wordLength>max) {//comparing it to whatver current max
        max = wordLength;//replacing these respective values if true
        marker = i;
      }
    }
    String longestWord = text.get(marker);
  return longestWord;
  }





  public static void main(String[] args) {
    fileParser p = new fileParser();
    ArrayList <String> text = new ArrayList <String>();

    try {
      File Dracula= new File("Dracula.txt");
      Scanner inp = new Scanner(Dracula);

      while (inp.hasNext()) {
String currWord = inp.next();
        currWord = currWord.replaceAll("\\p{Punct}", "");//removing all non-letter character (punctuation, namely)
        text.add(currWord);

      }
    }
    catch (FileNotFoundException e) {
      e.printStackTrace();
    }
    int x = 1;
    while (x == 1) {
System.out.println("Welcome to the Book Text Analysis of Dracula by Brahm Stoker!");
System.out.println("Which of the following would you like to know about this text?");
System.out.println("1: The average word length");
System.out.println("2: The longest word");
System.out.println("3: The most common word");
System.out.println("4: Quit");
Scanner input = new Scanner(System.in);
int choice = input.nextInt();
if (choice == 1) {
  System.out.println("The average word length of this book is " + p.avgWordLength(text) + " letters.");
}
if (choice == 2) {
  System.out.println("The longest word in this book is '" + p.longestWordLength(text) + "'.");
}
if (choice == 3) {
  System.out.println("The most common word in this book is '" + p.mostCommonWord(text)+ "'.");
}
if (choice == 4) {
  System.out.println("Thanks! See you next time!");
    x = 0;
  }
if ((choice != 1) && (choice != 2) && (choice != 3) && (choice !=4)){
  System.out.println("I clearly outlined options 1-4, which does not include your choice of " + choice + ". Try again.");
}
}



}




}
