package PracticeMVC;

public interface InterSer {
    void display();
    void add(Worker worker);
    void search(String string);
    void delete(String string);
    void sort();
    void change(Worker worker);
    Worker findId(String string);
}
