package PracticeMVC;

import java.util.Arrays;

public class IWorkerSer implements InterSer {
    InterRepo interRepo = new IWorkerRepo();
    @Override
    public void display() {
        interRepo.display();
    }

    @Override
    public void add(Worker worker) {
        interRepo.add(worker);
    }

    @Override
    public void search(String string) {
        interRepo.search(string);
    }

    @Override
    public void delete(String string) {
        interRepo.delete(string);
    }

    @Override
    public void sort() {
        interRepo.sort();
    }

    @Override
    public void change(Worker worker) {
        interRepo.change(worker);
    }

    @Override
    public Worker findId(String string) {
        return interRepo.findId(string);
    }
}
