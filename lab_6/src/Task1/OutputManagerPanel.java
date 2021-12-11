package Task1;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

/**
 * Custom panel which includes different settings for output text
 */

public class OutputManagerPanel extends JPanel {

    private JLabel textLabel = new JLabel("Text: ");
    private JLabel font = new JLabel("Font: ");
    private JLabel color = new JLabel("Color: ");
    private JTextField inputTextField;
    private JSpinner fonts;
    private JSpinner colors;
    private JButton outputButton;
    private DrawingManager drawingManager;

    private static String inputString = "";

    /**
     * Default constructor which creates custom panel with required settings
     */

    OutputManagerPanel() {

        setPreferredSize(new Dimension(600, 100));
        setBorder(BorderFactory.createTitledBorder("Settings"));

        inputTextField = new JTextField(20);

        String[] availableFonts = {"Times New Roman", "Arial", "Verdana"};
        fonts = new JSpinner(new SpinnerListModel(availableFonts));
        fonts.getEditor().setPreferredSize(new Dimension(120, 16));

        String[] availableColors = {"Black", "Red", "Green", "Blue"};
        colors = new JSpinner(new SpinnerListModel(availableColors));
        colors.getEditor().setPreferredSize(new Dimension(50, 16));

        outputButton = new JButton("Draw string");
        outputButton.addActionListener(e -> {
            inputString = inputTextField.getText();
            drawingManager.draw(inputString, (String)fonts.getValue(), (String)colors.getValue());
        });

        add(textLabel);
        add(inputTextField);
        add(font);
        add(fonts);
        add(color);
        add(colors);
        add(outputButton);
        setVisible(true);
    }

    /**
     * Sets specified drawing manager to connect with output panel
     * @param drawingManager specified drawing manager
     */

    public void setDrawingManager(DrawingManager drawingManager) {
        this.drawingManager = drawingManager;
    }

    /**
     * returns drawing manager for current panel
     * @return drawing manager for output settings panel
     */

    public DrawingManager getDrawingManager() {
        return drawingManager;
    }
}
