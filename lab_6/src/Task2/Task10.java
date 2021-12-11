package Task2;

import javax.swing.*;
import java.awt.*;

/**
 * Custom frame to demonstrate required functionality of givet task
 */

public class Task10 extends JFrame {

    private ImagePanel imgPanel;
    private JToolBar imgToolBar;
    private JButton zoomIn;
    private JButton zoomOut;

    /**
     * Creates frame and sets required panels to the screen, creates image components which is able to zoom
     */

    Task10() {
        setTitle("Task 10");
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        setSize(620, 680);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        imgPanel = new ImagePanel(new ScalableImageComponent("C:\\Users\\dnkru\\IdeaProjects\\lab6_1\\src\\Task2\\kpi.jpg"));

        imgToolBar = new JToolBar();
        imgToolBar.setLayout(new FlowLayout());

        zoomIn = new JButton("Zoom In");
        zoomIn.addActionListener(e -> {
            imgPanel.getImage().zoomIn(10);
            repaint();
        });

        zoomOut = new JButton("Zoom Out");
        zoomOut.addActionListener(e -> {
            imgPanel.getImage().zoomOut(10);
            repaint();
        });

        imgToolBar.add(zoomIn);
        imgToolBar.add(zoomOut);

        add(imgToolBar);
        add(imgPanel);
        setVisible(true);
    }

    /**
     * Launches app
     * @param args program arguments
     */

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Task10::new);
    }
}
