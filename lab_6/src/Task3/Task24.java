package Task3;
import javax.swing.*;

/**
 * Custom frame to demonstrate required functionality of EllipseSettingsPanel and EllipseOutputPanel
 */

public class Task24 extends JFrame {

    private EllipseSettingsPanel inputPanel;
    private EllipseOutputPanel outputPanel;
    private DrawingManager drawingManager;

    /**
     * Constructor that creates main frame with required panels
     */

    Task24() {
        setTitle("Task 24");
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        setSize(880, 460);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        outputPanel = new EllipseOutputPanel();
        inputPanel = new EllipseSettingsPanel();

        drawingManager = new DrawingManager();
        drawingManager.setEllipseOutputPanel(outputPanel);
        drawingManager.setEllipseSettingsPanel(inputPanel);
        inputPanel.setDrawingManager(drawingManager);

        add(outputPanel);
        add(inputPanel);
        setVisible(true);
    }

    /**
     * Launches app
     * @param args program arguments
     */

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Task24::new);
    }
}

