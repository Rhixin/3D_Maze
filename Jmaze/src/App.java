import javax.swing.SwingUtilities;

public class App {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                GameFrame gameFrame = new GameFrame();
                gameFrame.start();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}
