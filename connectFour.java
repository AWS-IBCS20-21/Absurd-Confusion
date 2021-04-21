
import java.io.*;
import java.util.*;

public class connectFour {

  String[][] grid;

  public connectFour() {
    grid = new String[8][17];
    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j< grid[i].length; j++) {
        if (j%2 == 0) {
          grid[i][j] = "|";
        }
        else {
          grid[i][j] = "_";
        }
      }
    }
  }

  public void printGrid(String[][] grid) {
    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j< grid[i].length; j++) {
        System.out.print(grid[i][j]);
      }
      System.out.println("");
    }
  }

  public void playPiece(int col, boolean player) {
    String piece = "";
    if (player) {
      piece = "x";
    }
    else {
      piece = "o";
    }
    int place = col*2 - 1;
    for (int i = 0; i < grid.length; i++) {

      if (i == 0) {
        if ((grid[i][place] == "x") || (grid[i][place] == "o")) {
          break;
        }
      }

      if (i == 7) {
        grid[i][place] = piece;
        break;
      }
      else if (grid[i+1][place] == "x") {
        grid[i][place] = piece;
        break;
      }
      else if (grid[i+1][place] == "o") {
        grid[i][place] = piece;
        break;
      }
    }
  }

  public boolean checkWin() {
    boolean winO = false;
    boolean winX = false;
    //rows
    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j< grid[i].length - 6; j++) {
        if (grid[i][j] == "o") {
          if (grid[i][j+2] == "o") {
            if (grid[i][j+4] == "o") {
              if (grid[i][j+6] == "o") {
                winO = true;
                break;
              }
            }
          }
        }
      }
    }
    //colums
    for (int i = 0; i < grid.length -3; i++) {
      for (int j = 0; j< grid[i].length; j++) {
        if (grid[i][j] == "o") {
          if (grid[i+1][j] == "o") {
            if (grid[i+2][j] == "o") {
              if (grid[i+3][j] == "o") {
                winO = true;
                break;
              }
            }
          }
        }
      }
    }

    //diag \
    for (int i = 0; i < grid.length -3; i++) {
      for (int j = 0; j< grid[i].length -6; j++) {
        if (grid[i][j] == "o") {
          if (grid[i+1][j+2] == "o") {
            if (grid[i+2][j+4] == "o") {
              if (grid[i+3][j+6] == "o") {
                winO = true;
                break;
              }
            }
          }
        }
      }
    }

    //diag /
    for (int i = 0; i < grid.length - 3; i++) {
      for (int j = 6; j< grid[i].length; j++) {
        if (grid[i][j] == "o") {
          if (grid[i+1][j-2] == "o") {
            if (grid[i+2][j-4] == "o") {
              if (grid[i+3][j-6] == "o") {
                winO = true;
                break;
              }
            }
          }
        }
      }
    }

    //rows
    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j< grid[i].length - 6; j++) {
        if (grid[i][j] == "x") {
          if (grid[i][j+2] == "x") {
            if (grid[i][j+4] == "x") {
              if (grid[i][j+6] == "x") {
                winX = true;
                break;
              }
            }
          }
        }
      }
    }
    //colums
    for (int i = 0; i < grid.length -3; i++) {
      for (int j = 0; j< grid[i].length; j++) {
        if (grid[i][j] == "x") {
          if (grid[i+1][j] == "x") {
            if (grid[i+2][j] == "x") {
              if (grid[i+3][j] == "x") {
                winX = true;
                break;
              }
            }
          }
        }
      }
    }

    //diag \
    for (int i = 0; i < grid.length -3; i++) {
      for (int j = 0; j< grid[i].length -6; j++) {
        if (grid[i][j] == "x") {
          if (grid[i+1][j+2] == "x") {
            if (grid[i+2][j+4] == "x") {
              if (grid[i+3][j+6] == "x") {
                winX = true;
                break;
              }
            }
          }
        }
      }
    }

    //diag /
    for (int i = 0; i < grid.length -3; i++) {
      for (int j = 6; j< grid[i].length; j++) {
        if (grid[i][j] == "x") {
          if (grid[i+1][j-2] == "x") {
            if (grid[i+2][j-4] == "x") {
              if (grid[i+3][j-6] == "x") {
                winX = true;
                break;
              }
            }
          }
        }
      }
    }

    if (winX) {
      System.out.println("Human Wins!!!");
      return true;
    }
    if (winO) {
      System.out.println("Computer Wins!!!");
      return true;
    }
    return false;
  }

  public static void main(String[] args) {
    System.out.println("Welcome to the Connect Four Game!");
    System.out.println("You play by typing a number 1-8 to select the column you wish to play on");

    connectFour cf = new connectFour();
    cf.printGrid(cf.grid);
    ArrayList<Integer> playerMoves = new ArrayList<Integer>();
    int playerMovesLength = 0;

    while (true) {
      System.out.println("");
      //player move
      System.out.println("\nWhich column would you like to play?");
      Scanner inp = new Scanner(System.in);
      int choice = inp.nextInt();
      System.out.println("");
      playerMoves.add(choice);
      cf.playPiece(choice, true);
      cf.printGrid(cf.grid);
      int lastMove = 0;
      int sLastMove = 0;
      int tLastMove = 0;

      //computer move
      Random r = new Random();
      playerMovesLength = playerMoves.size();
      lastMove = playerMovesLength - 1;
      sLastMove = playerMovesLength - 2;
      tLastMove = playerMovesLength - 3;
      if (playerMoves.get(lastMove) = playerMoves.get(sLastMove)
      = playerMoves.get(tLastMove)) {
        int move = playerMoves.get(lastMove);
      }
      if (playerMoves.get(lastMove) = (playerMoves.get(sLastMove) + 1)
      = (playerMoves.get(tLastMove) + 2)) {
        int hdsotls = r.nextInt(2) + 1;
        if (hdsotls == 1){
        int move = (playerMoves.get(lastMove) - 1);
      }
      if (hdsotls == 2) {
        int move = (playerMoves.get(tLastMove) + 1);
      }
      }
      if (playerMoves.get(lastMove) = (playerMoves.get(sLastMove) - 1)
      = (playerMoves.get(tLastMove) - 2)) {
        int hdsotls = r.nextInt(2) + 1;
        if (hdsotls == 1){
        int move = (playerMoves.get(lastMove) + 1);
      }
      if (hdsotls == 2) {
        int move = (playerMoves.get(tLastMove) - 1);
      }
      }

      int move = r.nextInt(8) + 1;
      System.out.println(move);
      cf.playPiece(move, false);
      cf.printGrid(cf.grid);

      if (cf.checkWin()) {
        break;
      }
    }
  }
}
