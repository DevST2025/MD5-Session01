package ra.academy.dao;

import ra.academy.model.Customer;

import java.util.List;

public interface ICustomerDao {
    List<Customer> findAll();
    Customer findById(Long id);
    void deleteById(Long id);
    void save(Customer customer);
}
