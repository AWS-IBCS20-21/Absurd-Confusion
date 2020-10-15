import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;

class somePractice {

public somePractice() {

}



public static void main(String[] args) {
int counter = -1;
Scanner scanner = new Scanner(System.in);
String string = scanner.next();
char[] charArray = string.toCharArray();

int length = charArray.length;
if (length<3) {
  System.out.println("String is too short. String must be three or more characters long.");
}
else {

  for(int i = 0; i < length; i++){
    if (Character.isLetter(charArray[i]) && Character.isUpperCase(charArray[i])) {
      charArray[i] = Character.toLowerCase(charArray[i]);
    }
  }

  String prefix = "" + charArray[0] + charArray[1];
  System.out.println("The prefix is " + prefix + ".");

for(int i = 0; i < length; i++) {

if (i+1==length) {
  if (counter < 1) {
  System.out.println("The prefix appears 0 times.");
}
}

else{
  String newString = "" + charArray[i] + charArray[i+1];

  if (prefix.equals(newString)) {
    counter++;
  }
}


}
if (counter > 0) {
System.out.println("The prefix '" + prefix + "' appears " + counter + " times in the string '" + string + "'.");
}

}



}

}
