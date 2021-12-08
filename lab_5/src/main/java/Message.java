import java.util.Objects;
/** The Message class for storing forum message data
 * (author, topic, text, time, timeCreation, creationDate, aditingDate).
 */
public class Message implements InterfaceMessage{
    /**Property-author*/
    private String author;
    /**Property-topic*/
    private String topic;
    /**Property-text*/
    private String text;
    /**Property-timeCreation*/
    private String timeCreation;
    /**Property-creationDate*/
    private String creationDate;
    /**Property-editingDate*/
    private String editingDate;

    public Message(){
        this.author=null;
        this.topic=null;
        this.text=null;
        this.timeCreation=null;
        this.creationDate=null;
        this.editingDate=null;
    }

    /** Function to get the value of a field{@link Message#author}
     * @return Return author
     */
    public String getAuthor() {
        return author;
    }
    /** Function to get the value of a field{@link Message#topic}
     * @return Return topic
     */
    public String getTopic() {
        return topic;
    }
    /** Function to get the value of a field{@link Message#text}
     * @return Return text
     */
    public String getText() {
        return text;
    }
    /** Function to get the value of a field{@link Message#timeCreation}
     * @return Return timeCreation
     */
    public String getTimeCreation() {
        return timeCreation;
    }
    /** Function to get the value of a field{@link Message#creationDate}
     * @return Return creationDate
     */
    public String getCreationDate() {
        return creationDate;
    }
    /** Function to get the value of a field{@link Message#editingDate}
     * @return Return editingDate
     */
    public String getEditingDate() {
        return editingDate;
    }

    /**
     * Sets the given value
     *
     * @param author - author
     */
    public void setAuthor(String author) {
        this.author = author;
    }
    /**
     * Sets the given value
     *
     * @param topic - topic
     */
    public void setTopic(String topic) {
        this.topic = topic;
    }
    /**
     * Sets the given value
     *
     * @param text - text
     */
    public void setText(String text) {
        this.text = text;
    }
    /**
     * Sets the given value
     *
     * @param timeCreation - timeCreation
     */
    public void setTimeCreation(String timeCreation) {
        this.timeCreation = timeCreation;
    }
    /**
     * Sets the given value
     *
     * @param creationDate - creationDate
     */
    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }
    /**
     * Sets the given value
     *
     * @param editingDate - editingDate
     */
    public void setEditingDate(String editingDate) {
        this.editingDate = editingDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Message message = (Message) o;
        return Objects.equals(author, message.author) && Objects.equals(topic, message.topic) && Objects.equals(text, message.text) && Objects.equals(timeCreation, message.timeCreation) && Objects.equals(creationDate, message.creationDate) && Objects.equals(editingDate, message.editingDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, topic, text, timeCreation, creationDate, editingDate);
    }

    @Override
    public String toString() {
        return "=====Message=====" +
                "\n\tauthor: " + author +
                "\n\ttopic: " + topic +
                "\n\ttext: " + text +
                "\n\ttimeCreation: " + timeCreation +
                "\n\tcreationDate: " + creationDate +
                "\n\teditingDate: " + editingDate;
    }
}

