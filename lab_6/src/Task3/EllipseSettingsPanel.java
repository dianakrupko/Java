package Task3;
import javax.swing.*;
import java.awt.*;

/**
 * Custom panel to set different settings of the ellipse to draw
 */

public class EllipseSettingsPanel extends JPanel {

    private JLabel colorLabel = new JLabel(" Color: ");
    private JLabel centerXLabel = new JLabel(" Center coordinate X: ");
    private JLabel centerYLabel = new JLabel(" Center coordinate Y: ");
    private JLabel semiAxisALabel = new JLabel(" Semi axis A: ");
    private JLabel semiAxisBLabel = new JLabel(" Semi axis B: ");

    private JComboBox<String> colors;
    private JSpinner centerX, centerY, semiAxisA, semiAxisB;
    private JButton outputButton;

    private DrawingManager drawingManager;

    /**
     * Constructor that creates custom panel with required components to set different settings of the ellipse to draw
     */

    EllipseSettingsPanel() {
        setLayout(new FlowLayout());
        setPreferredSize(new Dimension(800, 70));
        setBorder(BorderFactory.createTitledBorder("Ellipse settings"));

        colors = new JComboBox<>();
        colors.addItem("Black");
        colors.addItem("Red");
        colors.addItem("Green");
        colors.addItem("Blue");

        centerX = new JSpinner(new SpinnerNumberModel(10, 10, 150, 1));
        centerX.getEditor().setPreferredSize(new Dimension(40, 16));
        centerY = new JSpinner(new SpinnerNumberModel(10, 10, 150, 1));
        centerY.getEditor().setPreferredSize(new Dimension(40, 16));

        semiAxisA = new JSpinner(new SpinnerNumberModel(10, 10, 150, 1));
        semiAxisA.getEditor().setPreferredSize(new Dimension(40, 16));
        semiAxisB = new JSpinner(new SpinnerNumberModel(10, 10, 150, 1));
        semiAxisB.getEditor().setPreferredSize(new Dimension(40, 16));

        outputButton = new JButton("Draw Ellipse");
        outputButton.addActionListener(e -> {
            drawingManager.draw((String)colors.getSelectedItem(),
                    (int)centerX.getValue(),
                    (int)centerY.getValue(),
                    (int)semiAxisA.getValue(),
                    (int)semiAxisB.getValue());
        });

        add(colorLabel);
        add(colors);
        add(centerXLabel);
        add(centerX);
        add(centerYLabel);
        add(centerY);
        add(semiAxisALabel);
        add(semiAxisA);
        add(semiAxisBLabel);
        add(semiAxisB);
        add(outputButton);
    }

    /**
     * Sets specified drawing manager to manage connection between settings and drawing panels
     * @param drawingManager specified drawing manager
     */

    public void setDrawingManager(DrawingManager drawingManager) {
        this.drawingManager = drawingManager;
    }

    /**
     * Returns current drawing manager of the panel
     * @return drawing manager of the panel
     */

    public DrawingManager getDrawingManager() {
        return drawingManager;
    }
}
