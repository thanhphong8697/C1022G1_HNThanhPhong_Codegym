package CaseStudy.services.interfaceService;

import CaseStudy.models.Person.Customer;

public interface ICustomerService extends IService {
    void editCustomer(Customer customer);
}
