import javax.swing.*;

public class GameFrame extends JFrame {
    private GamePanel gamePanel;

    public GameFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);
        setTitle("JMaze");

        gamePanel = new GamePanel();
        setContentPane(gamePanel);
        setVisible(true);
    }

    public void start() {
        // Initialize game resources
        // ...

        // Start the game loop
        new Thread(gamePanel).start();
    }
}
