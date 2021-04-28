//package Lab10;
import java.awt.*;

/*TODO
 - wipe screen to display win msg
 - add a new game button
 - add a exit button after the game ends
*/

@SuppressWarnings("serial")
class TicTacToePanel extends GamePanel {

    public enum Player{
        NONE, x, o
    }
    
    Player[][] stateOfBoard = new Player[3][3];
    
    //Creates an empty Tic-Tac-Toe board ready for play
    public TicTacToePanel() {
        super(600, 700);

        for (int row = 0; row < stateOfBoard.length; row++){
            for (int col = 0; col < stateOfBoard[0].length; col++){
                stateOfBoard[row][col] = Player.NONE;
            }
        }

    }

    protected void repaintPanel(Graphics g) {

        int numWinsX = 0;
        int numWinsO = 0;

        g.drawRect(0,0,600,600);
        g.setColor(Color.WHITE);
        g.fillRect(0,0,600,600);

        g.setColor(Color.BLACK);
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
            g.drawRect(0,0,600,600);
            g.setColor(Color.GRAY);
            //g.fillRect(0,0,600,600);
            g.setColor(Color.RED);
            g.drawString("X wins!!", 150, 300);
            g.setColor(Color.BLACK);
            g.drawRect(252,402,100,25); //button shadow
            g.fillRect(252,402,100,25);
            g.setColor(Color.YELLOW);
            g.drawRect(250,400,100,25); //sketchy button
            g.fillRect(250,400,100,25);
            g.setFont(new Font("Ink Free",Font.BOLD,20));
            g.setColor(Color.BLACK);
            g.drawString("NEW GAME", 249, 421);
            g.setColor(Color.ORANGE);
            g.drawRect(100, 0, 10, 600);
            g.fillRect(100, 0, 10, 600);
        }else if(stateOfBoard[0][1] == Player.x && stateOfBoard[1][1] == Player.x && stateOfBoard[2][1] == Player.x){
            g.drawRect(0,0,600,600);
            g.setColor(Color.GRAY);
            //g.fillRect(0,0,600,600);
            g.setColor(Color.RED);
            g.drawString("X wins!!", 150, 300);
            g.setColor(Color.BLACK);
            g.drawRect(252,402,100,25); //button shadow
            g.fillRect(252,402,100,25);
            g.setColor(Color.YELLOW);
            g.drawRect(250,400,100,25); //sketchy button
            g.fillRect(250,400,100,25);
            g.setFont(new Font("Ink Free",Font.BOLD,20));
            g.setColor(Color.BLACK);
            g.drawString("NEW GAME", 249, 421);
            g.setColor(Color.ORANGE);
            g.drawRect(300, 0, 10, 600);
            g.fillRect(300, 0, 10, 600);
        }else if(stateOfBoard[0][2] == Player.x && stateOfBoard[1][2] == Player.x && stateOfBoard[2][2] == Player.x){
            g.drawRect(0,0,600,600);
            g.setColor(Color.GRAY);
            //g.fillRect(0,0,600,600);
            g.setColor(Color.RED);
            g.drawString("X wins!!", 150, 300);
            g.setColor(Color.BLACK);
            g.drawRect(252,402,100,25); //button shadow
            g.fillRect(252,402,100,25);
            g.setColor(Color.YELLOW);
            g.drawRect(250,400,100,25); //sketchy button
            g.fillRect(250,400,100,25);
            g.setFont(new Font("Ink Free",Font.BOLD,20));
            g.setColor(Color.BLACK);
            g.drawString("NEW GAME", 249, 421);
            g.setColor(Color.ORANGE);
            g.drawRect(500, 0, 10, 600);
            g.fillRect(500, 0, 10, 600);
        }else if(stateOfBoard[0][0] == Player.x && stateOfBoard[0][1] == Player.x && stateOfBoard[0][2] == Player.x){
            g.drawRect(0,0,600,600);
            g.setColor(Color.GRAY);
            //g.fillRect(0,0,600,600);
            g.setColor(Color.RED);
            g.drawString("X wins!!", 150, 300);
            g.setColor(Color.BLACK);
            g.drawRect(252,402,100,25); //button shadow
            g.fillRect(252,402,100,25);
            g.setColor(Color.YELLOW);
            g.drawRect(250,400,100,25); //sketchy button
            g.fillRect(250,400,100,25);
            g.setFont(new Font("Ink Free",Font.BOLD,20));
            g.setColor(Color.BLACK);
            g.drawString("NEW GAME", 249, 421);
            g.setColor(Color.ORANGE);
            g.drawRect(0, 100, 600, 10);
            g.fillRect(0, 100, 600, 10);
        }else if(stateOfBoard[1][0] == Player.x && stateOfBoard[1][1] == Player.x && stateOfBoard[1][2] == Player.x){
            g.drawRect(0,0,600,600);
            g.setColor(Color.GRAY);
            //g.fillRect(0,0,600,600);
            g.setColor(Color.RED);
            g.drawString("X wins!!", 150, 300);
            g.setColor(Color.BLACK);
            g.drawRect(252,402,100,25); //button shadow
            g.fillRect(252,402,100,25);
            g.setColor(Color.YELLOW);
            g.drawRect(250,400,100,25); //sketchy button
            g.fillRect(250,400,100,25);
            g.setFont(new Font("Ink Free",Font.BOLD,20));
            g.setColor(Color.BLACK);
            g.drawString("NEW GAME", 249, 421);
            g.setColor(Color.ORANGE);
            g.drawRect(0, 300, 600, 10);
            g.fillRect(0, 300, 600, 10);
        }else if(stateOfBoard[2][0] == Player.x && stateOfBoard[2][1] == Player.x && stateOfBoard[2][2] == Player.x){
            g.drawRect(0,0,600,600);
            g.setColor(Color.GRAY);
            //g.fillRect(0,0,600,600);
            g.setColor(Color.RED);
            g.drawString("X wins!!", 150, 300);
            g.setColor(Color.BLACK);
            g.drawRect(252,402,100,25); //button shadow
            g.fillRect(252,402,100,25);
            g.setColor(Color.YELLOW);
            g.drawRect(250,400,100,25); //sketchy button
            g.fillRect(250,400,100,25);
            g.setFont(new Font("Ink Free",Font.BOLD,20));
            g.setColor(Color.BLACK);
            g.drawString("NEW GAME", 249, 421);
            g.setColor(Color.ORANGE);
            g.drawRect(0, 500, 600, 10);
            g.fillRect(0, 500, 600, 10);
        }else if(stateOfBoard[0][0] == Player.x && stateOfBoard[1][1] == Player.x && stateOfBoard[2][2] == Player.x){
            g.drawRect(0,0,600,600);
            g.setColor(Color.GRAY);
            //g.fillRect(0,0,600,600);
            g.setColor(Color.RED);
            g.drawString("X wins!!", 150, 300);
            g.setColor(Color.BLACK);
            g.drawRect(252,402,100,25); //button shadow
            g.fillRect(252,402,100,25);
            g.setColor(Color.YELLOW);
            g.drawRect(250,400,100,25); //sketchy button
            g.fillRect(250,400,100,25);
            g.setFont(new Font("Ink Free",Font.BOLD,20));
            g.setColor(Color.BLACK);
            g.drawString("NEW GAME", 249, 421);
            g.setColor(Color.ORANGE);
            g.drawLine(0, 0, 600, 600);
            g.drawLine(1, 0, 601, 600);
            g.drawLine(2, 0, 602, 600);
            g.drawLine(3, 0, 603, 600);
            g.drawLine(4, 0, 604, 600);
        }else if(stateOfBoard[2][0] == Player.x && stateOfBoard[1][1] == Player.x && stateOfBoard[0][2] == Player.x){
            g.drawRect(0,0,600,600);
            g.setColor(Color.GRAY);
            //g.fillRect(0,0,600,600);
            g.setColor(Color.RED);
            g.drawString("X wins!!", 150, 300);
            g.setColor(Color.BLACK);
            g.drawRect(252,402,100,25); //button shadow
            g.fillRect(252,402,100,25);
            g.setColor(Color.YELLOW);
            g.drawRect(250,400,100,25); //sketchy button
            g.fillRect(250,400,100,25);
            g.setFont(new Font("Ink Free",Font.BOLD,20));
            g.setColor(Color.BLACK);
            g.drawString("NEW GAME", 249, 421);
            g.setColor(Color.ORANGE);
            g.drawLine(600, 0, 0, 600);
            g.drawLine(600, 1, 0, 601);
            g.drawLine(600, 2, 0, 602);
            g.drawLine(600, 3, 0, 603);
            g.drawLine(600, 4, 0, 604);
        }else if(stateOfBoard[0][0] == Player.o && stateOfBoard[1][0] == Player.o && stateOfBoard[2][0] == Player.o){                                 //win conditions for player O
            g.drawRect(0,0,600,600);
            g.setColor(Color.GRAY);
            //g.fillRect(0,0,600,600);
            g.setColor(Color.BLUE);
            g.drawString("O wins!!", 150, 300);
            g.setColor(Color.BLACK);
            g.drawRect(252,402,100,25); //button shadow
            g.fillRect(252,402,100,25);
            g.setColor(Color.YELLOW);
            g.drawRect(250,400,100,25); //sketchy button
            g.fillRect(250,400,100,25);
            g.setFont(new Font("Ink Free",Font.BOLD,20));
            g.setColor(Color.BLACK);
            g.drawString("NEW GAME", 249, 421);
            g.setColor(Color.ORANGE);
            g.drawRect(100, 0, 10, 600);
            g.fillRect(100, 0, 10, 600);
        }else if(stateOfBoard[0][1] == Player.o && stateOfBoard[1][1] == Player.o && stateOfBoard[2][1] == Player.o){
            g.drawRect(0,0,600,600);
            g.setColor(Color.GRAY);
            //g.fillRect(0,0,600,600);
            g.setColor(Color.BLUE);
            g.drawString("O wins!!", 150, 300);
            g.setColor(Color.BLACK);
            g.drawRect(252,402,100,25); //button shadow
            g.fillRect(252,402,100,25);
            g.setColor(Color.YELLOW);
            g.drawRect(250,400,100,25); //sketchy button
            g.fillRect(250,400,100,25);
            g.setFont(new Font("Ink Free",Font.BOLD,20));
            g.setColor(Color.BLACK);
            g.drawString("NEW GAME", 249, 421);
            g.setColor(Color.ORANGE);
            g.drawRect(300, 0, 10, 600);
            g.fillRect(300, 0, 10, 600);
        }else if(stateOfBoard[0][2] == Player.o && stateOfBoard[1][2] == Player.o && stateOfBoard[2][2] == Player.o){
            g.drawRect(0,0,600,600);
            g.setColor(Color.GRAY);
            //g.fillRect(0,0,600,600);
            g.setColor(Color.BLUE);
            g.drawString("O wins!!", 150, 300);
            g.setColor(Color.BLACK);
            g.drawRect(252,402,100,25); //button shadow
            g.fillRect(252,402,100,25);
            g.setColor(Color.YELLOW);
            g.drawRect(250,400,100,25); //sketchy button
            g.fillRect(250,400,100,25);
            g.setFont(new Font("Ink Free",Font.BOLD,20));
            g.setColor(Color.BLACK);
            g.drawString("NEW GAME", 249, 421);
            g.setColor(Color.ORANGE);
            g.drawRect(500, 0, 10, 600);
            g.fillRect(500, 0, 10, 600);
        }else if(stateOfBoard[0][0] == Player.o && stateOfBoard[0][1] == Player.o && stateOfBoard[0][2] == Player.o){
            g.drawRect(0,0,600,600);
            g.setColor(Color.GRAY);
            //g.fillRect(0,0,600,600);
            g.setColor(Color.BLUE);
            g.drawString("O wins!!", 150, 300);
            g.setColor(Color.BLACK);
            g.drawRect(252,402,100,25); //button shadow
            g.fillRect(252,402,100,25);
            g.setColor(Color.YELLOW);
            g.drawRect(250,400,100,25); //sketchy button
            g.fillRect(250,400,100,25);
            g.setFont(new Font("Ink Free",Font.BOLD,20));
            g.setColor(Color.BLACK);
            g.drawString("NEW GAME", 249, 421);
            g.setColor(Color.ORANGE);
            g.drawRect(0, 100, 600, 10);
            g.fillRect(0, 100, 600, 10);
        }else if(stateOfBoard[1][0] == Player.o && stateOfBoard[1][1] == Player.o && stateOfBoard[1][2] == Player.o){
            g.drawRect(0,0,600,600);
            g.setColor(Color.GRAY);
            //g.fillRect(0,0,600,600);
            g.setColor(Color.BLUE);
            g.drawString("O wins!!", 150, 300);
            g.setColor(Color.BLACK);
            g.drawRect(252,402,100,25); //button shadow
            g.fillRect(252,402,100,25);
            g.setColor(Color.YELLOW);
            g.drawRect(250,400,100,25); //sketchy button
            g.fillRect(250,400,100,25);
            g.setFont(new Font("Ink Free",Font.BOLD,20));
            g.setColor(Color.BLACK);
            g.drawString("NEW GAME", 249, 421);
            g.setColor(Color.ORANGE);
            g.drawRect(0, 300, 600, 10);
            g.fillRect(0, 300, 600, 10);
        }else if(stateOfBoard[2][0] == Player.o && stateOfBoard[2][1] == Player.o && stateOfBoard[2][2] == Player.o){
            g.drawRect(0,0,600,600);
            g.setColor(Color.GRAY);
            //g.fillRect(0,0,600,600);
            g.setColor(Color.BLUE);
            g.drawString("O wins!!", 150, 300);
            g.setColor(Color.BLACK);
            g.drawRect(252,402,100,25); //button shadow
            g.fillRect(252,402,100,25);
            g.setColor(Color.YELLOW);
            g.drawRect(250,400,100,25); //sketchy button
            g.fillRect(250,400,100,25);
            g.setFont(new Font("Ink Free",Font.BOLD,20));
            g.setColor(Color.BLACK);
            g.drawString("NEW GAME", 249, 421);
            g.setColor(Color.ORANGE);
            g.drawRect(0, 500, 600, 10);
            g.fillRect(0, 500, 600, 10);
        }else if(stateOfBoard[0][0] == Player.o && stateOfBoard[1][1] == Player.o && stateOfBoard[2][2] == Player.o){
            g.drawRect(0,0,600,600);
            g.setColor(Color.GRAY);
            //g.fillRect(0,0,600,600);
            g.setColor(Color.BLUE);
            g.drawString("O wins!!", 150, 300);
            g.setColor(Color.BLACK);
            g.drawRect(252,402,100,25); //button shadow
            g.fillRect(252,402,100,25);
            g.setColor(Color.YELLOW);
            g.drawRect(250,400,100,25); //sketchy button
            g.fillRect(250,400,100,25);
            g.setFont(new Font("Ink Free",Font.BOLD,20));
            g.setColor(Color.BLACK);
            g.drawString("NEW GAME", 249, 421);
            g.setColor(Color.ORANGE);
            g.drawLine(0, 0, 600, 600);
            g.drawLine(1, 0, 601, 600);
            g.drawLine(2, 0, 602, 600);
            g.drawLine(3, 0, 603, 600);
            g.drawLine(4, 0, 604, 600);
        }else if(stateOfBoard[2][0] == Player.o && stateOfBoard[1][1] == Player.o && stateOfBoard[0][2] == Player.o){
            g.drawRect(0,0,600,600);
            g.setColor(Color.GRAY);
            //g.fillRect(0,0,600,600);
            g.setColor(Color.BLUE);
            g.drawString("O wins!!", 150, 300);
            g.setColor(Color.BLACK);
            g.drawRect(252,402,100,25); //button shadow
            g.fillRect(252,402,100,25);
            g.setColor(Color.YELLOW);
            g.drawRect(250,400,100,25); //sketchy button
            g.fillRect(250,400,100,25);
            g.setFont(new Font("Ink Free",Font.BOLD,20));
            g.setColor(Color.BLACK);
            g.drawString("NEW GAME", 249, 421);
            g.setColor(Color.ORANGE);
            g.drawLine(600, 0, 0, 600);
            g.drawLine(600, 1, 0, 601);
            g.drawLine(600, 2, 0, 602);
            g.drawLine(600, 3, 0, 603);
            g.drawLine(600, 4, 0, 604);
        }else if(stateOfBoard[0][0] != Player.NONE && stateOfBoard[0][1] != Player.NONE && stateOfBoard[0][2] != Player.NONE && stateOfBoard[1][0] != Player.NONE && stateOfBoard[1][1] != Player.NONE && stateOfBoard[1][2] != Player.NONE && stateOfBoard[2][0] != Player.NONE && stateOfBoard[2][1] != Player.NONE && stateOfBoard[2][2] != Player.NONE){
            g.setFont(new Font("Ink Free",Font.BOLD,90));
            g.drawRect(0,0,600,600);  
            g.setColor(Color.GRAY);  
            //g.fillRect(0,0,600,600);
            g.setColor(Color.GREEN);
            g.drawString("Its a tie!!", 60, 300);
            g.setColor(Color.BLACK);
            g.drawRect(252,402,100,25); //button shadow
            g.fillRect(252,402,100,25);
            g.setColor(Color.YELLOW);
            g.drawRect(250,400,100,25); //sketchy button
            g.fillRect(250,400,100,25);
            g.setFont(new Font("Ink Free",Font.BOLD,20));
            g.setColor(Color.BLACK);
            g.drawString("NEW GAME", 249, 421);
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


        if(x > 248 && x < 352 && y > 400 && y < 425){
            System.out.println("you clicked the button!! :)");
            for (int row2 = 0; row2 < stateOfBoard.length; row2++){
                for (int col2 = 0; col2 < stateOfBoard[0].length; col2++){
                    stateOfBoard[row2][col2] = Player.NONE;
                }
            }
            repaint();
        }
    }
}