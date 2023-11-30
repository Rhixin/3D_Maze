import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;

public class GamePanel3D extends JPanel{
    public int height = 600;
    public int width = 800;
    public int pos_x = 0;
    public int pos_y = 0;
    

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.fillRect(pos_x,pos_y, width, height);
    }

    public void drawRect(Graphics g, int x, int y, int w, int h, Color c){
        g.setColor(c);
        g.fillRect(x,y,w,h);
    }

    public void drawPixel(Graphics g, int x, int y, Color color) {
        g.setColor(color);
        g.fillRect(x, y, 1, 1);
    }


}
