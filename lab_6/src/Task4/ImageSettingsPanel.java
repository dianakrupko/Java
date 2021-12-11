package Task4;
import javax.swing.*;
import java.awt.*;

/**
 * Custom panel which contains required settings of the image
 */

public class ImageSettingsPanel extends JPanel {

    JLabel widthLabel = new JLabel("Width: ");
    JLabel heightLabel = new JLabel("Height: ");

    JTextField widthTextField;
    JTextField heightTextField;

    JButton outputButton;

    DrawingManager drawingManager;

    /**
     * Creates custom panels with settings and their default values
     */

    ImageSettingsPanel() {
        setPreferredSize(new Dimension(600, 70));
        setBorder(BorderFactory.createTitledBorder("Image settings"));

        widthTextField = new JTextField(5);
        heightTextField = new JTextField(5);

        outputButton = new JButton("Draw Image");
        outputButton.addActionListener(e -> {
            try {
                drawingManager.drawScaledImage(Integer.parseInt(widthTextField.getText()), Integer.parseInt(heightTextField.getText()));
            }
            catch(Exception exc) {
                System.out.println(exc);
            }
        });

        add(widthLabel);
        add(widthTextField);
        add(heightLabel);
        add(heightTextField);
        add(outputButton);
    }

    /**
     * Sets specified drawing manager to the panel
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
