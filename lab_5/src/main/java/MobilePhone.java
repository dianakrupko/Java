import java.util.Objects;
/** The MobilePhone class for data storage
 * (name, weight, acreenDiagonal, builtMemory, camera).
 */
public class MobilePhone implements InterfaceMobilePhone{
    /**Property-name*/
    private String name;
    /**Property-weight*/
    private double weight;
    /**Property-screenDiagonal*/
    private double screenDiagonal;
    /**Property-builtInMemory*/
    private int builtInMemory;
    /**Property-camera*/
    private boolean camera;
    /** Function to get the value of a field{@link MobilePhone#name}
     * @return Return name
     */

    public MobilePhone(){
        this.name=null;
        this.weight=0;
        this.screenDiagonal=0;
        this.builtInMemory=0;
        this.camera=false;
    }
    public String getName() {
        return name;
    }

    /** Function to get the value of a field{@link MobilePhone#weight}
     * @return Return weight
     */
    public double getWeight() {
        return weight;
    }

    /** Function to get the value of a field{@link MobilePhone#screenDiagonal}
     * @return Return screenDiagonal
     */
    public double getScreenDiagonal() {
        return screenDiagonal;
    }

    /** Function to get the value of a field{@link MobilePhone#builtInMemory}
     * @return Return builtInMemory
     */
    public int getBuiltInMemory() {
        return builtInMemory;
    }

    /** Function to get the value of a field{@link MobilePhone#camera}
     * @return Return camera
     */
    public boolean isCamera() {
        return camera;
    }

    /**
     * Sets the given value
     *
     * @param name - name
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Sets the given value
     *
     * @param weight - weight
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }
    /**
     * Sets the given value
     *
     * @param screenDiagonal - screenDiagonal
     */
    public void setScreenDiagonal(double screenDiagonal) {
        this.screenDiagonal = screenDiagonal;
    }
    /**
     * Sets the given value
     *
     * @param builtInMemory - builtInMemory
     */
    public void setBuiltInMemory(int builtInMemory) {
        this.builtInMemory = builtInMemory;
    }
    /**
     * Sets the given value
     *
     * @param camera - camera
     */
    public void setCamera(boolean camera) {
        this.camera = camera;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MobilePhone that = (MobilePhone) o;
        return Double.compare(that.weight, weight) == 0 && Double.compare(that.screenDiagonal, screenDiagonal) == 0 && builtInMemory == that.builtInMemory && camera == that.camera && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weight, screenDiagonal, builtInMemory, camera);
    }

    @Override
    public String toString() {
        return "MobilePhone{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", screenDiagonal=" + screenDiagonal +
                ", builtInMemory=" + builtInMemory +
                ", camera=" + camera +
                '}';
    }
}
