package Task1;

/**
 * Manager class for communication between OutputManagerPanel and OutputPanel
 */

public class DrawingManager {
    private OutputManagerPanel outputManagerPanel;
    private OutputPanel outputPanel;

    /**
     *Sets specified OutputManagerPanel
     * @param outputManagerPanel specified OutputManagerPanel
     */

    public void setOutputManagerPanel(OutputManagerPanel outputManagerPanel) {
        this.outputManagerPanel = outputManagerPanel;
    }

    /**
     * Sets specified OutputPanel
     * @param outputPanel specified OutputPanel
     */

    public void setOutputPanel(OutputPanel outputPanel) {
        this.outputPanel = outputPanel;
    }

    /**
     * Returns OutputManagerPanel managing in drawing manager
     * @return OutputManagerPanel
     */

    public OutputManagerPanel getOutputManagerPanel() {
        return outputManagerPanel;
    }

    /**
     * Returns OutputPanel managing in drawing manager
     * @return OutputPanel
     */

    public OutputPanel getOutputPanel() {
        return outputPanel;
    }

    /**
     * Takes specified parameters to draw text in OutputPanel specified by its font and color
     * @param text specified text to draw
     * @param textFont specified font of the text to draw
     * @param textColor specified color of the text to draw
     */

    public void draw(String text, String textFont, String textColor) {
        outputPanel.setText(text);
        outputPanel.setTextFont(textFont);
        outputPanel.setTextColor(textColor);
        outputPanel.repaint();
    }
}
