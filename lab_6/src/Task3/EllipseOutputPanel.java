package Task3;
import javax.swing.*;
import java.awt.*;

/**
 * Custom panel to draw ellipse on
 */

public class EllipseOutputPanel extends JPanel {
    private String color;
    private int centerX;
    private int centerY;
    private int semiAxisA;
    private int semiAxisB;

    /**
     * Constructor that initialises default values of the variables and creates custom panel
     */

    EllipseOutputPanel() {
        color = "Black";
        centerX = 300;
        centerY = 100;
        semiAxisA = 0;
        semiAxisB = 0;

        setPreferredSize(new Dimension(320, 320));
        setBorder(BorderFactory.createTitledBorder("Ellipse output"));
    }

    /**
     * Sets specified string representation of the color of the ellipse
     * @param color specified color
     */

    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Sets center coordinate X of the ellipse
     * @param centerX specified center coordinate X
     */

    public void setCenterX(int centerX) {
        this.centerX = centerX;
    }

    /**
     * Sets center coordinate Y of the ellipse
     * @param centerY specified center coordinate Y
     */

    public void setCenterY(int centerY) {
        this.centerY = centerY;
    }

    /**
     * Sets specified horizontal semi axis of the ellipse
     * @param semiAxisA specified horizontal semi axis
     */

    public void setSemiAxisA(int semiAxisA) {
        this.semiAxisA = semiAxisA;
    }

    /**
     * Sets specified vertical semi axis of the ellipse
     * @param semiAxisB specified vertical semi axis
     */

    public void setSemiAxisB(int semiAxisB) {
        this.semiAxisB = semiAxisB;
    }

    /**
     * Returns string representation of the color of the ellipse
     * @return string representation of the color
     */

    public String getColor() {
        return color;
    }

    /**
     * Returns center coordinate X of the ellipse
     * @return center coordinate X
     */

    public int getCenterX() {
        return centerX;
    }

    /**
     * Returns center coordinate Y of the ellipse
     * @return center coordinate Y
     */

    public int getCenterY() {
        return centerY;
    }

    /**
     * Returns horizontal semi axis length of the ellipse
     * @return horizontal semi axis length
     */

    public int getSemiAxisA() {
        return semiAxisA;
    }

    /**
     * Returns vertical semi axis length of the ellipse
     * @return vertical semi axis length
     */

    public int getSemiAxisB() {
        return semiAxisB;
    }

    /**
     * Overrode method for correct drawing of the ellipse
     * @param g graphics context
     */

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        switch (color) {
            case "Black":
                g.setColor(Color.BLACK);
                break;
            case "Red":
                g.setColor(Color.RED);
                break;
            case "Green":
                g.setColor(Color.GREEN);
                break;
            case "Blue":
                g.setColor(Color.BLUE);
        }
        g.fillOval(centerX - semiAxisA, centerY - semiAxisB, 2*semiAxisA, 2*semiAxisB);
        g.drawOval(centerX - semiAxisA, centerY - semiAxisB, 2*semiAxisA, 2*semiAxisB);
    }
}
