package Task2;

import javax.swing.*;
import java.awt.*;

/**
 * Custom panel which contains image component and its name
 */

public class ImagePanel extends JPanel {

    private JLabel fileName;
    private ScalableImageComponent image;

    /**
     * Constructor which takes image component and sets the content of panel
     * @param image specified image component
     */

    public ImagePanel(ScalableImageComponent image) {
        setPreferredSize(new Dimension(600, 600));
        setBorder(BorderFactory.createTitledBorder("Image output"));
        this.image = image;
        fileName = new JLabel(image.getFileName());
        add(fileName);
        add(image);
    }

    /**
     * Overrode method for correct drawing of image
     * @param g graphics context
     */

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image.getImage(),
                this.getWidth()/2 - image.getWidth()/2,
                this.getHeight()/2 - image.getHeight()/2,
                image.getWidth(), image.getHeight(), null);
    }

    /**
     * Returns current image component of the panel
     * @return image component
     */

    public ScalableImageComponent getImage() {
        return image;
    }
}
