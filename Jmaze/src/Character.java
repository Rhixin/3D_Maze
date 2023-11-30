import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Character extends JPanel{
    public int pos_x = 45;
    public int pos_y = 45;
    public int cell_size = 5;
    public double angle = 90;
    public int delta_x = 0;
    public int delta_y = 0;


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Set the color for the box
        g.setColor(Color.RED);

        // Draw the black box at the current position (0, 0) with a size of 5x5 pixels
        g.fillRect(pos_x,pos_y, cell_size, cell_size);
    }
}
