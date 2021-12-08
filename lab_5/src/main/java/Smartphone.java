import java.util.Objects;
/** The Smartphone class for data storage
 * (processorFrequency, numberOfCores, amountOfRAM).
 */
public class Smartphone extends MobilePhone{
    /**Property-processorFrequency*/
    private int processorFrequency;
    /**Property-numberOfCores*/
    private int numberOfCores;
    /**Property-amountOfRAM*/
    private int amountOfRAM;
    /** Function to get the value of a field{@link Smartphone#processorFrequency}
     * @return Return processorFrequency
     */
    public Smartphone(){
        this.processorFrequency=0;
        this.numberOfCores=0;
        this.amountOfRAM=0;
    }

    public int getProcessorFrequency() {
        return processorFrequency;
    }
    /** Function to get the value of a field{@link Smartphone#numberOfCores}
     * @return Return numberOfCores
     */
    public int getNumberOfCores() {
        return numberOfCores;
    }
    /** Function to get the value of a field{@link Smartphone#amountOfRAM}
     * @return Return amountOfRAM
     */
    public int getAmountOfRAM() {
        return amountOfRAM;
    }

    /**
     * Sets the given value
     *
     * @param processorFrequency -processorFrequency
     */
    public void setProcessorFrequency(int processorFrequency) {
        this.processorFrequency = processorFrequency;
    }
    /**
     * Sets the given value
     *
     * @param numberOfCores -numberOfCores
     */
    public void setNumberOfCores(int numberOfCores) {
        this.numberOfCores = numberOfCores;
    }
    /**
     * Sets the given value
     *
     * @param amountOfRAM -amountOfRAM
     */
    public void setAmountOfRAM(int amountOfRAM) {
        this.amountOfRAM = amountOfRAM;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Smartphone that = (Smartphone) o;
        return processorFrequency == that.processorFrequency && numberOfCores == that.numberOfCores && amountOfRAM == that.amountOfRAM;
    }

    @Override
    public int hashCode() {
        return Objects.hash(processorFrequency, numberOfCores, amountOfRAM);
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "processorFrequency=" + processorFrequency +
                ", numberOfCores=" + numberOfCores +
                ", amountOfRAM=" + amountOfRAM +
                '}';
    }
}
