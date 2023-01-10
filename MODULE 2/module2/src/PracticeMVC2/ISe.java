package PracticeMVC2;

public class ISe implements InterSe{
    InterRe interRe = new IRepo();
    @Override
    public void display() {
        interRe.display();
    }

    @Override
    public void add(Model model) {
        interRe.add(model);
    }

    @Override
    public void search(String string) {
        interRe.search(string);
    }

    @Override
    public void delete(String string) {
        interRe.delete(string);
    }

    @Override
    public void sort() {
        interRe.sort();
    }

    @Override
    public Model findId(String id) {
        return interRe.findId(id);
    }

    @Override
    public void update(Model model) {
        interRe.update(model);
    }
}
