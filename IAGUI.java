import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;

public class IAGUI {


  public static void main(String[] args) {
    JFrame newFrame = new JFrame("IA GUI");
    newFrame.setVisible(true);
    newFrame.setSize(900,900);
    newFrame.setLayout(null);

  JButton lonelyButton = new JButton("GUI BEGINS");
  newFrame.add(lonelyButton);
  lonelyButton.setBounds(450,450, 200, 100);

        newFrame.addWindowListener(new WindowAdapter() {
           public void windowClosing(WindowEvent windowEvent){
              System.exit(0);
           }
        });

}
}
