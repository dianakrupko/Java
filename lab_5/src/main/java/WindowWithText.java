import java.util.Objects;
/** The WindowWithText class for data storage
 * (text, ColorText).
 */
public class WindowWithText extends Window{
    /**Property-text*/
    private String text;
    /**Property-colorText*/
    private String ColorText;

    public WindowWithText(){
        this.text=null;
        this.ColorText=null;
    }
    /** Function to get the value of a field{@link WindowWithText#text}
     * @return Return text
     */
    public String getText() {
        return text;
    }
    /** Function to get the value of a field{@link WindowWithText#ColorText}
     * @return Return ColorText
     */
    public String getColorText() {
        return ColorText;
    }
    /**
     * Sets the given value
     *
     * @param text-text
     */
    public void setText(String text) {
        this.text = text;
    }
    /**
     * Sets the given value
     *
     * @param colorText-colorText
     */
    public void setColarText(String colorText) {
        ColorText = colorText;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        WindowWithText that = (WindowWithText) o;
        return Objects.equals(text, that.text) && Objects.equals(ColorText, that.ColorText);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), text, ColorText);
    }

    @Override
    public String toString() {
        return "windowWithText{" +
                "text='" + text + '\'' +
                ", ColorText='" + ColorText + '\'' +
                '}';
    }
}
