package Task4;
import Task2.ImagePanel;
import Task2.ScalableImageComponent;

import javax.swing.*;

/**
 * Custom frame to demonstrate required functionality of ImagePanel and ImageSettingsPanel
 */

public class Task29 extends JFrame {

    private ImageSettingsPanel imgSettingsPanel;
    private ImagePanel imgPanel;
    private DrawingManager drawingManager;

    /**
     * Constructor that creates main frame and sets required panels and drawing manager
     */

    Task29() {
        setTitle("Task 29");
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        setSize(620, 710);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        imgSettingsPanel = new ImageSettingsPanel();
        imgPanel = new ImagePanel(new ScalableImageComponent("C:\\Users\\dnkru\\IdeaProjects\\lab6_1\\src\\Task4\\kpi.jpg"));

        drawingManager = new DrawingManager();
        drawingManager.setImageSettingsPanel(imgSettingsPanel);
        drawingManager.setImagePanel(imgPanel);

        imgSettingsPanel.setDrawingManager(drawingManager);

        add(imgSettingsPanel);
        add(imgPanel);
        setVisible(true);
    }

    /**
     * Launches app
     * @param args program arguments
     */

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Task29::new);
    }
}
