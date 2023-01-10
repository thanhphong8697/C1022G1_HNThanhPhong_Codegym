package CaseStudy.services.implService;

import CaseStudy.models.Person.Customer;
import CaseStudy.repository.implRepo.CustomerRepo;
import CaseStudy.repository.interfaceRepo.ICustomerRepo;
import CaseStudy.services.interfaceService.ICustomerService;

public class CustomerService implements ICustomerService {
    ICustomerRepo iCustomerRepo = new CustomerRepo();

    @Override
    public void editCustomer(Customer customer) {
        iCustomerRepo.editCustomer(customer);
    }

    @Override
    public void display() {
        iCustomerRepo.display();
    }

    @Override
    public void add(Object object) {
        Customer customer = (Customer) object;
        iCustomerRepo.add(customer);
    }

    @Override
    public Object findID(String id) {
        return iCustomerRepo.findID(id);
    }
}
