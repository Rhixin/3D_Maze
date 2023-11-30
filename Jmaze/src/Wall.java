import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;

public class Wall extends JPanel {
    int pos_x;
    int pos_y;
    int cell_size = 30;
    private Color color = Color.WHITE;

    public Wall(int x,int y){
        this.pos_x = x;
        this.pos_y = y;
    }

    public Wall(int x,int y, Color color){
        this.pos_x = x;
        this.pos_y = y;
        this.color = color;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Set the color for the box
        g.setColor(color);

        // Draw the black box at the current position (0, 0) with a size of 5x5 pixels
        g.fillRect(pos_x,pos_y, cell_size, cell_size);
    }
}
