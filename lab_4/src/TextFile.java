public class TextFile {
    private String way;
    private String description;

    public TextFile(String way, String description) {
        this.way = way;
        this.description = description;

    }

    @Override
    public String toString() {
        return "Шлях: " + way + "\t" + "Опис файлу: " + description;
    }
}
