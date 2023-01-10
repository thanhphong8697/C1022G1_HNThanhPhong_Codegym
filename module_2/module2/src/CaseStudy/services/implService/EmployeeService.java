package CaseStudy.services.implService;

import CaseStudy.models.Person.Employee;
import CaseStudy.repository.implRepo.EmployeeRepo;
import CaseStudy.repository.interfaceRepo.IEmployeeRepo;
import CaseStudy.services.interfaceService.IEmployeeService;

public class EmployeeService implements IEmployeeService {
    IEmployeeRepo iEmployeeRepo = new EmployeeRepo();

    @Override
    public void deleteEmployee(Employee employee) {
        iEmployeeRepo.deleteEmployee(employee);
    }

    @Override
    public void editEmployee(Employee employee) {
        iEmployeeRepo.editEmployee(employee);
    }

    @Override
    public void display() {
        iEmployeeRepo.display();
    }

    @Override
    public void add(Object object) {
        Employee employee = (Employee) object;
        iEmployeeRepo.add(employee);
    }

    @Override
    public Object findID(String id) {
        return iEmployeeRepo.findID(id);
    }
}

