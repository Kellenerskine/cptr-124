package Lab10;
import java.awt.*;
import javax.swing.*;

@SuppressWarnings("serial")
class TicTacToePanel extends GamePanel {

    public enum Player{
        NONE, x, o
    }
    
    // TODO
    // Add instance variables as needed
    
    Player[][] stateOfBoard = new Player[3][3];


    // TODO
    // Add any additional private helper methods you need
    
    /** Creates an empty Tic-Tac-Toe board ready for play */
    public TicTacToePanel() {
        super(600, 600);  // You need to keep this statement
        // TODO

        for (int row = 0; row < stateOfBoard.length; row++){
            for (int col = 0; col < stateOfBoard[0].length; col++){
                stateOfBoard[row][col] = Player.NONE;
            }
        }

    }

    // TODO
    // Override handleMouseRelease and repaintPanel methods
    // to make a viable Tic-Tac-Toe game
    protected void repaintPanel(Graphics g) {
       g.drawLine(0, 200, 600, 200);
       g.drawLine(200, 0, 200, 600);
       g.drawLine(400, 0, 400, 600);
       g.drawLine(0, 400, 600, 400);

        for (int row = 0; row < stateOfBoard.length; row++){
            for (int col = 0; col < stateOfBoard[0].length; col++) {
                if (stateOfBoard[row][col] == Player.x){
                    //convert [row][col] to coordinates
                    int x = (((2 * col) + 1) * (600/6));
                    int y = (((2 * row) + 1) * (600/6));
                    //draw an X on [row][col]
                    g.drawString("X", x, y);
                }else if(stateOfBoard[row][col] == Player.o){
                    //convert [row][col] to coordinates
                    int x = (((2 * col) + 1) * (600/6));
                    int y = (((2 * row) + 1) * (600/6));
                    //draw an O on [row][col]
                    g.drawString("O", x, y);
                }
            }
        }

    }

    int turnCount = 0;
    protected void handleMouseRelease(int x, int y) {
        int row;
        int col;


        if (x < 200){
            col = 0;
        }else if (x < 400){
            col = 1;
        }else{
            col = 2;
        }
        if (y < 200){
            row = 0;
        }else if (y < 400){
            row = 1;
        }else{
            row = 2;
        }

        turnCount++;

        if (stateOfBoard[row][col] == Player.NONE){
            if (turnCount % 2 == 0){
                stateOfBoard[row][col] = Player.x;
            }else{
                stateOfBoard[row][col] = Player.o;
            }
        }

    }
}