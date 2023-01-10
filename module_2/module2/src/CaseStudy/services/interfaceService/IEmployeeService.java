package CaseStudy.services.interfaceService;

import CaseStudy.models.Person.Employee;

public interface IEmployeeService extends IService {
    void deleteEmployee(Employee employee);

    void editEmployee(Employee employee);
}
