package CaseStudy.repository.interfaceRepo;

import CaseStudy.models.Person.Employee;

public interface IEmployeeRepo extends IRepository {
    void deleteEmployee(Employee employee);

    void editEmployee(Employee employee);

}
