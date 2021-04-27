package Lab10;
import java.awt.*;

@SuppressWarnings("serial")
class TicTacToePanel extends GamePanel {

    public enum Player{
        NONE, x, o
    }
    
    Player[][] stateOfBoard = new Player[3][3];
    
    //Creates an empty Tic-Tac-Toe board ready for play
    public TicTacToePanel() {
        super(600, 600);

        for (int row = 0; row < stateOfBoard.length; row++){
            for (int col = 0; col < stateOfBoard[0].length; col++){
                stateOfBoard[row][col] = Player.NONE;
            }
        }

    }
    protected void repaintPanel(Graphics g) {
       g.drawLine(0, 200, 600, 200);
       g.drawLine(200, 0, 200, 600);
       g.drawLine(400, 0, 400, 600);
       g.drawLine(0, 400, 600, 400);
       //g.setBackground(new Color(25, 25, 25));

        for (int row = 0; row < stateOfBoard.length; row++){
            for (int col = 0; col < stateOfBoard[0].length; col++) {
                if (stateOfBoard[row][col] == Player.x){
                    //convert [row][col] to coordinates
                    int x = (((2 * col) + 1) * (600/6));
                    int y = (((2 * row) + 1) * (600/6));
                    //draw an X on [row][col]
                    g.setColor(Color.RED);
                    g.setFont(new Font("Ink Free",Font.BOLD,105));
                    g.drawString("X", x -15, y + 20);
                }else if(stateOfBoard[row][col] == Player.o){
                    //convert [row][col] to coordinates
                    int x = (((2 * col) + 1) * (600/6));
                    int y = (((2 * row) + 1) * (600/6));
                    //draw an O on [row][col]
                    g.setColor(Color.blue);
                    g.setFont(new Font("Ink Free",Font.BOLD,105));
                    g.drawString("O", x -30, y + 25);
                    //g.drawOval(x - 50, y - 50, 100, 100);
                }
            }
        }
        

        if(stateOfBoard[0][0] == Player.x && stateOfBoard[1][0] == Player.x && stateOfBoard[2][0] == Player.x){                                         //win conditions for player X
            g.drawString("X wins!!", 300, 300);
        }else if(stateOfBoard[0][1] == Player.x && stateOfBoard[1][1] == Player.x && stateOfBoard[2][1] == Player.x){
            g.drawString("X wins!!", 300, 300);
        }else if(stateOfBoard[0][2] == Player.x && stateOfBoard[1][2] == Player.x && stateOfBoard[2][2] == Player.x){
            g.drawString("X wins!!", 300, 300);
        }else if(stateOfBoard[0][0] == Player.x && stateOfBoard[0][1] == Player.x && stateOfBoard[0][2] == Player.x){
            g.drawString("X wins!!", 300, 300);
        }else if(stateOfBoard[1][0] == Player.x && stateOfBoard[1][1] == Player.x && stateOfBoard[1][2] == Player.x){
            g.drawString("X wins!!", 300, 300);
        }else if(stateOfBoard[2][0] == Player.x && stateOfBoard[2][1] == Player.x && stateOfBoard[2][2] == Player.x){
            g.drawString("X wins!!", 300, 300);
        }else if(stateOfBoard[0][0] == Player.x && stateOfBoard[1][1] == Player.x && stateOfBoard[2][2] == Player.x){
            g.drawString("X wins!!", 300, 300);
        }else if(stateOfBoard[2][0] == Player.x && stateOfBoard[1][1] == Player.x && stateOfBoard[0][2] == Player.x){
            g.drawString("X wins!!", 300, 300);
        }else if(stateOfBoard[0][0] == Player.o && stateOfBoard[1][0] == Player.o && stateOfBoard[2][0] == Player.o){                                 //win conditions for player O
            g.drawString("O wins!!", 300, 300);
        }else if(stateOfBoard[0][1] == Player.o && stateOfBoard[1][1] == Player.o && stateOfBoard[2][1] == Player.o){
            g.drawString("O wins!!", 300, 300);
        }else if(stateOfBoard[0][2] == Player.o && stateOfBoard[1][2] == Player.o && stateOfBoard[2][2] == Player.o){
            g.drawString("O wins!!", 300, 300);
        }else if(stateOfBoard[0][0] == Player.o && stateOfBoard[0][1] == Player.o && stateOfBoard[0][2] == Player.o){
            g.drawString("O wins!!", 300, 300);
        }else if(stateOfBoard[1][0] == Player.o && stateOfBoard[1][1] == Player.o && stateOfBoard[1][2] == Player.o){
            g.drawString("O wins!!", 300, 300);
        }else if(stateOfBoard[2][0] == Player.o && stateOfBoard[2][1] == Player.o && stateOfBoard[2][2] == Player.o){
            g.drawString("O wins!!", 300, 300);
        }else if(stateOfBoard[0][0] == Player.o && stateOfBoard[1][1] == Player.o && stateOfBoard[2][2] == Player.o){
            g.drawString("O wins!!", 300, 300);
        }else if(stateOfBoard[2][0] == Player.o && stateOfBoard[1][1] == Player.o && stateOfBoard[0][2] == Player.o){
            g.drawString("O wins!!", 300, 300);
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