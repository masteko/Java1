package de.fhws.bonusblatt2;

/**
 * Aufgabe3
 */
public class Aufgabe3 {
    public static void main(String[] args) {
        
        boolean[][][] tictactoe = new boolean[3][3][3];
    
        for (int i = 0; i < tictactoe.length; i++) {
            for (int j = 0; j < tictactoe[i].length; j++) {
                for (int k = 0; k < tictactoe[i][j].length; k++) {
                    tictactoe[i][j][k] = Math.random() >= 0.5 ? true : false;
                }
            }
        }

        for (int i = 0; i < tictactoe.length; i++) {
            System.out.println("Ebene " + (i + 1));
            for (int j = 0; j < tictactoe[i].length; j++) {
                for (int k = 0; k < tictactoe[i][j].length; k++) {
                   System.out.print(tictactoe[i][j][k] ? "X " : "O ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }    
}