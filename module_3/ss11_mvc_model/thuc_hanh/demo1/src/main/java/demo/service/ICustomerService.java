package demo.service;

import demo.model.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> fillAll ();

    void save (Customer customer);

    Customer findById (int id);

    void update (int id, Customer customer);

    void remove (int id);
}
