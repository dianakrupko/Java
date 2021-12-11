package Task4;

import Task2.ImagePanel;

/**
 * Manager class to manage communication between ImageSettingsPanel and ImagePanel
 */

public class DrawingManager {
    private ImageSettingsPanel imgSettingsPanel;
    private ImagePanel imgPanel;

    /**
     * Sets specified ImageSettingsPanel to the manager to connect with
     * @param imgSettingsPanel specified ImageSettingsPanel
     */

    public void setImageSettingsPanel(ImageSettingsPanel imgSettingsPanel) {
        this.imgSettingsPanel = imgSettingsPanel;
    }

    /**
     * Sets specified ImagePanel to the manager to connect with
     * @param imgPanel specified ImagePanel
     */

    public void setImagePanel(ImagePanel imgPanel) {
        this.imgPanel = imgPanel;
    }

    /**
     * Returns current managed ImageSettingsPanel
     * @return current ImageSettingsPanel to manage
     */

    public ImageSettingsPanel getImgSettingsPanel() {
        return imgSettingsPanel;
    }

    /**
     * Returns current managed ImagePanel
     * @return current ImagePanel to manage
     */

    public ImagePanel getImgPanel() {
        return imgPanel;
    }

    /**
     * Method for correct drawing of the image on the ImagePanel
     * @param width specified width
     * @param height specified height
     */

    public void drawScaledImage(int width, int height) {
        imgPanel.getImage().setWidth(width);
        imgPanel.getImage().setHeight(height);
        imgPanel.repaint();
    }
}
