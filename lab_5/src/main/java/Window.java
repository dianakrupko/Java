import java.util.Objects;
/** The Window class for data storage
 * (left, top, right, bottom, colorWindow).
 */
public class Window implements InterfaceWindow {
    /**Property-left*/
    private double left;
    /**Property-top*/
    private double top;
    /**Property-right*/
    private double right;
    /**Property-bottom*/
    private double bottom;
    /**Property-colorWindow*/
    private String colorWindow;

    public Window(){
        this.left=0;
        this.top=0;
        this.right=0;
        this.bottom=0;
        this.colorWindow=null;
    }

    /** Function to get the value of a field{@link Window#left}
     * @return Return left
     */
    public double getLeft() {
        return left;
    }
    /** Function to get the value of a field{@link Window#top}
     * @return Return top
     */
    public double getTop() {
        return top;
    }
    /** Function to get the value of a field{@link Window#right}
     * @return Return right
     */
    public double getRight() {
        return right;
    }
    /** Function to get the value of a field{@link Window#bottom}
     * @return Return bottom
     */
    public double getBottom() {
        return bottom;
    }
    /** Function to get the value of a field{@link Window#colorWindow}
     * @return Return colorWindow
     */
    public String getColorWindow() {
        return colorWindow;
    }
    /**
     * Sets the given value
     *
     * @param left-left
     */
    public void setLeft(double left) {
        this.left = left;
    }
    /**
     * Sets the given value
     *
     * @param top-top
     */
    public void setTop(double top) {
        this.top = top;
    }
    /**
     * Sets the given value
     *
     * @param right-right
     */
    public void setRight(double right) {
        this.right = right;
    }
    /**
     * Sets the given value
     *
     * @param bottom-bottom
     */
    public void setBottom(double bottom) {
        this.bottom = bottom;
    }
    /**
     * Sets the given value
     *
     * @param colorWindow-colorWindow
     */
    public void setColorWindow(String colorWindow) {
        this.colorWindow = colorWindow;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Window window = (Window) o;
        return left == window.left && top == window.top && right == window.right && bottom == window.bottom && Objects.equals(colorWindow, window.colorWindow);
    }

    @Override
    public int hashCode() {
        return Objects.hash(left, top, right, bottom, colorWindow);
    }

    @Override
    public String toString() {
        return "Window{" +
                "left=" + left +
                ", top=" + top +
                ", right=" + right +
                ", bottom=" + bottom +
                ", colorWindow='" + colorWindow + '\'' +
                '}';
    }
}
