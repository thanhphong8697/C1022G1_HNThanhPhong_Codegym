package CaseStudy.repository.interfaceRepo;

public interface IRepository {
    void display();

    void add(Object object);

    Object findID(String id);
}
