package Task1;

import javax.swing.*;

/**
 * Custom frame to demonstrate required functionality
 */

public class Task5 extends JFrame {

    private OutputManagerPanel managerPanel;
    private OutputPanel outputPanel;
    private DrawingManager drawingManager;

    /**
     * Constructor that initialises variables and sets the content of the main frame
     */

    Task5() {
        setTitle("Task 5");
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        setSize(620, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        outputPanel = new OutputPanel();
        managerPanel = new OutputManagerPanel();

        drawingManager = new DrawingManager();
        drawingManager.setOutputManagerPanel(managerPanel);
        drawingManager.setOutputPanel(outputPanel);
        managerPanel.setDrawingManager(drawingManager);

        add(managerPanel);
        add(outputPanel);
        setVisible(true);
    }

    /**
     * Launches app
     * @param args program arguments
     */

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Task5::new);
    }
}
