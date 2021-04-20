package Lab10;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

//Do not touch the code below.  It creates an instance of your 
//TicTacToePanel object and places it into a graphical window.

/**
 * Creates a graphical window containing a TicTacToePane and
 * starts the graphical event loop.
 */
public class TicTacToeMain {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame window = new JFrame("Tic-Tac-Toe");
            window.add(new TicTacToePanel());
            window.pack();
            window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            window.setVisible(true);
        });
    }
}