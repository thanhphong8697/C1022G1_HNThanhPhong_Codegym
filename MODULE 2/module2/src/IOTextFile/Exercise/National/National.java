package IOTextFile.Exercise.National;

public class National {
    private int id;
    private String word;
    private String name;

    public National() {
    }

    public National(int id, String word, String name) {
        this.id = id;
        this.word = word;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "National{" +
                "id=" + id +
                ", word='" + word + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
