package CaseStudy.repository.interfaceRepo;

import CaseStudy.models.Person.Customer;

public interface ICustomerRepo extends IRepository {
    void editCustomer(Customer customer);
}
