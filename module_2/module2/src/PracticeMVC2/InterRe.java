package PracticeMVC2;

public interface InterRe {
    void display();
    void add(Model model);
    void search(String string);
    void delete(String string);
    void sort();
    Model findId(String id);
    void update(Model model);

}
