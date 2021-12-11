package Task2;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import javax.imageio.*;

/**
 * Custom component which contains image itself and its name
 */

public class ScalableImageComponent extends JComponent {
    private Image image;
    private int width;
    private int height;
    private String fileName;

    /**
     * Constructor which creates custom image component from specified path
     * @param path specified path to the image
     */

    public ScalableImageComponent(String path) {
        try {
            image = ImageIO.read(new File(path));
            width = image.getWidth(this);
            height = image.getHeight(this);
            StringBuffer fileNameBuffer = new StringBuffer(path);
            for(int i = fileNameBuffer.length()-1; i > 0; i--) {
                if(fileNameBuffer.charAt(i) == '\\') {
                    fileName = fileNameBuffer.substring(i+1, fileNameBuffer.length());
                    break;
                }
            }
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }

    /**
     * Method to zoom in image
     * @param value amount of pixels to zoom in
     */

    public void zoomIn(int value) {
        width+=value;
        height+=value;
    }

    /**
     * Method to zoom out image
     * @param value amount of pixels to zoom out
     */

    public void zoomOut(int value) {
        width-=value;
        height-=value;
    }

    /**
     * Overrode methode to take width of image
     * @return width of image
     */

    @Override
    public int getWidth() {
        return width;
    }

    /**
     * Overrode methode to take height of image
     * @return height of image
     */

    @Override
    public int getHeight() {
        return height;
    }

    /**
     * Returns current image of the component
     * @return current image
     */

    public Image getImage() {
        return image;
    }

    /**
     * Returns name of the image file
     * @return name of the image file
     */

    public String getFileName() {
        return fileName;
    }

    /**
     * Sets specified width to image component
     * @param width specified width
     */

    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * Sets specified height to image component
     * @param height specified height of the image component
     */

    public void setHeight(int height) {
        this.height = height;
    }
}
