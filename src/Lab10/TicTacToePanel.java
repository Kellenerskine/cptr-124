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
    
    // TODO
    // Add any additional private helper methods you need
    
    /** Creates an empty Tic-Tac-Toe board ready for play */
    public TicTacToePanel() {
        super(600, 600);  // You need to keep this statement
        // TODO

    }


    // TODO
    // Override handleMouseRelease and repaintPanel methods
    // to make a viable Tic-Tac-Toe game
    protected void repaintPanel(Graphics g) {
       g.drawLine(0, 200, 600, 200);
       g.drawLine(200, 0, 200, 600);
       g.drawLine(400, 0, 400, 600);
       g.drawLine(0, 400, 600, 400);

        g.drawString("X", 200, 200);
    }
    protected void handleMouseRelease(int x, int y) {
    }
}