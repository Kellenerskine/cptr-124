package Lab10;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;

/**
 * Serves as the superclass for the graphical interface for 
 * games like Tic-Tac-Toe
 */
@SuppressWarnings("serial")
public class GamePanel extends JPanel {
    
    /**
     * Subclasses must override this method to provide custom
     * behavior when the user releases the mouse button when the 
     * mouse cursor is over the panel
     * @param x the <em>x</em> coordinate of the mouse cursor
     * @param y the <em>y</em> coordinate of the mouse cursor
     */
    protected void handleMouseRelease(int x, int y) {
        System.out.println("Mouse pressed at (" + x + ", " + y + ")");
    }
    
    /**
     * Creates an empty game board.
     * Ties a mouse button released event to the 
     * {@code handleMouseRelease} method.
     * @param width the game panel's width in pixels
     * @param height the game panel's height in pixels
     */
    public GamePanel(int width, int height) {
        // This object listens to mouse events within this panel
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent ev) {
                // React to a mouse press over the panel
                handleMouseRelease(ev.getX(), ev.getY());
                repaint();  // Keep this; it instructs the graphical event manager to redraw the panel
            }
        });

        setPreferredSize(new Dimension(width, height));
    }
    
    /** 
     * Draws the contents of the panel.  Subclasses must
     * override this method to provide custom behavior.
     * @param g the current graphics context
     */
    protected void repaintPanel(Graphics g) {
        System.out.println("Repainting the panel");
    }
    
    
    /**
     * Renders the Tic-Tac-Toe board and player marks.
     * Note that this method is {@code final}, so subclasses
     * cannot override it.
     */
    @Override
    public final void paintComponent(Graphics g) {
        super.paintComponent(g);
        repaintPanel(g);
    }
}