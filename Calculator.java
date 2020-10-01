import java.util.*;
class Calculator  {

  public Calculator() {

  }

  public double add(double add1, double add2) {
    double result = add1 + add2;
    return result;
  }

public double multiply(double mult1, double mult2) {
  double result = mult1 * mult2;
  return result;
}

public double exponentiate(double base, double power) {
  double result = 1;
  for (int i = 0; i < power; i++) {
    result = base*result;
  }
  return result;
}

public static void main(String[] args) {
  Calculator n = new Calculator();
  int x = 0;
  while (x==0) {
System.out.println("Welcome to the Mini Calculator.");
System.out.println("Select a function.");
System.out.println("1: Add");
System.out.println("2: Multiply");
System.out.println("3: Exponentiate");
System.out.println("4: Quit");

Scanner userInput = new Scanner(System.in);
int choice = userInput.nextInt();

if (choice==1) {
  System.out.println("What is the first number you'd like to add?");
  double add1 = userInput.nextDouble();
  System.out.println("What is the second number you'd like to add?");
  double add2 = userInput.nextDouble();
  System.out.print(add1 + " + " + add2 + " = ");
  System.out.println(n.add(add1, add2));
}

if (choice==2) {
  System.out.println("What is the first number you'd like to multiply?");
  double mult1 = userInput.nextDouble();
  System.out.println("What is the second number you'd like to multiply?");
  double mult2 = userInput.nextDouble();
  System.out.print(mult1 + " * " + mult2 + " = ");
  System.out.println(n.multiply(mult1, mult2));
}

if (choice==3) {
  System.out.println("What is the base number you'd like to exponentiate?");
  double base = userInput.nextDouble();
  System.out.println("And to what power?");
  double power = userInput.nextDouble();
  System.out.print(base + " ^ " + power + " = ");
  System.out.println(n.exponentiate(base, power));
}

if (choice==4){
  System.out.println("Thank you for using the Mini Calculator!");
  x = 1;
}





  }
}

}
