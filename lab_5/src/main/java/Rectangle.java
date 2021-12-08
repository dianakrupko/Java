import java.util.Objects;
/** The Rectangle class for data storage
 * (height, width).
 */
public class Rectangle implements InterfaceRectangle{
    /**Property-height*/
    private double height;
    /**Property-width*/
    private double  width;

    public Rectangle(){
        this.height=0;
        this.width=0;
    }

    /** Function to get the value of a field{@link Rectangle#height}
     * @return Return height
     */
    public double getHeight() {
        return height;
    }
    /** Function to get the value of a field{@link Rectangle#width}
     * @return Return width
     */
    public double getWidth() {
        return width;
    }
    /**
     * Sets the given value
     *
     * @param height -height
     */
    public void setHeight(double height) {
        if (height<0) {
            System.err.println("Error. Height < 0.");
            this.height=0;
        }
        else{this.height = height;}

    }
    /**
     * Sets the given value
     *
     * @param width -width
     */
    public void setWidth(double width) {
        if (width<0) {
            System.err.println("Error. Width < 0.");
            this.height=0;
        }
        else{this.width = width;}
    }
    /**
     *Function to return area of rectangle {@link Rectangle # area ()}
     *@return return area
     */
    public double areaRectangle(){
        double area;
        area=height*width;
        return area;
    }
    /**
     *Function to return perimeter of rectangle {@link Rectangle #perimeter()}
     *@return return perimeter
     */
    public double perimeterRectangle(){
        double perimeter;
        perimeter=2*(height+width);
        return perimeter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(rectangle.height, height) == 0 && Double.compare(rectangle.width, width) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, width);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", width=" + width +
                ", area="+areaRectangle()+
                ", perimeter="+perimeterRectangle()+
                '}';
    }
}
