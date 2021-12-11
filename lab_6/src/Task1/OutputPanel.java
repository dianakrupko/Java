package Task1;

import javax.swing.*;
import java.awt.*;

/**
 * Custom panel in which text with specified string, font and color draws
 */

public class OutputPanel extends JPanel {
    private String text;
    private String textFont;
    private String textColor;

    /**
     * Default constructor which initialises variables with default values
     */

    OutputPanel() {
        text = "";
        textFont = "Times New Roman";
        textColor = "Black";
        setPreferredSize(new Dimension(600, 300));
        setBorder(BorderFactory.createTitledBorder("Output"));
        setVisible(true);
    }

    /**
     * Sets specified string to draw
     * @param text specified text
     */

    public void setText(String text) {
        this.text = text;
    }

    /**
     * Sets string representation of the specified font of the text to draw
     * @param textFont specified font
     */

    public void setTextFont(String textFont) {
        this.textFont = textFont;
    }

    /**
     * Sets text representation of the specified color of the text to draw
     * @param textColor specified color
     */

    public void setTextColor(String textColor) {
        this.textColor = textColor;
    }

    /**
     * returns specified string to draw
     * @return string to draw
     */

    public String getText() {
        return text;
    }

    /**
     * Returns string representation of the specified font of the text to draw
     * @return string representation of the specified font of the text to draw
     */

    public String getTextFont() {
        return textFont;
    }

    /**
     * Returns text representation of the specified color of the text to draw
     * @return text representation of the specified color of the text to draw
     */

    public String getTextColor() {
        return textColor;
    }

    /**
     * Overrode method to correct drawing of the string
     * @param g graphics context
     */

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setFont(new Font(textFont, Font.PLAIN, 24));
        switch (textColor) {
            case "Black":
                g.setColor(Color.BLACK);
                break;
            case "Red" :
                g.setColor(Color.RED);
                break;
            case "Green" :
                g.setColor(Color.GREEN);
                break;
            case "Blue" :
                g.setColor(Color.BLUE);
        }

        g.drawString(text, 5, 40);
    }
}
