package Task3;

/**
 * Manager class to set communication between EllipseSettingsPanel and EllipseOutputPanel
 */

public class DrawingManager {
    private EllipseOutputPanel ellipseOutputPanel;
    private EllipseSettingsPanel ellipseSettingsPanel;

    /**
     * Sets specified EllipseOutputPanel to manage communication with
     * @param ellipseOutputPanel specified ellipse output panel
     */

    public void setEllipseOutputPanel(EllipseOutputPanel ellipseOutputPanel) {
        this.ellipseOutputPanel = ellipseOutputPanel;
    }

    /**
     * Sets specified EllipseSettingsPanel to manage communication with
     * @param ellipseSettingsPanel specified ellipse settings panel
     */

    public void setEllipseSettingsPanel(EllipseSettingsPanel ellipseSettingsPanel) {
        this.ellipseSettingsPanel = ellipseSettingsPanel;
    }

    /**
     * Returns current managed EllipseOutputPanel
     * @return current EllipseOutputPanel to manage
     */

    public EllipseOutputPanel getEllipseOutputPanel() {
        return ellipseOutputPanel;
    }

    /**
     * returns current EllipseSettingsPanel
     * @return current EllipseSettingsPanel to manage
     */

    public EllipseSettingsPanel getEllipseSettingsPanel() {
        return ellipseSettingsPanel;
    }

    /**
     * Method to communicate drawing between EllipseSettingsPanel and EllipseOutputPanel with specified properties
     * @param color specified string representation of the color of the ellipse
     * @param centerX center coordinate X of the ellipse
     * @param centerY center coordinate Y of the ellipse
     * @param semiAxisA horizontal semi axis of the ellipse
     * @param semiAxisB vertical semi axis of the ellipse
     */

    public void draw(String color, int centerX, int centerY, int semiAxisA, int semiAxisB) {
        ellipseOutputPanel.setColor(color);
        ellipseOutputPanel.setCenterX(centerX);
        ellipseOutputPanel.setCenterY(centerY);
        ellipseOutputPanel.setSemiAxisA(semiAxisA);
        ellipseOutputPanel.setSemiAxisB(semiAxisB);
        ellipseOutputPanel.repaint();
    }
}
