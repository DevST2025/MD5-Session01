package ra.academy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ra.academy.dao.ICustomerDao;
import ra.academy.model.Customer;
import ra.academy.service.ICustomerService;

import java.util.List;

@Service
public class CustomerService implements ICustomerService {
    @Autowired
    private ICustomerDao customerDao;
    @Override
    public List<Customer> findAll() {
        return customerDao.findAll();
    }

    @Override
    public Customer findById(Long id) {
        return customerDao.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        customerDao.deleteById(id);
    }

    @Override
    public void save(Customer customer) {
        customerDao.save(customer);
    }
}
